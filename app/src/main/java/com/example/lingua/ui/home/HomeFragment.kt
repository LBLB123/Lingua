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
            Lesson("Title #1", "Description 1"),
            Lesson("Title #2", "Description 2"),
            Lesson("Title #3", "Description 3"),
            Lesson("Title #34", "Description 34")
        )

        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        binding.recyclerView.adapter = MyButtonAdapter(lessonLists)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}