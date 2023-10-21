package com.example.listview_v1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.listview_v1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val myTodo = arrayListOf<String>("Zjeść śniadanie","Umyć się",
            "Ubrać się","Zagadać do domowników","Czas wolny")
        val listAdapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,myTodo);
        binding.listView.adapter = listAdapter
        binding.listView.onItemClickListener = AdapterView.OnItemClickListener{
            adapterView, view, position, id ->
            val selectedItem = adapterView.getItemAtPosition(position) as String

            val itemIdAtPos = adapterView.getItemIdAtPosition(position)

            view.setBackgroundColor(Color.GRAY)
            Toast.makeText(this@MainActivity,"kliknięto: $selectedItem o indeksie: $itemIdAtPos",
            Toast.LENGTH_SHORT).show()
        }
        binding.btnAdd.setOnClickListener {
            val item = binding.addNew.text.toString()
            if (item.isEmpty()) return@setOnClickListener;
            myTodo.add(item)
            listAdapter.notifyDataSetChanged()
        }

    }
}