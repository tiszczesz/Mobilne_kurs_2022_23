package com.niepolomice.viewbindingex1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.niepolomice.viewbindingex1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var bind: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)
        bind.btnFirstname.setOnClickListener {
            if (bind.etFirstName.text.toString().trim().isEmpty()) {
                bind.tvResult.text = "Podaj dane"
                return@setOnClickListener
            }
            bind.tvResult.text = if (StringOperations.IsPalindrom(bind.etFirstName.text.toString())
            ) {
                "odwracalne imie"
            } else {
                "nieodwracalne imie"
            }
        }
    }
}