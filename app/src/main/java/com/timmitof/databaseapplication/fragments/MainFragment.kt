package com.timmitof.databaseapplication.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.timmitof.databaseapplication.AddBookActivity
import com.timmitof.databaseapplication.ViewBookActivity
import com.timmitof.databaseapplication.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainBinding.inflate(inflater, container, false)

        binding.addBookBtn.setOnClickListener {
            startActivity(Intent(requireActivity(), AddBookActivity::class.java))
        }

        binding.viewBookBtn.setOnClickListener {
            startActivity(Intent(requireActivity(), ViewBookActivity::class.java))
        }

        return binding.root
    }
}