package com.example.bitseventos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private lateinit var usernameEditText: Email
    private lateinit var passwordEditText: Password
    private lateinit var loginButton: Entrar

    private val correctUsername = "username"
    private val correctPassword = "password"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        usernameEditText = findViewById(R.id.Email)
        passwordEditText = findViewById(R.id.Password)
        loginButton = findViewById(R.id.Entrar)

        loginButton.setOnClickListener {
            val enteredUsername = usernameEditText.text.toString()
            val enteredPassword = passwordEditText.text.toString()

            if (enteredUsername == correctUsername && enteredPassword == correctPassword) {
                // Successful login
                Toast.makeText(this, "Login successful", Toast.LENGTH_SHORT).show()
                // Proceed to next activity or perform desired action
            } else {
                // Failed login
                Toast.makeText(this, "Incorrect username or password", Toast.LENGTH_SHORT).show()
            }
        }
    }
}