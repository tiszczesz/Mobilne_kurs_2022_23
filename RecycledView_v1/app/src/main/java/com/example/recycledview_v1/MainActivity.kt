package com.example.recycledview_v1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recycledview_v1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var  todoAdapter:TodoAdapter
    private lateinit var binding: ActivityMainBinding
    private  var todosList = TodoList
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        todoAdapter = TodoAdapter(todosList.todoList)
        binding.rvTodoItems.adapter = todoAdapter
        binding.rvTodoItems.layoutManager = LinearLayoutManager(this)
        binding.btnAddNew.setOnClickListener {
            val todoTitle = binding.editText.text.toString()
            if(todoTitle.isNotEmpty()){
                val todo = Todo(todoTitle)
                todoAdapter.addTodo(todo)
            }
        }
        binding.btnDelete.setOnClickListener {
            todoAdapter.deleteDoneTodos()
        }
    }
}