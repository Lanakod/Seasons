package com.left2create.seasons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun summerClick(view: View)
    {
        val result = findViewById<TextView>(R.id.textView)
        result.text = "Лето"
    }

    fun winterClick(view: View)
    {
        val result = findViewById<TextView>(R.id.textView)
        result.text = "Зима"
    }

    fun springClick(view: View)
    {
        val result = findViewById<TextView>(R.id.textView)
        result.text = "Весна"
    }

    fun autumnClick(view: View)
    {
        val result = findViewById<TextView>(R.id.textView)
        result.text = "Осень"
    }

    fun exitClick(view: View)
    {
        exitProcess(0)
    }
}