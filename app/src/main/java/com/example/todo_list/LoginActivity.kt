package com.example.todo_list

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val btnNavigate: Button = findViewById(R.id.btn_submit)
        val inputUsernameText: EditText = findViewById(R.id.et_username)
        val inputUsernameText1: EditText = findViewById(R.id.et_pasword)
        btnNavigate.setOnClickListener {
            val intentNavigate = Intent(this, Todo_List().javaClass).apply {
            putExtra("key_username", inputUsernameText.text.toString())
                putExtra("key_password", inputUsernameText1.text.toString())
        }
            startActivity(intentNavigate)

        }


    }
}