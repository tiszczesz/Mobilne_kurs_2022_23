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
        bind.btnLastname.setOnClickListener {
            val lastName = bind.edLastname.text.toString();
            if(lastName.isNullOrEmpty()){
                bind.tvResult.text = "Brak nazwiska!!!"
                return@setOnClickListener
            }
            if(StringOperations.IsOnlyLetter(bind.edLastname.text.toString())){
                bind.tvResult.text = "wszystkie litery w nazwisku"
            }else{
                bind.tvResult.text = "nie wszystkie to litery w nazwisku"
            }
        }
        bind.btnEmail.setOnClickListener {
            val email = bind.edEmail.text.toString().trim()
            if(email.isNullOrEmpty()){
                bind.tvResult.text = "Brak emaila!!!"
                return@setOnClickListener
            }
            if(StringOperations.IsEmail(bind.edEmail.toString())){
                bind.tvResult.text = "Poprawny adres emailowy";
            }else{
                bind.tvResult.text = "Błędny adres emailowy";
            }
        }
    }
}