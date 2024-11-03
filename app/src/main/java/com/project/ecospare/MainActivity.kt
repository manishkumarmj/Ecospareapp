package com.project.ecospare

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var name: EditText
    lateinit var age: EditText
    lateinit var next: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        name = findViewById(R.id.edittextName)
        age = findViewById(R.id.editTextNumber)
        next = findViewById(R.id.button)

        next.setOnClickListener {
            val userName: String = name.text.toString()
            val userAge: Int = age.text.toString().toInt()

            val intent = Intent(this@MainActivity, Landingpage::class.java)
            intent.putExtra("username", userName)
            intent.putExtra("userage", userAge)
            startActivity(intent)
        }
    }
}
