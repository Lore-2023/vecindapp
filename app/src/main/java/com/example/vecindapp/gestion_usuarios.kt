package com.example.vecindapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.vecindapp.databinding.ActivityCrearNuevaClaveBinding
import com.example.vecindapp.databinding.ActivityGestionUsuariosBinding

class gestion_usuarios : AppCompatActivity() {
    lateinit var binding: ActivityGestionUsuariosBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityGestionUsuariosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapterGestionUsuariosBinding= ArrayAdapter(this, android.R.layout.simple_list_item_1, poraprobacion)
        binding.ListaAprobaciones.adapter=adapterGestionUsuariosBinding


        binding.regresar2.setOnClickListener {
            val intent=Intent(this,perfil_administrador1::class.java)
            startActivity(intent)
        }

        binding.creacionUsuario.setOnClickListener {
            val intent=Intent(this,registro_residente::class.java)
            startActivity(intent)
        }

        binding.cerrarSesion3.setOnClickListener {
            val intent=Intent(this,home::class.java)
            startActivity(intent)
        }
    }
}