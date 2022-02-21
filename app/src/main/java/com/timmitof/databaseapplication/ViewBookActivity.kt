package com.timmitof.databaseapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.timmitof.databaseapplication.databinding.ActivityViewBookBinding

class ViewBookActivity : AppCompatActivity() {
    private lateinit var binding: ActivityViewBookBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewBookBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}