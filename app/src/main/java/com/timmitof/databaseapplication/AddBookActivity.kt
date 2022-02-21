package com.timmitof.databaseapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.timmitof.databaseapplication.databinding.ActivityAddBookBinding

class AddBookActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAddBookBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddBookBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}