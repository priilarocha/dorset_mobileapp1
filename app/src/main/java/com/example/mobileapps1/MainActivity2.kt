package com.example.mobileapps1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity2: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        Log.d("main_activity", "Activity created")
    }
    override fun onPause() {
        super.onPause()
        Log.w("main_activity", "Hi there")
    }
    override fun onResume() {
        super.onResume()
        Log.e("main_activity", "This activity has been resumed")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("main_activity", "Activity has been destroyed")
    }
}
