package com.example.bitseventos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Button

class VisualizarEvento : AppCompatActivity() {
    private lateinit var subscribeInEvent : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_visualizar_evento)

        subscribeInEvent = findViewById(R.id.Subscribe)

        subscribeInEvent.setOnClickListener {
            Toast.makeText(this, "Sucessfully registered", Toast.LENGTH_SHORT).show()
        }
    }
}