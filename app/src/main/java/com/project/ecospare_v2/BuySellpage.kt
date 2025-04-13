package com.project.ecospare_v2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class BuySellpage : AppCompatActivity() {
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
            val intent = Intent(this, Sell_final ::class.java)
            startActivity(intent)
        }

        buy.setOnClickListener {
            val buyAction= Intent(this,Sell_final ::class.java)
            startActivity(buyAction)
        }


    }
}