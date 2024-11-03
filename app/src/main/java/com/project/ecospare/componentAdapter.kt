package com.project.ecospare

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class componentAdapter(
    var context: Context,

    var nameList: ArrayList<String>,
    var imageList: ArrayList<Int>,
) : BaseAdapter() {

    override fun getCount(): Int {
       return nameList.size
    }

    override fun getItem(p0: Int): Any? {
        TODO("Not yet implemented")
        return null
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getView(position: Int, counterView: View?, parent: ViewGroup): View {
        val view:View=LayoutInflater.from( parent!!.context )
            .inflate(R.layout.custom_layout,parent,false)
        var componentName:TextView=view.findViewById(R.id.textView8)
        var componentImage:ImageView=view.findViewById(R.id.imageView4)
        componentName.text=nameList.get(position)
        componentImage.setImageResource(imageList.get(position))

    return view
    }

}