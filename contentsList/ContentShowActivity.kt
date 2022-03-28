package com.straight.tradic.contentsList

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.Toast
import com.straight.tradic.R

class ContentShowActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_content_show)
        //url 데이터 받기
        val getUrl = intent.getStringExtra("url")
        //웹뷰로 이동 문자열로 읽기
        val webView : WebView = findViewById(R.id.webView)
        webView.loadUrl(getUrl.toString())
    }
}