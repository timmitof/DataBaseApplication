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
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAddGenreBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val db = App.instance?.getDatabase()?.genreDao()

        binding.saveGenreBtn.setOnClickListener {
            val genre = Genre(
                idGenre = null,
                name = binding.genreName.text.toString()
            )
            db?.addGenre(genre)
            Log.d("Get", "${db?.getAllGenre()}")
        }
    }
}