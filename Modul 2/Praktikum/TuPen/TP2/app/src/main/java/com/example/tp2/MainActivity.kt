package com.example.tp2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonuno = findViewById<Button>(R.id.button1)
        buttonuno.setOnClickListener {
            val Intent = Intent(
                this, TP_Layout::class.java
            )
            startActivity(Intent)

            val buttonduo = findViewById<Button>(R.id.button2)
            buttonduo.setOnClickListener {
                val Intent = Intent(
                    this, TP_LAYOUT2::class.java
                )
                startActivity(Intent)

                val buttontiga = findViewById<Button>(R.id.button3)
                buttontiga.setOnClickListener {
                    val Intent = Intent(
                        this, TP_Layout3::class.java
                    )
                    startActivity(Intent)

                }
            }
        }
    }
}