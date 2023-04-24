package com.example.todo_list

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnNavigate: Button = findViewById(R.id.btn_loggin)
        val btnNavigate: Button = findViewById(R.id.btn_register)

        btnNavigate.setOnClickListener{
            val intentNavigate = Intent(this, LoginActivity().javaClass).apply {
                val intentNavigate = Intent(this, RegisterActivity().javaClass).apply
            }

            startActivity(intentNavigate)}

    }
    }

