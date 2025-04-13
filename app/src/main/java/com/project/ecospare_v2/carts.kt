package com.project.ecospare_v2

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class carts : AppCompatActivity() {
    private lateinit var place: Button
    private lateinit var name: EditText
    private lateinit var email: EditText
    private lateinit var phone: EditText
    private lateinit var postal: EditText
    private lateinit var city: EditText
    private lateinit var addressLine: EditText
    private lateinit var houseInfo: EditText
    private lateinit var landmark: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_carts)
        // Initializing Views
        place = findViewById(R.id.button2)
        name = findViewById(R.id.editTextText)
        email = findViewById(R.id.editTextTextEmailAddress)
        phone = findViewById(R.id.editTextPhone)
        postal = findViewById(R.id.editTextTextPostalAddress)
        city = findViewById(R.id.editTextText2)
        addressLine = findViewById(R.id.editTextTextMultiLine)
        houseInfo = findViewById(R.id.editTextText4)
        landmark = findViewById(R.id.editTextText3)

        place.setOnClickListener {
            if (isInputValid()) {
                showAlert()
            } else {
                Toast.makeText(this, "Please fill in all details.", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun isInputValid(): Boolean {
        return name.text.isNotEmpty() &&
                email.text.isNotEmpty() &&
                phone.text.isNotEmpty() &&
                postal.text.isNotEmpty() &&
                city.text.isNotEmpty() &&
                addressLine.text.isNotEmpty() &&
                houseInfo.text.isNotEmpty() &&
                landmark.text.isNotEmpty()
    }

    private fun showAlert() {
        val alertm = AlertDialog.Builder(this@carts)
        alertm.setTitle("Review Your Details")
            .setMessage("Kindly cross-check your address.")
            .setIcon(R.drawable.alert)
            .setCancelable(false)
            .setNegativeButton("Cancel") { dialogInterface, _ ->
                dialogInterface.cancel()
            }
            .setPositiveButton("Place Order") { _, _ ->
                val orderIntent = Intent(this, lastpaged::class.java)
                startActivity(orderIntent)
            }
        alertm.create().show()
    }

}