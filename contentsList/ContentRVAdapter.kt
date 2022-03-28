package com.straight.tradic.contentsList

import android.content.Context
import android.content.Intent
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.straight.tradic.R

class ContentRVAdapter(val context : Context, val items : ArrayList<ContentModel>) : RecyclerView.Adapter<ContentRVAdapter.Viewholder>() {

//    interface ItemClick {
//        fun onClick(view : View, position: Int)
//    }
//    var itemClick : ItemClick? = null

    // 전체 아이템을 가져와서 하나하나씩 넣어주기 위함
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContentRVAdapter.Viewholder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.content_rv_item, parent, false)

        return Viewholder(v)
    }
    override fun onBindViewHolder(holder: ContentRVAdapter.Viewholder, position: Int) {

//        if(itemClick != null){
//            holder.itemView.setOnClickListener{ v->
//                itemClick?.onClick(v, position)
//            }
//        }
        holder.bindItems(items[position])
    }
    //아이템의 갯수가 몇 개인지
    override fun getItemCount(): Int {
        return items.size
    }
    inner class Viewholder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bindItems(item : ContentModel) {
            itemView.setOnClickListener{
                Toast.makeText(context, item.title, Toast.LENGTH_LONG).show()
                val intent = Intent(context, ContentShowActivity::class.java)
                intent.putExtra("url", item.webUrl)
                itemView.context.startActivity(intent)
            }
            val contentTitle = itemView.findViewById<TextView>(R.id.textArea)
            val imageViewArea = itemView.findViewById<ImageView>(R.id.imageArea)
            contentTitle.text = item.title
            // 이미지url에 있는것을 이미지뷰에어리어에 넣기
            Glide.with(context)
                .load(item.imageUrl)
                .into(imageViewArea)
        }
    }
}