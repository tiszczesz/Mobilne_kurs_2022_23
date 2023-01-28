package com.example.appwithfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.appwithfragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn1.setOnClickListener { replaceFragment(Fragment1()) }
        binding.btn2.setOnClickListener { replaceFragment(Fragment2()) }
        binding.btn3.setOnClickListener { replaceFragment(Fragment3()) }
    }
    private fun replaceFragment(fragment:Fragment){
        val fragManager = supportFragmentManager
        val fragTransaction = fragManager.beginTransaction()
        fragTransaction.replace(R.id.fragments,fragment)
        fragTransaction.commit()
    }
}