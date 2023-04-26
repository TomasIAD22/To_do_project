package com.example.todo_list

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        val btnNavigate: Button = findViewById(R.id.btn_register1)
        btnNavigate.setOnClickListener {
            val intentNavigate = Intent(this, LoginActivity().javaClass).apply {}
            startActivity(intentNavigate)

        }
    }
}