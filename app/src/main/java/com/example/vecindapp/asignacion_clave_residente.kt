package com.example.vecindapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vecindapp.databinding.ActivityAsignacionClaveResidenteBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class asignacion_clave_residente : AppCompatActivity() {
    lateinit var binding:ActivityAsignacionClaveResidenteBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityAsignacionClaveResidenteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle=intent.extras
        val tipoDocumento=bundle?.getString("tipo_documento").toString()
        val numdocumento=bundle?.getString("num_documento").toString()
        val nombre=bundle?.getString("nombre").toString()
        val apellido=bundle?.getString("apellido").toString()
        val fechaNacimiento=bundle?.getString("fechaNacimiento").toString()
        val correo=bundle?.getString("correo").toString()
        val celular=bundle?.getString("celular").toString()
        val torre=bundle?.getString("torre").toString()
        val apartamento=bundle?.getString("apartamento").toString()



        binding.regresar.setOnClickListener {
            val intent=Intent(this,registro_residente::class.java)
            startActivity(intent)
        }

        binding.continuar.setOnClickListener {
            val intent=Intent(this, home::class.java)
            val clave=binding.asignarClave.text.toString()
            val confirmarClave=binding.confirmarClave.text.toString()

            if (clave=="" || confirmarClave==""){
                MaterialAlertDialogBuilder(this)
                    .setTitle(resources.getString(R.string.Error_contraseña))
                    .setMessage(resources.getString(R.string.verificar_datos))
                    .setPositiveButton(resources.getString(R.string.aceptar)) { dialolog, which ->
                    }
                    .show()
            }else if (clave==confirmarClave){
                tipoDocumentousu.set(numdocumento.toString(),tipoDocumento.toString())
                numdocumentousu.set(numdocumento,numdocumento)
                nombreusu.set(numdocumento,nombre)
                apellidousu.set(numdocumento,apellido)
                fecha_nacimiento_usu.set(numdocumento,fechaNacimiento)
                correousu.set(numdocumento,correo)
                celularusu.set(numdocumento,celular)
                torreusu.set(numdocumento,torre)
                apartamentousu.set(numdocumento,apartamento)
                credencialesusuarios.set(numdocumento,clave)

                MaterialAlertDialogBuilder(this)
                    .setTitle(resources.getString(R.string.RegistroUsuario))
                    .setMessage(resources.getString(R.string.MsjRegistro))
                    .setPositiveButton(resources.getString(R.string.aceptar)) { dialolog, which ->
                        startActivity(intent)
                    }
                    .show()
            }else{
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