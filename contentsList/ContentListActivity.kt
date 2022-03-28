package com.straight.tradic.contentsList

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import com.straight.tradic.R

class ContentListActivity : AppCompatActivity() {

    lateinit var myRef: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_content_list)
        val items = ArrayList<ContentModel>()
        items.add(
            ContentModel(
                "프링글스통",
                "https://blisgo.com/wp-content/uploads/elementor/thumbs/%ED%94%84%EB%A7%81%EA%B8%80%EC%8A%A4-%ED%86%B5-ovji8lu5cfcsdjkuoa12ap568lry3vf1x9sh9imhhc.jpg",
                "https://blisgo.com/%EC%9D%BC%EB%B0%98%EC%93%B0%EB%A0%88%EA%B8%B0/%ED%94%84%EB%A7%81%EA%B8%80%EC%8A%A4-%EB%B6%84%EB%A6%AC-%EC%88%98%EA%B1%B0/"
            )
        )
        items.add(
            ContentModel(
                "종이컵",
                "https://blisgo.com/wp-content/uploads/elementor/thumbs/%EC%A2%85%EC%9D%B4%EC%BB%B5-osscytrb6722a1yp3mvbn5mhg59g6n0o03y3dbmscg.jpg",
                "https://blisgo.com/%EC%A2%85%EC%9D%B4%ED%8C%A9/%EC%A2%85%EC%9D%B4%EC%BB%B5-%EB%B6%84%EB%A6%AC-%EC%88%98%EA%B1%B0/"
            )
        )
        items.add(
            ContentModel(
                "전선",
                "https://blisgo.com/wp-content/uploads/elementor/thumbs/%EC%A0%84%EC%84%A0-pfdcii80ore8sh5v4847vde15ytpcor1wqeu87ft34.jpg",
                "https://blisgo.com/%ED%8F%90%EA%B0%80%EC%A0%84%EC%A0%9C%ED%92%88/%EC%A0%84%EC%84%A0-%EB%B6%84%EB%A6%AC%EC%88%98%EA%B1%B0/"
            )
        )
        items.add(
            ContentModel(
                "온수매트",
                "https://blisgo.com/wp-content/uploads/elementor/thumbs/%EC%98%A8%EC%88%98%EB%A7%A4%ED%8A%B8-pfdcigccb3bo598lf7ayqdv3z72yxajl8h3v9nilfk.jpg",
                "https://blisgo.com/%EB%8C%80%ED%98%95%EC%83%9D%ED%99%9C%ED%8F%90%EA%B8%B0%EB%AC%BC/%EC%98%A8%EC%88%98%EB%A7%A4%ED%8A%B8-%EB%B2%84%EB%A6%AC%EA%B8%B0/"
            )
        )
        items.add(
            ContentModel(
                "스피커",
                "https://blisgo.com/wp-content/uploads/elementor/thumbs/%EC%8A%A4%ED%94%BC%EC%BB%A4-pfdcigccb3bo598lf7ayqdv3z72yxajl8h3v9nilfk.jpg",
                "https://blisgo.com/%ED%8F%90%EA%B0%80%EC%A0%84%EC%A0%9C%ED%92%88/%EC%8A%A4%ED%94%BC%EC%BB%A4-%EB%B2%84%EB%A6%AC%EB%8A%94-%EB%B0%A9%EB%B2%95/"
            )
        )
        items.add(
            ContentModel(
                "지갑",
                "https://blisgo.com/wp-content/uploads/elementor/thumbs/%EC%A7%80%EA%B0%91-pelwkun1tip0uk9ek9wx9qohbbetxmkdr328eeznk0.jpg",
                "https://blisgo.com/%EC%9D%BC%EB%B0%98%EC%93%B0%EB%A0%88%EA%B8%B0/%EC%A7%80%EA%B0%91-%EB%B2%84%EB%A6%AC%EB%8A%94-%EB%B2%95/"
            )
        )
        items.add(
            ContentModel(
                "방석",
                "https://blisgo.com/wp-content/uploads/elementor/thumbs/%EB%B0%A9%EC%84%9D-pelwktp7monqiyarpriap8x0pxjgpxgneyeqx511q8.jpg",
                "https://blisgo.com/%EC%9D%BC%EB%B0%98%EC%93%B0%EB%A0%88%EA%B8%B0/%EB%B0%A9%EC%84%9D-%EB%B2%84%EB%A6%AC%EA%B8%B0/"
            )
        )
        items.add(
            ContentModel(
                "수건",
                "https://blisgo.com/wp-content/uploads/elementor/thumbs/%EC%88%98%EA%B1%B4-pelwkun1tip0uk9ek9wx9qohbbetxmkdr328eeznk0.jpg",
                "https://blisgo.com/%EC%9D%BC%EB%B0%98%EC%93%B0%EB%A0%88%EA%B8%B0/%EC%88%98%EA%B1%B4-%EB%B2%84%EB%A6%AC%EA%B8%B0/"
            )
        )
        items.add(
            ContentModel(
                "노트북 배터리",
                "https://blisgo.com/wp-content/uploads/elementor/thumbs/%EB%85%B8%ED%8A%B8%EB%B6%81%EB%B0%B0%ED%84%B0%EB%A6%AC-pelwksrdfumg7cc4v93o4r5k4jo3i8cx2tr9fv2fwg.jpg",
                "https://blisgo.com/%ED%8F%90%EA%B1%B4%EC%A0%84%EC%A7%80-%EC%A0%84%EC%9A%A9-%EC%88%98%EA%B1%B0%ED%95%A8/%EB%85%B8%ED%8A%B8%EB%B6%81-%EB%B0%B0%ED%84%B0%EB%A6%AC-%EB%B2%84%EB%A6%AC%EB%8A%94-%EB%B2%95/"
            )
        )
        items.add(
            ContentModel(
                "레깅스",
                "https://blisgo.com/wp-content/uploads/elementor/thumbs/%EB%A0%88%EA%B9%85%EC%8A%A4-pelwksrdfumg7cc4v93o4r5k4jo3i8cx2tr9fv2fwg.jpg",
                "https://blisgo.com/%EC%9D%98%EB%A5%98%EC%88%98%EA%B1%B0%ED%95%A8/%EB%A0%88%EA%B9%85%EC%8A%A4-%EB%B2%84%EB%A6%AC%EA%B8%B0/"
            )
        )
        items.add(
            ContentModel(
                "형광등",
                "https://blisgo.com/wp-content/uploads/elementor/thumbs/%ED%98%95%EA%B4%91%EB%93%B1-ox53vrazcr5k20m6dne0hqnetbr0utbe6624esm8e8.jpg",
                "https://blisgo.com/%ED%98%95%EA%B4%91%EB%93%B1-%EC%A0%84%EC%9A%A9-%EC%88%98%EA%B1%B0%ED%95%A8/%ED%98%95%EA%B4%91%EB%93%B1-%EB%B2%84%EB%A6%AC%EB%8A%94-%EB%B2%95/"
            )
        )
        items.add(
            ContentModel(
                "깨진유리",
                "https://blisgo.com/wp-content/uploads/elementor/thumbs/%EA%B9%A8%EC%A7%84-%EC%9C%A0%EB%A6%AC-ovs94eqgdb7q23oyjqp7znby5n1prgrosaaqw8x0cg.jpg",
                "https://blisgo.com/%EB%B6%88%EC%97%B0%EC%84%B1%EC%93%B0%EB%A0%88%EA%B8%B0/%EA%B9%A8%EC%A7%84-%EC%9C%A0%EB%A6%AC-%EB%B2%84%EB%A6%AC%EA%B8%B0//"
            )
        )
        items.add(
            ContentModel(
                "나무",
                "https://blisgo.com/wp-content/uploads/elementor/thumbs/%EB%82%98%EB%AC%B4-ovjjx3q77k65m1pcexfn9xk6mdleikl4kpci7mxb0g.jpg",
                "https://blisgo.com/%EC%9D%BC%EB%B0%98%EC%93%B0%EB%A0%88%EA%B8%B0/%EB%82%98%EB%AC%B4-%EB%AA%A9%EC%9E%AC-%EB%B2%84%EB%A6%AC%EB%8A%94-%EB%B2%95/"
            )
        )
        items.add(
            ContentModel(
                "베개",
                "https://blisgo.com/wp-content/uploads/elementor/thumbs/%EB%B2%A0%EA%B0%9C-ox8ambaw1hkn5wr4u3s4ieq278rnw1c2qipmyk79j4.jpg",
                "https://blisgo.com/%EC%9D%BC%EB%B0%98%EC%93%B0%EB%A0%88%EA%B8%B0/%EB%B2%A0%EA%B0%9C-%EB%B2%84%EB%A6%AC%EB%8A%94-%EB%B2%95/"
            )
        )
        items.add(
            ContentModel(
                "라텍스",
                "https://blisgo.com/wp-content/uploads/elementor/thumbs/%EB%9D%BC%ED%85%8D%EC%8A%A4-pd3a1ph6azhb685nh6nzb5d1txnuyjr5bnpikdnl6o.jpg",
                "https://blisgo.com/%EC%9D%BC%EB%B0%98%EC%93%B0%EB%A0%88%EA%B8%B0/%EB%9D%BC%ED%85%8D%EC%8A%A4-%EB%B2%84%EB%A6%AC%EA%B8%B0/"
            )
        )
        items.add(
            ContentModel(
                "온수매트",
                "https://blisgo.com/wp-content/uploads/elementor/thumbs/%EC%98%A8%EC%88%98%EB%A7%A4%ED%8A%B8-pfdcigccb3bo598lf7ayqdv3z72yxajl8h3v9nilfk.jpg",
                "https://blisgo.com/%EB%8C%80%ED%98%95%EC%83%9D%ED%99%9C%ED%8F%90%EA%B8%B0%EB%AC%BC/%EC%98%A8%EC%88%98%EB%A7%A4%ED%8A%B8-%EB%B2%84%EB%A6%AC%EA%B8%B0/"
            )
        )
        items.add(
            ContentModel(
                "컴퓨터",
                "https://blisgo.com/wp-content/uploads/elementor/thumbs/%EC%BB%B4%ED%93%A8%ED%84%B0-p0iunq9vas1ggkek5wrudii9oecrsqv68ipm5uoiyo.jpg",
                "https://blisgo.com/%ED%8F%90%EA%B0%80%EC%A0%84%EC%A0%9C%ED%92%88/%EC%BB%B4%ED%93%A8%ED%84%B0-%EB%B2%84%EB%A6%AC%EA%B8%B0/"
            )
        )

        items.add(
            ContentModel(
                "노트북",
                "https://blisgo.com/wp-content/uploads/elementor/thumbs/%EB%85%B8%ED%8A%B8%EB%B6%81-p0rlb5fzdufcmaoxz90rc2u2wqxpthxyy1t0qrefb4.jpg",
                "https://blisgo.com/%ED%8F%90%EA%B0%80%EC%A0%84%EC%A0%9C%ED%92%88/%EB%85%B8%ED%8A%B8%EB%B6%81-%EB%B2%84%EB%A6%AC%EA%B8%B0/"
            )
        )
        items.add(
            ContentModel(
                "가전제품",
                "https://blisgo.com/wp-content/uploads/elementor/thumbs/%EA%B0%80%EC%A0%84%EC%A0%9C%ED%92%88-oz7ur6e9sotoc5h3buq9tkpapkusx04w36d14gecqo.jpg",
                "https://blisgo.com/%ED%8F%90%EA%B0%80%EC%A0%84%EC%A0%9C%ED%92%88/%EA%B0%80%EC%A0%84-%EC%A0%9C%ED%92%88-%EB%B2%84%EB%A6%AC%EA%B8%B0/"
            )
        )
        items.add(
            ContentModel(
                "세탁기",
                "https://blisgo.com/wp-content/uploads/elementor/thumbs/%EC%84%B8%ED%83%81%EA%B8%B0-p52gwe5598o9v1w1wm0lx9ta8rhgxwcxvyf3t20jcw.jpg",
                "https://blisgo.com/%ED%8F%90%EA%B0%80%EC%A0%84%EC%A0%9C%ED%92%88/%EC%84%B8%ED%83%81%EA%B8%B0-%EB%B2%84%EB%A6%AC%EB%8A%94-%EB%B0%A9%EB%B2%95/"
            )
        )
        items.add(
            ContentModel(
                "TV",
                "https://blisgo.com/wp-content/uploads/elementor/thumbs/TV-p3r7hrtymn6yn9tzi6zph5igsxzrvin7pjaahkx3i8.jpg",
                "https://blisgo.com/%ED%8F%90%EA%B0%80%EC%A0%84%EC%A0%9C%ED%92%88/tv-%EB%B2%84%EB%A6%AC%EA%B8%B0/"
            )
        )
        items.add(
            ContentModel(
                "후라이팬",
                "https://blisgo.com/wp-content/uploads/elementor/thumbs/%EB%B9%84%EC%B2%A0%EA%B8%88%EC%86%8D-osn9dcw8np6yjol2r5mfdj67n4hodsvxma0ou5k2rk.jpg",
                "https://blisgo.com/%EC%BA%94%EB%A5%98/%ED%9B%84%EB%9D%BC%EC%9D%B4-%ED%8C%AC-%EB%B2%84%EB%A6%AC%EA%B8%B0/"
            )
        )
        items.add(
            ContentModel(
                "조리기구",
                "https://blisgo.com/wp-content/uploads/elementor/thumbs/%EC%A1%B0%EB%A6%AC-%EA%B8%B0%EA%B5%AC-oyct8odzhwavxqir6zy4elnrpbvc6du6wos1dqk8w0.jpg",
                "https://blisgo.com/%EC%BA%94%EB%A5%98/%EC%A1%B0%EB%A6%AC%EA%B8%B0%EA%B5%AC-%EB%B6%84%EB%A6%AC%EC%88%98%EA%B1%B0/"
            )
        )
        items.add(
            ContentModel(
                "냄비",
                "https://blisgo.com/wp-content/uploads/elementor/thumbs/%EB%83%84%EB%B9%84-ouwom5yko0p6b3wxzu1tbpqn465av122lkxksivgn4.jpg",
                "https://blisgo.com/%EC%BA%94%EB%A5%98/%EB%83%84%EB%B9%84-%EB%B6%84%EB%A6%AC%EC%88%98%EA%B1%B0/"
            )
        )
        items.add(
            ContentModel(
                "식사 도구",
                "https://blisgo.com/wp-content/uploads/elementor/thumbs/%EC%8B%9D%EC%82%AC-%EB%8F%84%EA%B5%AC-oycpak6g6nr6k6yc22frwypud2chdun719w68na3nk.jpg",
                "https://blisgo.com/%EC%BA%94%EB%A5%98/%EC%8B%9D%EA%B8%B0%EB%A5%98-%EB%B6%84%EB%A6%AC%EC%88%98%EA%B1%B0/"
            )
        )
        items.add(
            ContentModel(
                "텀블러",
                "https://blisgo.com/wp-content/uploads/elementor/thumbs/%ED%85%80%EB%B8%94%EB%9F%AC-pcwcn0ixhqbrn87jqlg09e2l5ihxmjyqj95158gb28.jpg",
                "https://blisgo.com/%EC%BA%94%EB%A5%98/%ED%85%80%EB%B8%94%EB%9F%AC-%EB%B6%84%EB%A6%AC%EC%88%98%EA%B1%B0/"
            )
        )
        items.add(
            ContentModel(
                "고철",
                "https://blisgo.com/wp-content/uploads/elementor/thumbs/%EA%B3%A0%EC%B2%A0-osb07cr8ufxduq2yi2m5latzvcv6zafkpnodztyo74.jpg",
                "https://blisgo.com/%EC%BA%94%EB%A5%98/%EA%B3%A0%EC%B2%A0-%EB%B6%84%EB%A6%AC-%EC%88%98%EA%B1%B0/"
            )
        )
        items.add(
            ContentModel(
                "통조림 캔",
                "https://blisgo.com/wp-content/uploads/elementor/thumbs/%EC%8A%A4%ED%8C%B8%EC%BA%94-outa7it8l4c52gt5p1elxprydxxgyazneq1townb40.jpg",
                "https://blisgo.com/%EC%BA%94%EB%A5%98/%EC%8A%A4%ED%8C%B8-%EC%BA%94-%EB%B6%84%EB%A6%AC%EC%88%98%EA%B1%B0/"
            )
        )
        items.add(
            ContentModel(
                "참치 캔",
                "https://blisgo.com/wp-content/uploads/elementor/thumbs/%EC%B0%B8%EC%B9%98%EC%BA%94-os7bthmcwvtfmwrlt01qay7mdz7hesa24teebccwlc.jpg",
                "https://blisgo.com/%EC%BA%94%EB%A5%98/%EC%B0%B8%EC%B9%98-%EC%BA%94-%EB%B6%84%EB%A6%AC%EC%88%98%EA%B1%B0/"
            )
        )
        items.add(
            ContentModel(
                "가스용기",
                "https://blisgo.com/wp-content/uploads/elementor/thumbs/%EA%B0%80%EC%8A%A4%EC%9A%A9%EA%B8%B0-1-ouvai65k2r6010bg21qdwy2zy1t1zjbnwmxqyloagw.jpg",
                "https://blisgo.com/%EC%BA%94%EB%A5%98/%EA%B0%80%EC%8A%A4%EC%9A%A9%EA%B8%B0-%EB%B2%84%EB%A6%AC%EB%8A%94-%EB%B2%95/"
            )
        )
        items.add(
            ContentModel(
                "스티로폼",
                "https://blisgo.com/wp-content/uploads/elementor/thumbs/%EC%8A%A4%ED%8B%B0%EB%A1%9C%ED%8F%BC-oszhfwr3mag9xue8dopf07wxtokjpnpvfmmbjdnchs.jpg",
                "https://blisgo.com/%EC%8A%A4%ED%8B%B0%EB%A1%9C%ED%8F%BC/%EC%8A%A4%ED%8B%B0%EB%A1%9C%ED%8F%BC-%EB%B6%84%EB%A6%AC%EC%88%98%EA%B1%B0/"
            )
        )
//        items.add(
//            ContentModel(
//                "",
//                "",
//                " "
//            )
//        )

//        items.add(
//            ContentModel(
//                "",
//                "",
//                " "
//            )
//        )



        val rvAdapter = ContentRVAdapter(baseContext, items)

        val database = Firebase.database

        val category = intent.getStringExtra("category")

        //카테고리1일때 myref에서 컨탠츠 데이터 가져오기
        if (category == "category1") {

            myRef = database.getReference("contents")

            //카테고리2일때 myref에서 컨탠츠2 데이터 가져오기
        } else if (category == "category2") {
            myRef = database.getReference("contents2")

        } else if (category == "category3") {
            myRef = database.getReference("contents3")
        }
            val postListener = object : ValueEventListener {
                override fun onDataChange(dataSnapshot: DataSnapshot) {

                    for (dataModel in dataSnapshot.children) {
                        Log.d("ContentListActivity", dataSnapshot.toString())
                        val item = dataModel.getValue(ContentModel::class.java)
                        items.add(item!!)

                    }
                    //동기화시키기
                    rvAdapter.notifyDataSetChanged()
                    Log.d("ContentListActivity", dataSnapshot.toString())

                }

                override fun onCancelled(databaseError: DatabaseError) {

                    Log.w(
                        "ContentListActivity",
                        "loadPost:onCancelled",
                        databaseError.toException()
                    )
                }
            }
            myRef.addValueEventListener(postListener)

            val rv: RecyclerView = findViewById(R.id.rv)
            // 어댑터에 있는 것을 rv어댑터에 이동

            rv.adapter = rvAdapter

            rv.layoutManager = GridLayoutManager(this, 2)

//      아이템 클릭해주는 부분
//        rvAdapter.itemClick = object : ContentRVAdapter.ItemClick {
//            override fun onClick(view: View, position: Int) {
//                Toast.makeText(baseContext, items[position].title, Toast.LENGTH_LONG).show()
//
//                //url 데이터로 넘어가기
//                val intent = Intent(this@ContentListActivity, ContentShowActivity::class.java)
//                intent.putExtra("url", items[position].webUrl)
//                startActivity(intent)
//            }
//        }
//
//            val myRef2 = database.getReference("contents3")
//            myRef2.push().setValue(
//                ContentModel(
//                    "소파",
//                    "https://blisgo.com/wp-content/uploads/elementor/thumbs/%EC%87%BC%ED%8C%8C-p1ry5x7zc2h0fa1qg3k3lbjuueibgz786be5h9xf5s.jpg",
//                    "https://blisgo.com/%EB%8C%80%ED%98%95%EC%83%9D%ED%99%9C%ED%8F%90%EA%B8%B0%EB%AC%BC/%EC%86%8C%ED%8C%8C-%EB%B2%84%EB%A6%AC%EA%B8%B0/"
//                )
//            )
//            myRef2.push().setValue(
//                ContentModel(
//                    "가구",
//                    "https://blisgo.com/wp-content/uploads/elementor/thumbs/%EA%B0%80%EA%B5%AC-p1c7qgd7uc38h9skarvso1br11gk5ohh9x3znok7pc.jpg",
//                    "https://blisgo.com/%EB%8C%80%ED%98%95%EC%83%9D%ED%99%9C%ED%8F%90%EA%B8%B0%EB%AC%BC/%EA%B0%80%EA%B5%AC-%EB%B2%84%EB%A6%AC%EA%B8%B0/"
//                )
//            )
//            myRef2.push().setValue(
//                ContentModel(
//                    "의자",
//                    "https://blisgo.com/wp-content/uploads/elementor/thumbs/%EC%9D%98%EC%9E%90-p1jhevl0epxs383qnay2hbqhm7e8szws4ol262t1q8.jpg",
//                    "https://blisgo.com/%EB%8C%80%ED%98%95%EC%83%9D%ED%99%9C%ED%8F%90%EA%B8%B0%EB%AC%BC/%EC%9D%98%EC%9E%90-%EB%B2%84%EB%A6%AC%EA%B8%B0/"
//                )
//            )

//        val myRef4 = database.getReference("contents4")
//        myRef4.push().setValue(
//            ContentModel("title7","https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2Fdwg3fb%2FbtrmDQ9iRWj%2F4T5dE4umnEo9VX7GylLgk0%2Fimg.png","https://straight96.tistory.com/2")
//        )
//        myRef4.push().setValue(
//            ContentModel("title8","https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2Fdwg3fb%2FbtrmDQ9iRWj%2F4T5dE4umnEo9VX7GylLgk0%2Fimg.png","https://straight96.tistory.com/2")
//        )
//        myRef4.push().setValue(
//            ContentModel("title9","https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2Fdwg3fb%2FbtrmDQ9iRWj%2F4T5dE4umnEo9VX7GylLgk0%2Fimg.png","https://straight96.tistory.com/2")
//        )
//
//        val myRef5 = database.getReference("contents5")
//        myRef5.push().setValue(
//            ContentModel("title10","https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2Fdwg3fb%2FbtrmDQ9iRWj%2F4T5dE4umnEo9VX7GylLgk0%2Fimg.png","https://straight96.tistory.com/2")
//        )
//        myRef5.push().setValue(
//            ContentModel("title11","https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2Fdwg3fb%2FbtrmDQ9iRWj%2F4T5dE4umnEo9VX7GylLgk0%2Fimg.png","https://straight96.tistory.com/2")
//        )
//        myRef5.push().setValue(
//            ContentModel("title12","https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2Fdwg3fb%2FbtrmDQ9iRWj%2F4T5dE4umnEo9VX7GylLgk0%2Fimg.png","https://straight96.tistory.com/2")
//        )


    }
}
