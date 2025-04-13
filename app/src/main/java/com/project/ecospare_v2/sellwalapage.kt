package com.project.ecospare_v2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class sellwalapage(
    var context: Context,
    var nameList: ArrayList<String>,
    var imageList: ArrayList<Int>

) : BaseAdapter() {

    override fun getCount(): Int {
        return  nameList.size
    }

    override fun getItem(p0: Int): Any? {
        return  null
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getView(postion: Int, convertView: View?, parent: ViewGroup?): View {
        val view : View = LayoutInflater.from(parent!!.context).inflate(R.layout.customsell,parent,false)
        var animalname: TextView = view.findViewById(R.id.textView3)
        var animalImage :ImageView = view.findViewById(R.id.imageView)
        animalname.text = nameList[postion]
        animalImage.setImageResource(imageList.get(postion))
        return view
    }
}