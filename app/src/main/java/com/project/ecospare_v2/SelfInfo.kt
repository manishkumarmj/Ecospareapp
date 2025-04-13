package com.project.ecospare_v2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class SelfInfo : AppCompatActivity() {
    lateinit var name: EditText
    lateinit var age: EditText
    lateinit var next: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_self_info)
        name = findViewById(R.id.namebutton)
        age = findViewById(R.id.agebutton)
        next = findViewById(R.id.button)
        next.setOnClickListener {
            val userName = name.text.toString().trim()
            val ageText = age.text.toString().trim()
            if (isValidInput(userName, ageText)) {
                val userAge = ageText.toInt()
                val intent = Intent(this@SelfInfo, S2Details::class.java)
                intent.putExtra("username", userName)
                intent.putExtra("userage", userAge)
                startActivity(intent)
            }
        }
    }

    private fun isValidInput(name: String, ageText: String): Boolean {
        if (name.isEmpty() || ageText.isEmpty()) {
            showToast("Please enter both name and age.")
            return false
        }

        val userAge = ageText.toIntOrNull()
        if (userAge == null || userAge <= 0) {
            showToast("Please enter a valid age.")
            return false
        }

        if (userAge < 20) {
            showToast("Sorry, you can't proceed.")
            return false
        }

        return true
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
