package com.example.madpractical6_20012021014_1

import android.content.Intent

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import androidx.core.view.WindowCompat
import com.example.madpractical6_20012021014_1.databinding.ActivityMainBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mediaController= MediaController(this)
        val uri: Uri =Uri.parse("android.resource://"+packageName+"/"+R.raw.thestoryoflight)
        val myVideoView=findViewById<VideoView>(R.id.videoView)
        myVideoView.setMediaController(mediaController)
        mediaController.setAnchorView(myVideoView)
        myVideoView.setVideoURI(uri)
        myVideoView.requestFocus()
        myVideoView.start()
        val button=findViewById<FloatingActionButton>(R.id.btn)
        button.setOnClickListener {
            val intent = Intent(this, YouTubeActivity::class.java)
            startActivity(intent)
        }
    }
}