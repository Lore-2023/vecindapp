package com.example.vecindapp

import android.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.vecindapp.databinding.ActivityVistaBoletinesBinding

class vista_boletines : AppCompatActivity() {
    lateinit var binding: ActivityVistaBoletinesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityVistaBoletinesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapterBoletin= ArrayAdapter(this, R.layout.simple_list_item_1, boletines)
        binding.ListaBoletines.adapter=adapterBoletin
    }
}