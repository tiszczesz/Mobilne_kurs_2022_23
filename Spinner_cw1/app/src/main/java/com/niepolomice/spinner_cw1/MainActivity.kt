package com.niepolomice.spinner_cw1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.niepolomice.spinner_cw1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val languages = resources.getStringArray(R.array.Languages)
        if(binding.spinner!=null){
            val adapter = ArrayAdapter(this,android.R.layout.simple_spinner_item,languages)
            binding.spinner.adapter = adapter;
            binding.spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
                override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                    try{
                        binding.tvResult.text = "Wybrano: ${languages[p2]}"
                    }catch (ex: java.lang.IndexOutOfBoundsException){
                        Toast.makeText(this@MainActivity,"${ex.message}",Toast.LENGTH_SHORT).show()
                    }

                }

                override fun onNothingSelected(p0: AdapterView<*>?) {

                }

            }
        }
    }
}