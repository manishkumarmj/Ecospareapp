package com.project.ecospare

import android.os.Bundle
import android.widget.GridView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class sell_page : AppCompatActivity() {
    lateinit var gridView: GridView
    var imageList=ArrayList<Int>()
    var nameList= ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sell_page)
       gridView=findViewById(R.id.gridView)
        fillArray()
        val adapter=componentAdapter(this,nameList,imageList,)
        gridView.adapter=adapter
    }
    fun fillArray(){
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