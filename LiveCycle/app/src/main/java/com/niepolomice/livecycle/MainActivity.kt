package com.niepolomice.livecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("LIFECYCLE"," zdarzenie: onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.i("LIFECYCLE"," zdarzenie: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("LIFECYCLE"," zdarzenie: onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("LIFECYCLE"," zdarzenie: onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("LIFECYCLE"," zdarzenie: onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("LIFECYCLE"," zdarzenie: onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("LIFECYCLE"," zdarzenie: onRestart")
    }
}