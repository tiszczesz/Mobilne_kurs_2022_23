package com.niepolomice.firstgui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var  count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        val button2 = findViewById<Button>(R.id.button2)
        val tvInfo = findViewById<TextView>(R.id.tvInfo)
        button.setOnClickListener {
            count++
            tvInfo.text = "Klinięto przycisk $count"
        }
        button2.setOnClickListener {
            count=0
            tvInfo.text = "Klinięto przycisk $count"
        }
    }

    fun ImageClick(view: View) {
        Toast.makeText(this@MainActivity,"Kliknięto obrazek",Toast.LENGTH_SHORT).show()
    }
}