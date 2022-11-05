package com.niepolomice.usespinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn1 = findViewById<Button>(R.id.button)
        val info = findViewById<TextView>(R.id.textView)
        val spinner = findViewById<Spinner>(R.id.spinner)
        val textView = findViewById<TextView>(R.id.textView2)
        val names:Array<String> = resources.getStringArray(R.array.alternatives)
        ArrayAdapter.createFromResource(
            this,R.array.alternatives,android.R.layout.simple_spinner_item
        ).also {
                adapter -> adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                spinner.adapter = adapter
        }

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
               Toast.makeText(this@MainActivity,"Wybrano: ${names[p2]}",Toast.LENGTH_SHORT).show()
                textView.text = spinner.selectedItem.toString()

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                    Toast.makeText(this@MainActivity,"Nie wybrano",Toast.LENGTH_SHORT).show()
            }

        }

        btn1.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                val current = LocalDateTime.now()
                val formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")
                info.text = current.format(formatter)
            }
        })

    }
}