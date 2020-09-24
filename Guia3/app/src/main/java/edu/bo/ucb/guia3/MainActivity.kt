package edu.bo.ucb.guia3

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.Toast
import android.view.View
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnWhite.setOnClickListener{
            toast("White")
            layoutPrincipal.setBackgroundColor(Color.WHITE)
        }

        btnRed.setOnClickListener({
            toast("Red")
            layoutPrincipal.setBackgroundColor(Color.RED)
        })
    }
    private fun toast(text: String, duration: Int = Toast.LENGTH_LONG) = Toast.makeText(this@MainActivity, text, Toast.LENGTH_LONG).show()
}