package com.timmitof.databaseapplication.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.fragment.app.Fragment
import com.timmitof.databaseapplication.App
import com.timmitof.databaseapplication.databinding.FragmentAddBookBinding
import com.timmitof.databaseapplication.entities.Book

class AddBookFragment : Fragment() {
    private var _binding: FragmentAddBookBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAddBookBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val db = App.instance?.getDatabase()?.bookDao()

        ArrayAdapter.createFromResource()

        binding.addBookBtn.setOnClickListener {
            val book = Book(
                id = 0,
                bookName = binding.bookName.text.toString(),
                author = binding.bookAuthor.text.toString(),
                publicationDate = binding.bookPublicationDate.text.toString(),
                pageAmount = binding.bookAmountPage.text.toString().toInt(),
                amount = binding.bookAmount.text.toString().toInt(),
                place = binding.bookPlace.text.toString(),
                1
            )
            db?.addBook(book)

            Log.d("Get", "${db?.getAllBooks()}")
        }

    }

}