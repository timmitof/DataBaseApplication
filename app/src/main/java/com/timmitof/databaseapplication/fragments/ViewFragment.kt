package com.timmitof.databaseapplication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.timmitof.databaseapplication.App
import com.timmitof.databaseapplication.R
import com.timmitof.databaseapplication.adapter.ViewBooksAdapter

class ViewFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_view, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val dbBook = App.instance?.getDatabase()?.bookDao()
        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.adapter = ViewBooksAdapter(dbBook!!.getAllBooks(), requireActivity())
    }
}