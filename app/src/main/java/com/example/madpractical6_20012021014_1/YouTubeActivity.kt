package com.example.madpractical6_20012021014_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class YouTubeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_you_tube)
        val youTubeId=""
        val myWebView=findViewById<WebView>(R.id.webView)
        val settings=myWebView.settings
        settings.javaScriptEnabled=true
        settings.loadWithOverviewMode=true
        settings.useWideViewPort=true
        myWebView.loadUrl("https://www.youtube.com/embed/$youTubeId")
    }
}