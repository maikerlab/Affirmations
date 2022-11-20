package com.example.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.affirmations.data.Datasource
import com.example.affirmations.databinding.ActivityMainBinding
import com.example.affirmations.model.Affirmation

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val datasource = Datasource()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvTest.text = datasource.loadAffirmations().size.toString()
    }
}