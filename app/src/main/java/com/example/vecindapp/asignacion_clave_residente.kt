package com.example.vecindapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vecindapp.databinding.ActivityAsignacionClaveResidenteBinding

class asignacion_clave_residente : AppCompatActivity() {
    lateinit var binding:ActivityAsignacionClaveResidenteBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityAsignacionClaveResidenteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.regresar.setOnClickListener {
            val intent=Intent(this,registro_residente::class.java)
            startActivity(intent)
        }

        binding.continuar.setOnClickListener {
            val intent=Intent(this, acceso_principal::class.java)
            startActivity(intent)
        }
    }
}