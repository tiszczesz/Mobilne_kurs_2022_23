package com.niepolomice.exerciselayouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {
    private lateinit var calculateCener:CalculateCener
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val numberA = findViewById<EditText>(R.id.numberA)
        val numberB = findViewById<EditText>(R.id.numberB)
        val run = findViewById<Button>(R.id.run)
        val result = findViewById<TextView>(R.id.result)
        run.setOnClickListener {
            try {
                val a = numberA.text.toString().toDouble()
                val b = numberB.text.toString().toDouble()
                calculateCener = CalculateCener(a,b)
                result.text = "$a + $b = ${calculateCener.Add()}"
            }catch (e: java.lang.NumberFormatException){
                Toast.makeText(this@MainActivity,"Błędne dane",Toast.LENGTH_LONG).show()
                result.text = "Błędne dane"
            }
        }
    }
}