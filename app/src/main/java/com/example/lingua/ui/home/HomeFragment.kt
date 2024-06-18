package com.example.lingua.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lingua.data.adapter.MyButtonAdapter
import com.example.lingua.data.model.Lesson
import com.example.lingua.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val lessonLists = listOf(
            Lesson("A1\nGramma", "Description 1"),
            Lesson("A1\nReading Lesson", "Description 2"),
            Lesson("A1\nVocabulary Lesson", "Description 3"),

            Lesson("A2\nGramma", "Description 1"),
            Lesson("A2\nReading Lesson", "Description 2"),
            Lesson("A2\nVocabulary Lesson", "Description 3"),

            Lesson("B1\nGramma", "Description 1"),
            Lesson("B1\nReading Lesson", "Description 2"),
            Lesson("B1\nVocabulary Lesson", "Description 3"),

            Lesson("B2\nGramma", "Description 1"),
            Lesson("B2\nReading Lesson", "Description 2"),
            Lesson("B2\nVocabulary Lesson", "Description 3"),
        )

        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        binding.recyclerView.adapter = MyButtonAdapter(lessonLists)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}