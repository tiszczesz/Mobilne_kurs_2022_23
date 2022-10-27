package com.niepolomice.myapplication1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var startPoint = 0;
    var endPoint = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val seekBar = findViewById<SeekBar>(R.id.seekBar)
        val textView = findViewById<TextView>(R.id.textView2)
        seekBar.setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                textView.text = p1.toString()
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
                if(p0 != null){
                     startPoint = p0.progress;
                }
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
                if(p0 != null){
                    endPoint = p0.progress;
                }
                Toast.makeText(this@MainActivity,"zmiana %${endPoint-startPoint}",Toast.LENGTH_SHORT).show()
            }

        }

        )

    }
}