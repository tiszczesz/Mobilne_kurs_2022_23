package com.niepolomice.liniowy_nwd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.niepolomice.liniowy_nwd.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var bind: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(layoutInflater)
        //setContentView(R.layout.activity_main)
        setContentView(bind.root)
        bind.btnOblicz.setOnClickListener {
            try {
                val a = bind.etA.text.toString().toInt()
                val b = bind.etB.text.toString().toInt()
                val nwd = NWD()

                bind.tvResult.text = "NWD($a,$b) =  ${nwd.NWDRec(a,b)}";
            }catch (ex: java.lang.NumberFormatException){
                Toast.makeText(this@MainActivity,"Niepoprawne dane",
                    Toast.LENGTH_SHORT).show()
            }
        }
    }
}