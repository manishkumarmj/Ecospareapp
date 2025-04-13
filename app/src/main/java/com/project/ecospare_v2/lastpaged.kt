package com.project.ecospare_v2

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class lastpaged : AppCompatActivity() {
    lateinit var check: ImageView
    lateinit var place: TextView
    lateinit var connect: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_lastpaged)
        check=findViewById(R.id.imageView7)
        place=findViewById(R.id.textView5)
        connect=findViewById(R.id.textView6)
    }
}