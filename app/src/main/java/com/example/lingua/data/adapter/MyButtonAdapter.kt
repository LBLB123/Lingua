package com.example.lingua.data.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.lingua.R
import com.example.lingua.data.model.Lesson
import com.example.lingua.ui.empty.EmptyActivity
import com.example.lingua.ui.lessons.A1LessonGrammar1
import com.example.lingua.ui.lessons.A1LessonReading1
import com.example.lingua.ui.lessons.A1LessonVocabulary1
import com.example.lingua.ui.lessons.A2LessonGrammar1
import com.example.lingua.ui.lessons.A2LessonReading1
import com.example.lingua.ui.lessons.A2LessonVocabulary1
import com.example.lingua.ui.lessons.B1LessonGrammar1
import com.example.lingua.ui.lessons.B1LessonReading1
import com.example.lingua.ui.lessons.B2LessonGrammar1
import com.example.lingua.ui.lessons.B2LessonReading1
import lessons.B1LessonVocabulary1
import lessons.B2LessonVocabulary1


class MyButtonAdapter(private val lessonList: List<Lesson>) : RecyclerView.Adapter<MyButtonAdapter.MyViewHolder>() {

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

                0 -> Intent(context, A1LessonGrammar1::class.java)
                1 -> Intent(context, A1LessonReading1::class.java)
                2 -> Intent(context, A1LessonVocabulary1::class.java)

                3 -> Intent(context, A2LessonGrammar1::class.java)
                4 -> Intent(context, A2LessonReading1::class.java)
                5 -> Intent(context, A2LessonVocabulary1::class.java)

                6 -> Intent(context, B1LessonGrammar1::class.java)
                7 -> Intent(context, B1LessonReading1::class.java)
                8 -> Intent(context, B1LessonVocabulary1::class.java)

                9 -> Intent(context, B2LessonGrammar1::class.java)
                10 -> Intent(context, B2LessonReading1::class.java)
                11-> Intent(context, B2LessonVocabulary1::class.java)
                // Add more cases as needed for additional lessons
                else -> Intent(context, EmptyActivity::class.java)
            }
            context.startActivity(intent)
        }
    }

    override fun getItemCount() = lessonList.size
}