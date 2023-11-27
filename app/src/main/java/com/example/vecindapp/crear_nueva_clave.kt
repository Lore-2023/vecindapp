package com.example.vecindapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vecindapp.databinding.ActivityCrearNuevaClaveBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class crear_nueva_clave : AppCompatActivity() {
    lateinit var binding:ActivityCrearNuevaClaveBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityCrearNuevaClaveBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.regresar.setOnClickListener {
            val intent=Intent(this,recuperar_clave::class.java)
            startActivity(intent)
        }

        binding.restablecer.setOnClickListener {
            val intent=Intent(this,acceso_principal::class.java)
            MaterialAlertDialogBuilder(this)
                .setTitle(resources.getString(R.string.titulo2))
                .setMessage(resources.getString(R.string.mensaje2))
                .setPositiveButton(resources.getString(R.string.aceptar2)){dialog,which->
                    startActivity(intent)
                }
                .show()


        }
    }
}