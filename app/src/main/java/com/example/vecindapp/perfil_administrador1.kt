package com.example.vecindapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vecindapp.databinding.ActivityPerfilAdministrador1Binding

class perfil_administrador1 : AppCompatActivity() {
    lateinit var binding: ActivityPerfilAdministrador1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityPerfilAdministrador1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.gestionBoletines.setOnClickListener {
            val intent=Intent(this,Boletines::class.java)
            startActivity(intent)
        }

        binding.gestionUsuarios.setOnClickListener {
            val intent=Intent(this,gestion_usuarios::class.java)
            startActivity(intent)
        }

        binding.cerrarSesion.setOnClickListener {
            val intent=Intent(this,home::class.java)
            startActivity(intent)
        }
    }
}