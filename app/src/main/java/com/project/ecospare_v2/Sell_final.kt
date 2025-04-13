package com.project.ecospare_v2

import android.content.Intent
import android.os.Bundle
import android.widget.GridView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Sell_final : AppCompatActivity() {
    lateinit var gridView:GridView
    var nameList=ArrayList<String>()
    var imageList = ArrayList<Int>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sell_final)
        gridView=findViewById(R.id.gridView)
        fillArrays()
        val adapter = sellwalapage(this,nameList,imageList )
        gridView.adapter =adapter
        gridView.setOnItemClickListener { adapterView, view, postion, id ->
            Toast.makeText(applicationContext,"${nameList[postion]} added to cart " , Toast.LENGTH_LONG).show()
            val intent = Intent(this, carts::class.java)
            startActivity(intent)
        }
    }
    fun fillArrays(){
        imageList.add(R.drawable.cpucooler  )
        imageList.add(R.drawable.cpu)
        imageList.add(R.drawable.gpu)
        imageList.add(R.drawable.keyboard)
        imageList.add(R.drawable.nvme)
        imageList.add(R.drawable.motherbord  )
        imageList.add(R.drawable.ram)
        imageList.add(R.drawable.nvme)
        imageList.add(R.drawable.psu)
        imageList.add(R.drawable.ram)
        imageList.add(R.drawable.soundcard)
        nameList.add("Cpu cooler")
        nameList.add("Cpu")
        nameList.add("Gpu")
        nameList.add("Keyboard")
        nameList.add("Memory")
        nameList.add("MotherBoard")
        nameList.add("Mouse")
        nameList.add("Nvme")
        nameList.add("Psu")
        nameList.add("Ram")
        nameList.add("Sound_card")
    }
}