package edu.bo.ucb.guia4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class ServiciosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun selectedButton(view: View) {
        if ( view.id === R.id.btnServicios) {
            Toast.makeText( view.context, "Opcion de Servicios", Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText( view.context, "Evento no definido", Toast.LENGTH_LONG).show()
        }
    }

}