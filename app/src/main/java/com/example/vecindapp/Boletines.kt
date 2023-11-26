package com.example.vecindapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vecindapp.databinding.ActivityBoletinesBinding

class Boletines : AppCompatActivity() {
    lateinit var binding: ActivityBoletinesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityBoletinesBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}