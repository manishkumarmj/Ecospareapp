package com.project.ecospare_v2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class S2Details : AppCompatActivity() {
    lateinit var Fall_username: TextView
    lateinit var about: TextView
    lateinit var slid: ImageView
    lateinit var back: Button
    lateinit var next: Button
    lateinit var heading: TextView
    lateinit var info: TextView
    lateinit var buySellpage: Button
    lateinit var trade: Button

    private var currentIndex = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_s2_details)
        // Initialize views
        trade=findViewById(R.id.trade)
        Fall_username = findViewById(R.id.userName)
        about = findViewById(R.id.About)
        slid = findViewById(R.id.Slid)
        back = findViewById(R.id.Back)
        next = findViewById(R.id.next)
        heading = findViewById(R.id.Heading)
        info = findViewById(R.id.Info)


        // Retrieve the username from intent and set it to the TextView
        val userName: String = intent.getStringExtra("username").toString()
        Fall_username.text = "Welcome back $userName"
        trade.setOnClickListener {
            val trade = Intent(this@S2Details, BuySellpage::class.java)
            startActivity(trade)
        }

        // Arrays for headings and image resources
        val headings = arrayOf(
            "Ecospare: Transforming Today’s Waste into a Resource",
            "Step 1: Collection",
            "Step 2: Sorting & Recycling",
            "Step 3: Repurposing",
            "Step 4: Reducing Carbon Footprint",
            "Step 5: Future-Ready Innovations"
        )
        val infotext = arrayOf(
            "Our vision is to turn e-waste into a valuable resource for a sustainable future. Join us in making a positive environmental impact.",
            "Gather electronic waste from households, businesses, and organizations to ensure proper disposal.",
            "Separate usable components from hazardous materials and recycle them efficiently.",
            "Convert recycled e-waste into raw materials for new electronics and other products.",
            "Reduce the environmental impact by limiting the need for raw material extraction and minimizing e-waste",
            "Explore how e-waste can be leveraged for sustainable energy solutions and other future innovations."
        )
        val images = arrayOf(
            R.drawable.p1,
            R.drawable.p3,
            R.drawable.p4,
            R.drawable.p5,
            R.drawable.p6
        )

        // Set initial image, heading, and info text
        updateContent(currentIndex, images, headings, infotext)

        next.setOnClickListener {
            // Move to the next index, wrap around if needed
            currentIndex = (currentIndex + 1) % images.size
            updateContent(currentIndex, images, headings, infotext)
        }

        back.setOnClickListener {
            // Move to the previous index, wrap around if needed
            currentIndex = if (currentIndex - 1 < 0) images.size - 1 else currentIndex - 1
            updateContent(currentIndex, images, headings, infotext)
        }
    }
    private fun updateContent(index: Int, images: Array<Int>, headings: Array<String>, infotext: Array<String>) {
        slid.setImageResource(images[index])
        heading.text = headings[index]
        info.text = infotext[index]
    }
}