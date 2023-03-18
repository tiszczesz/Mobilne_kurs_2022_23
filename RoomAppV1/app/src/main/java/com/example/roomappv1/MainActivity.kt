package com.example.roomappv1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.roomappv1.databinding.ActivityMainBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private lateinit var appDatabase: AppDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        appDatabase = AppDatabase.getDatabase(this)
        binding.btnSave.setOnClickListener {
            writeData()
        }
        binding.btnShow.setOnClickListener {
            readData()
        }
    }

    private fun readData() {
        //todo


    }

    private fun writeData() {
        val firstName = binding.eFirstName.text.toString()
        val lastName = binding.eLastName.text.toString()
        val rollNo = binding.eNrDziennika.text.toString()
        if(firstName.isNotEmpty() && lastName.isNotEmpty() && rollNo.isNotEmpty()){
            val student = Student(null,firstName,lastName, rollNo.toInt())
            GlobalScope.launch(Dispatchers.IO) {
                appDatabase.studentDao().insert(student)
            }
            Toast.makeText(this@MainActivity,"Zapisano do bazy $firstName $lastName",Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(this@MainActivity,"Błędne dane",Toast.LENGTH_SHORT).show()
        }
    }
    private suspend fun displayData(student: Student){
        withContext(Dispatchers.Main){
            binding.tvFirstName.text = student.firstName
            binding.tvLastName.text = student.lastName
            binding.tvRollNo.text=student.rollNo.toString()
        }
    }
}