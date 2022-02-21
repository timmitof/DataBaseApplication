package com.timmitof.databaseapplication.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.timmitof.databaseapplication.App
import com.timmitof.databaseapplication.R
import com.timmitof.databaseapplication.databinding.FragmentAddGenreBinding
import com.timmitof.databaseapplication.entities.Genre

class AddGenreFragment : Fragment() {
    private var _binding: FragmentAddGenreBinding? = null
    private val binding = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAddGenreBinding.inflate(inflater, container, false)
        val db = App.instance?.getDatabase()?.GenreDao()

        binding.saveGenreBtn.setOnClickListener {
            db?.addGenre(Genre(0, binding.genre.text.toString()))
            Log.d("Get", "${db?.getAllGenre()}")
        }

        return binding.root
    }

}