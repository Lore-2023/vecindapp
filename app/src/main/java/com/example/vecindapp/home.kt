package com.example.vecindapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.vecindapp.databinding.ActivityHomeBinding

class home : AppCompatActivity() {
    lateinit var binding:ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.botonAdministrador.setOnClickListener{
            val intent=Intent(this,acceso_principal::class.java)
                .putExtra("perfil", "1")
            startActivity(intent)

        }
        binding.botonResidente.setOnClickListener{
            val intent=Intent(this,acceso_principal::class.java)
                .putExtra("perfil","2")
            startActivity(intent)


        }
    }
}