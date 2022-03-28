package com.straight.tradic.board

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.view.isVisible
import androidx.databinding.DataBindingUtil
import com.bumptech.glide.Glide
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import com.google.firebase.ktx.Firebase
import com.google.firebase.storage.ktx.storage
import com.straight.tradic.R
import com.straight.tradic.comment.CommentLVAdapter
import com.straight.tradic.comment.CommentModel
import com.straight.tradic.databinding.ActivityBoardInsideBinding
import com.straight.tradic.databinding.ActivityBoardWriteBinding
import com.straight.tradic.utils.FBAuth
import com.straight.tradic.utils.FBRef
import java.lang.Exception

class BoardInsideActivity : AppCompatActivity() {

    private val TAG = BoardInsideActivity::class.java.simpleName
    private lateinit var binding : ActivityBoardInsideBinding
    private lateinit var key : String
    private val commentDataList = mutableListOf<CommentModel>()
    private lateinit var commentAdapter : CommentLVAdapter

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_board_inside)

        binding.boardSettingIcon.setOnClickListener{
            showDialog()
        }

//      방법1
//      val title = intent.getStringExtra("title").toString()
//      val content = intent.getStringExtra("content").toString()
//      val time = intent.getStringExtra("time").toString()
//
//      binding.titleArea.text = title
//      binding.textArea.text = content
//      binding.timeArea.text = time

//      방법2
        key = intent.getStringExtra("key").toString()
        getBoardData(key.toString())
        getImageData(key.toString())

        binding.commentBtn.setOnClickListener{
            insertComment(key)
        }
        getCommentData(key)

        commentAdapter = CommentLVAdapter(commentDataList)
        binding.commentLV.adapter = commentAdapter
    }
    fun getCommentData(key : String){
        val postListener = object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {

                commentDataList.clear()

                for (dataModel in dataSnapshot.children) {
                    val item = dataModel.getValue(CommentModel::class.java)
                    commentDataList.add(item!!)
                }
                commentAdapter.notifyDataSetChanged()
            }
            override fun onCancelled(databaseError: DatabaseError) {
                Log.w(TAG,"",databaseError.toException())
            }
        }
        FBRef.commentRef.child(key).addValueEventListener(postListener)
    }
        fun insertComment(key: String){

            FBRef.commentRef
                .child(key)
                .push()
                .setValue(
                    CommentModel(
                        binding.commentArea.text.toString(),
                        FBAuth.getTime()
                    )
                )

            Toast.makeText(this, "댓글 입력 완료",Toast.LENGTH_LONG).show()
            binding.commentArea.setText("")
    }
        private fun showDialog(){

            val mDialogView = LayoutInflater.from(this).inflate(R.layout.custom_dialog, null)
            val mBuilder = AlertDialog.Builder(this)
                .setView(mDialogView)
                .setTitle("게시글 수정/삭제")

            val alertDialog =  mBuilder.show()
            alertDialog.findViewById<Button>(R.id.editBtn)?.setOnClickListener{
                Toast.makeText(this,"수정",Toast.LENGTH_LONG).show()

                val intent = Intent(this, BoardEditActivity::class.java)
                intent.putExtra("key",key)
                startActivity(intent)
        }
        //게시글 삭제시 튕김문제 ->
        alertDialog.findViewById<Button>(R.id.removeBtn)?.setOnClickListener{
            FBRef.boardRef.child(key).removeValue()
            Toast.makeText(this,"삭제",Toast.LENGTH_LONG).show()
            finish()
        }
    }
    private fun getImageData(key : String){

        val storageReference = Firebase.storage.reference.child(key + ".png")
        val imageViewFromFB = binding.getImageArea

        storageReference.downloadUrl.addOnCompleteListener(OnCompleteListener { task ->
            if(task.isSuccessful) {

                //성공시 이미지를 불러오기
                Glide.with(this)
                    .load(task.result)
                    .into(imageViewFromFB)

            } else {
                //성공하지 못하면 안보이게 하기
                binding.getImageArea.isVisible = false

            }
        })
    }
    //자동으로 데이터 변경시 파이어베이스에서 데이터 받아옴
    private fun getBoardData(key : String){

        val postListener = object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {

                // 예외처리 에러뜨면 catch가 실행
                try {
                    val dataModel = dataSnapshot.getValue(BoardModel::class.java)
                    Log.d(TAG, dataModel!!.title)

                    binding.titleArea.text = dataModel!!.title
                    binding.textArea.text = dataModel!!.content
                    binding.timeArea.text = dataModel!!.time

                    val myUid = FBAuth.getUid()
                    val writerUid = dataModel.uid

                    //작성자의 uid와 나의 uid가 같으면 수정 삭제 버튼이 보이게 한다
                    if(myUid.equals(writerUid)){
                        binding.boardSettingIcon.isVisible = true
                    } else{
                    }
                } catch (e : Exception){

                    Log.d(TAG,"삭제")
                }
            }
            override fun onCancelled(databaseError: DatabaseError) {

                Log.w(TAG, "loadPost:onCancelled", databaseError.toException())
            }
        }
        FBRef.boardRef.child(key).addValueEventListener(postListener)
    }

}