package com.example.todo_list

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val btnNavigate: Button = findViewById(R.id.btn_submit)
        btnNavigate.setOnClickListener {
            val intentNavigate = Intent(this, Todo_List().javaClass).apply {}
            startActivity(intentNavigate)

        }


    }
}