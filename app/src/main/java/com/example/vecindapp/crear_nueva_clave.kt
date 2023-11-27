package com.example.vecindapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vecindapp.databinding.ActivityCrearNuevaClaveBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class crear_nueva_clave : AppCompatActivity() {
    lateinit var binding: ActivityCrearNuevaClaveBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCrearNuevaClaveBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle = intent.extras
        val perfil = bundle?.getString("numdocumento").toString()

        binding.regresar.setOnClickListener {
            val intent = Intent(this, recuperar_clave::class.java)
            startActivity(intent)
        }

        binding.restablecer.setOnClickListener {
            val clave = binding.crearNuevaClave.text.toString()
            val confirmarClave = binding.confirmarNuevaClave.text.toString()
            if (clave == "" || confirmarClave == "") {
                MaterialAlertDialogBuilder(this)
                    .setTitle(resources.getString(R.string.Error_contraseña))
                    .setMessage(resources.getString(R.string.verificar_datos))
                    .setPositiveButton(resources.getString(R.string.aceptar)) { dialolog, which ->
                    }
                    .show()
            } else if (clave == confirmarClave) {
                val intent = Intent(this, home::class.java)
                credencialesadministrator[perfil] = clave
                MaterialAlertDialogBuilder(this)
                    .setTitle(resources.getString(R.string.titulo2))
                    .setMessage(resources.getString(R.string.mensaje2))
                    .setPositiveButton(resources.getString(R.string.aceptar2)) { dialog, which ->
                        startActivity(intent)
                    }
                    .show()


            } else {
                MaterialAlertDialogBuilder(this)
                    .setTitle(resources.getString(R.string.Error_contraseña))
                    .setMessage(resources.getString(R.string.Msj_contraseña_no_coinciden))
                    .setPositiveButton(resources.getString(R.string.aceptar)) { dialolog, which ->
                    }
                    .show()
            }
        }
    }
}