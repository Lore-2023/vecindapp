package com.example.vecindapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.vecindapp.databinding.ActivityAccesoPrincipalBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class acceso_principal : AppCompatActivity() {
    lateinit var binding: ActivityAccesoPrincipalBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAccesoPrincipalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle=intent.extras
        val perfil=bundle?.getString("perfil")

        binding.regresar.setOnClickListener {
            val intent = Intent(this, home::class.java)
            startActivity(intent)
        }

        binding.ingresar.setOnClickListener {
            val numcedu=binding.numeroDocumento.text.toString()
            val clave=binding.clave.text.toString()
            if (perfil=="1"){
                val mapusuadmin= credencialesadministrator.containsKey(numcedu)
                val mapclaveadmin= credencialesadministrator.get(numcedu)
                if (mapusuadmin && clave==mapclaveadmin){
                    val intent = Intent(this, perfil_administrador1::class.java)
                    startActivity(intent)
                }else{
                    MaterialAlertDialogBuilder(this)
                        .setTitle(resources.getString(R.string.titulo))
                        .setMessage(resources.getString(R.string.mensaje))
                        .setPositiveButton(resources.getString(R.string.aceptar)){dialog,which->

                        }
                        .show()
                }
            }else if (perfil=="2"){
                val mapusuaresi= credencialesusuarios.containsKey(numcedu)
                val mapclaveresi= credencialesusuarios.get(numcedu)
                if (mapusuaresi && clave==mapclaveresi){
                    val intent = Intent(this, perfil_residente::class.java)
                    startActivity(intent)
                }else{
                    MaterialAlertDialogBuilder(this)
                        .setTitle(resources.getString(R.string.titulo))
                        .setMessage(resources.getString(R.string.mensaje))
                        .setPositiveButton(resources.getString(R.string.aceptar)){dialog,which->

                        }
                        .show()
                }

            }
        }

       binding.registrarse.setOnClickListener {
            val intent=Intent(this,registro_residente::class.java)
            startActivity(intent)
        }

        binding.olvidoClave.setOnClickListener {
            val intent = Intent(this, recuperar_clave::class.java)
                .putExtra("perfil", "1")
            startActivity(intent)
        }

    }

}