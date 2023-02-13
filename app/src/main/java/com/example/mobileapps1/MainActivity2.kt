package com.example.mobileapps1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

private const val TAG = "main_activity"

class MainActivity2: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        Log.d(TAG, "Activity created")
    }
    override fun onPause() {
        super.onPause()
        Log.w(TAG, "Hi there")
    }
    override fun onResume() {
        super.onResume()
        Log.e(TAG, "This activity has been resumed")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG, "Activity has been destroyed")
    }
}
