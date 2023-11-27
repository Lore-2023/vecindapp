package com.example.vecindapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vecindapp.databinding.ActivityPerfilResidenteBinding

class perfil_residente : AppCompatActivity() {
    lateinit var binding:ActivityPerfilResidenteBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityPerfilResidenteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.boletinInformativo.setOnClickListener {
            val intent=Intent(this,vista_boletines::class.java)
            startActivity(intent)
        }

        binding.cerrarSesion.setOnClickListener {
            val intent=Intent(this,home::class.java)
            startActivity(intent)
        }
    }
}