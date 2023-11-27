package com.example.vecindapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.vecindapp.databinding.ActivityRecuperarClaveBinding

class recuperar_clave : AppCompatActivity() {
    lateinit var binding: ActivityRecuperarClaveBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecuperarClaveBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle = intent.extras
        val perfil = bundle?.getString("perfil")

        binding.regresar.setOnClickListener {
            val intent = Intent(this, acceso_principal::class.java)
            startActivity(intent)
        }


        binding.continuar.setOnClickListener {
            val numcedu = binding.numeroDocumento.text.toString()
            if (perfil == "1") {
                val mapusuadmin= credencialesadministrator.containsKey(numcedu)
                if(mapusuadmin){
                    val intent = Intent(this, crear_nueva_clave::class.java)
                    startActivity(intent)
                }else{
                    val mensaje = "Usuario no existe"
                    Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show()
                }
            } else {
                val mensaje = "Usuario o clave incorrecta"
                Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show()
            }
        }

    }
}