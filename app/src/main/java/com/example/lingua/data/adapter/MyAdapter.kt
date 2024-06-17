package com.example.lingua.data.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.lingua.R
import com.example.lingua.data.model.Lesson
import com.example.lingua.ui.lessons.Lesson1Activity
import com.example.lingua.ui.lessons.Lesson2Activity
import com.example.lingua.ui.empty.EmptyActivity

class MyAdapter(private val lessonList: List<Lesson>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemButton: Button = itemView.findViewById(R.id.itemButton)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = lessonList[position]
        holder.itemButton.text = item.title
        holder.itemButton.setOnClickListener {
            val context = holder.itemView.context
            val intent = when (position) {
                0 -> Intent(context, Lesson1Activity::class.java)
                1 -> Intent(context, Lesson2Activity::class.java)
                // Add more cases as needed for additional lessons
                else -> Intent(context, EmptyActivity::class.java)
            }
            context.startActivity(intent)
        }
    }

    override fun getItemCount() = lessonList.size
}