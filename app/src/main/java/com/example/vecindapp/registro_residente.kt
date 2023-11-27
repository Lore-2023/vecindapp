package com.example.vecindapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vecindapp.databinding.ActivityRegistroResidenteBinding

class registro_residente : AppCompatActivity() {
    lateinit var binding: ActivityRegistroResidenteBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityRegistroResidenteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.regresar.setOnClickListener {
            val intent=Intent(this,gestion_usuarios::class.java)
            startActivity(intent)
        }

        binding.continuar.setOnClickListener {
            val intent=Intent(this,asignacion_clave_residente::class.java)
            startActivity(intent)
        }
        /*
        binding.regresar.setOnClickListener {
            val intent=Intent(this,home::class.java)
            startActivity(intent)
        }*/
    }
}