package com.example.lingua.data.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.lingua.R
import com.example.lingua.data.model.Item
import com.example.lingua.ui.empty.EmptyActivity

class MyAdapter(private val itemList: List<Item>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemButton: Button = itemView.findViewById(R.id.itemButton)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = itemList[position]
        holder.itemButton.text = item.title
        holder.itemButton.setOnClickListener {
            val context = holder.itemView.context
            val intent = Intent(context, EmptyActivity::class.java)
            context.startActivity(intent)
        }
    }

    override fun getItemCount() = itemList.size
}