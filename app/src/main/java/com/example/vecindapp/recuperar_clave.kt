package com.example.vecindapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vecindapp.databinding.ActivityRecuperarClaveBinding

class recuperar_clave : AppCompatActivity() {
    lateinit var binding:ActivityRecuperarClaveBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityRecuperarClaveBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.regresar.setOnClickListener {
            val intent=Intent(this,acceso_principal::class.java)
            startActivity(intent)
        }

        binding.continuar.setOnClickListener {
            val intent=Intent(this,crear_nueva_clave::class.java)
            startActivity(intent)
        }
    }

}