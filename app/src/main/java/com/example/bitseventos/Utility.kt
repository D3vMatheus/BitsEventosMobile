package com.example.bitseventos
import android.content.Context
import android.content.Intent
fun changeToAnotherScreen(context: Context, targetActivityClass: Class<*>) {
    val intent = Intent(context, targetActivityClass)
    context.startActivity(intent)
}
