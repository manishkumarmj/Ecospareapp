package com.project.ecospare

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Buy_sellpage : AppCompatActivity() {
    lateinit var sellImage: ImageView
    lateinit var sell: Button
    lateinit var buyImage: ImageView
    lateinit var buy: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_buy_sellpage)

        sellImage = findViewById(R.id.imageView2)
        sell = findViewById(R.id.Sell)
        buyImage = findViewById(R.id.imageView3)
        buy = findViewById(R.id.Buy)

        sell.setOnClickListener {
            val intent = Intent(this, sell_page::class.java)
            startActivity(intent)
        }


    }
}
