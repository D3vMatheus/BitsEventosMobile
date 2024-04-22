package com.example.bitseventos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class ListarEventos : AppCompatActivity() {
    private lateinit var viewEventButton : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listar_eventos)

        viewEventButton = findViewById(R.id.ViewEvent)

        viewEventButton.setOnClickListener {
        changeToAnotherScreen(this, VisualizarEvento::class.java)
        }
    }
}