package com.example.recycledview_v1

import android.graphics.Paint.STRIKE_THRU_TEXT_FLAG
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

import com.example.recycledview_v1.databinding.ItemViewBinding

class TodoAdapter(private val todos:MutableList<Todo>):
    RecyclerView.Adapter<TodoAdapter.ViewHolder>()
{
    var clickedPos = -1
    inner class ViewHolder(val itemBinding:ItemViewBinding)
        :RecyclerView.ViewHolder(itemBinding.root) {
            fun bindItem(todo:Todo){
                itemBinding.todoTitle.text = todo.title
                itemBinding.cbDone.isChecked = todo.isChecked
            }

    }

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): ViewHolder {
        return ViewHolder(ItemViewBinding.inflate(LayoutInflater.from(parent.context)
                  ,parent,false))
    }

    override fun getItemCount(): Int {
        return todos.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentTodo = todos[position]
        holder.bindItem(currentTodo)
        toggleStrikeThrough(holder.itemBinding.todoTitle,currentTodo.isChecked)
        holder.itemBinding.cbDone.setOnCheckedChangeListener {_,isChecked ->
            toggleStrikeThrough(holder.itemBinding.todoTitle,isChecked)
            currentTodo.isChecked = !currentTodo.isChecked
        }
        
    }

    private fun toggleStrikeThrough(todoTitle: TextView, isChecked: Boolean) {
        if(isChecked){
            todoTitle.paintFlags = todoTitle.paintFlags or STRIKE_THRU_TEXT_FLAG
        }else{
            todoTitle.paintFlags = todoTitle.paintFlags and STRIKE_THRU_TEXT_FLAG.inv()
        }
    }
    fun addTodo(todo:Todo){
        todos.add(todo)
        notifyDataSetChanged()
    }
    fun deleteDoneTodos(){
        todos.removeAll{todo: Todo -> todo.isChecked }
        notifyDataSetChanged()
    }


}
