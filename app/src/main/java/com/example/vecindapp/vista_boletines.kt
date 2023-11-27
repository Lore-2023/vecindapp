package com.example.vecindapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vecindapp.databinding.ActivityVistaBoletinesBinding

class vista_boletines : AppCompatActivity() {
    lateinit var binding: ActivityVistaBoletinesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityVistaBoletinesBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}