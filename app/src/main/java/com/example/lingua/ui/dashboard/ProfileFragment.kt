package com.example.lingua.ui.dashboard

import android.graphics.Typeface
import android.os.Bundle
import android.util.TypedValue
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.core.content.ContextCompat
import com.example.lingua.R

class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_profile, container, false)

        val days = listOf("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun")

        val daysOfWeekContainer: LinearLayout = rootView.findViewById(R.id.days_of_week_container)
        val progressDaysContainer: LinearLayout = rootView.findViewById(R.id.progress_days_container)

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

        days.forEach { day ->
            val progressDayTextView = TextView(context).apply {
                layoutParams =
                    LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.WRAP_CONTENT, 1f).apply {
                        marginEnd = 16
                    }
                text = day
                setTextColor(ContextCompat.getColor(requireContext(), R.color.Green))
                setTextSize(TypedValue.COMPLEX_UNIT_SP, 12f)
                setTypeface(null, Typeface.NORMAL)
                gravity = Gravity.CENTER
            }
            progressDaysContainer.addView(progressDayTextView)
        }

        return rootView
    }
}
