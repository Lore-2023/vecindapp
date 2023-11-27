package com.example.vecindapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.vecindapp.databinding.ActivityRegistroResidenteBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class registro_residente : AppCompatActivity() {
    lateinit var binding: ActivityRegistroResidenteBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityRegistroResidenteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //carga de data

        val adapterTipoDocumeto=ArrayAdapter(this,android.R.layout.simple_list_item_1, tipodocumento)
        binding.tipoDocumento.adapter=adapterTipoDocumeto

        val adapterTorre=ArrayAdapter(this,android.R.layout.simple_list_item_1, listadetorres)
        binding.torre.adapter=adapterTorre

        val adapterApt=ArrayAdapter(this,android.R.layout.simple_list_item_1, listadeapartamentos)
        binding.apartamento.adapter=adapterApt





        binding.regresar.setOnClickListener {
            val intent=Intent(this,gestion_usuarios::class.java)
            startActivity(intent)
        }

        binding.continuar.setOnClickListener {
            //captura de datos
            val tipoDocumento=binding.tipoDocumento.selectedItem.toString()
            val numdocumento=binding.numeroDocumento.text.toString()
            val nombre=binding.nombres.text.toString()
            val apellido=binding.apellidos.text.toString()
            val fechaNacimiento=binding.editTextDate.text.toString()
            val correo=binding.correoElectronico.text.toString()
            val celular=binding.celularRegistrado.text.toString()
            val torre=binding.torre.selectedItem.toString()
            val apartamento=binding.apartamento.selectedItem.toString()

            if (tipoDocumento=="" || numdocumento=="" || nombre==""|| apellido==""|| fechaNacimiento==""|| correo==""|| celular==""|| torre==""|| apartamento==""){
                MaterialAlertDialogBuilder(this)
                    .setTitle(resources.getString(R.string.datos_Invalidos))
                    .setMessage(resources.getString(R.string.verificar_datos))
                    .setPositiveButton(resources.getString(R.string.aceptar)) { dialolog, which ->

                    }
                    .show()
            }else{
                val intent=Intent(this,asignacion_clave_residente::class.java)
                    .putExtra("tipo_documento", tipoDocumento)
                    .putExtra("num_documento",numdocumento)
                    .putExtra("nombre",nombre)
                    .putExtra("apellido",apellido)
                    .putExtra("fecha_nacimiento",fechaNacimiento)
                    .putExtra("correo",correo)
                    .putExtra("celular",celular)
                    .putExtra("torre", torre)
                    .putExtra("apartamento",apartamento)

                startActivity(intent)
            }

        }
        /*
        binding.regresar.setOnClickListener {
            val intent=Intent(this,home::class.java)
            startActivity(intent)
        }*/
    }
}