package com.example.mobileapps1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myTextView = findViewById<TextView>(R.id.myTextView)
        val newTextString = getString(R.string.some_text)
        val textView2 = findViewById<TextView>(R.id.textView2)
        myTextView.text = getString(R.string.some_text) + "123"
        val textView3 = findViewById<TextView>(R.id.textView3)
        val newTextString3 = getString(R.string.some_text) + "987698"


    }
}