package com.example.mobileapps1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val welcomeText = findViewById<TextView>(R.id.welcomeText)
        welcomeText.text = getString(R.string.hello_dorset)

        val welcomeNameText = findViewById<TextView>(R.id.welcomeNameText)
        val saveButton = findViewById<Button>(R.id.saveButton)
        val nameEditText = findViewById<EditText>(R.id.nameEditText)
        val nameText = nameEditText.text
        saveButton.setOnClickListener {
            val welcomeNameTextString = "Welcome, $nameText!"
            welcomeNameText.text = welcomeNameTextString
        }

        val nextPageButton = findViewById<Button>(R.id.nextPageButton)
        nextPageButton.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }


    }
}