package com.example.lingua.ui.profile

import android.content.Context
import android.graphics.Typeface
import android.os.Bundle
import android.util.TypedValue
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.example.lingua.R

class ProfileFragment : Fragment() {

    private val exercises = listOf("Reading Lesson", "Grammar Lesson", "Vocabulary Lesson")
    private lateinit var sharedPreferences: android.content.SharedPreferences

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_profile, container, false)

        val days = listOf("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun")
        sharedPreferences = requireContext().getSharedPreferences("exercisePrefs", Context.MODE_PRIVATE)

        val daysOfWeekContainer: LinearLayout = rootView.findViewById(R.id.days_of_week_container)
        val todoListContainer: LinearLayout = rootView.findViewById(R.id.todo_list_container)

        days.forEach { day ->
            val dayTextView = TextView(context).apply {
                layoutParams =
                    LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.WRAP_CONTENT, 1f).apply {
                        marginEnd = 16
                    }
                text = day
                setTextColor(ContextCompat.getColor(requireContext(), R.color.white))
                setTextSize(TypedValue.COMPLEX_UNIT_SP, 16f)
                setTypeface(null, Typeface.BOLD)
                gravity = Gravity.CENTER
            }
            daysOfWeekContainer.addView(dayTextView)
        }

        exercises.forEachIndexed { index, exercise ->
            val exerciseLayout = LinearLayout(context).apply {
                layoutParams = LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
                ).apply {
                    setMargins(0, 8, 0, 8)
                }
                orientation = LinearLayout.HORIZONTAL
                gravity = Gravity.CENTER_VERTICAL
            }

            val exerciseTextView = TextView(context).apply {
                layoutParams = LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.WRAP_CONTENT, 1f).apply {
                    marginEnd = 16
                }
                text = exercise
                setTextColor(ContextCompat.getColor(requireContext(), R.color.white))
                setTextSize(TypedValue.COMPLEX_UNIT_SP, 18f)
                setTypeface(null, Typeface.NORMAL)
                gravity = Gravity.START
            }

            val exerciseCheckBox = CheckBox(context).apply {
                layoutParams = LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
                )
                gravity = Gravity.END
                buttonDrawable = ContextCompat.getDrawable(requireContext(), R.drawable.checkbox_selector)

                isChecked = sharedPreferences.getBoolean("checkbox_$index", false)

                setOnCheckedChangeListener { _, isChecked ->
                    sharedPreferences.edit().putBoolean("checkbox_$index", isChecked).apply()
                }
            }

            exerciseLayout.addView(exerciseTextView)
            exerciseLayout.addView(exerciseCheckBox)

            todoListContainer.addView(exerciseLayout)
        }

        return rootView
    }
}
