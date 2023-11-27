package com.example.vecindapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.vecindapp.databinding.ActivityBoletinesBinding

class Boletines : AppCompatActivity() {
    lateinit var binding: ActivityBoletinesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityBoletinesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapterBoletin=ArrayAdapter(this,android.R.layout.simple_list_item_1, boletines)
        binding.ListaBoletines.adapter=adapterBoletin


        binding.regresar.setOnClickListener {
            val intent=Intent(this,perfil_administrador1::class.java)
            startActivity(intent)
        }

        binding.cerrarSesion.setOnClickListener {
            val intent=Intent(this,acceso_principal::class.java)
            startActivity(intent)
        }

    }
}