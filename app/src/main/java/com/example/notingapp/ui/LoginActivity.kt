package com.example.notingapp.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.notingapp.MainActivity
import com.example.notingapp.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val email = findViewById<EditText>(R.id.emailInput)
        val password = findViewById<EditText>(R.id.passwordInput)
        val loginBtn = findViewById<Button>(R.id.loginBtn)
        val goSignUp = findViewById<TextView>(R.id.goSignUp)

        // 👉 Xử lý nút LOGIN
        loginBtn.setOnClickListener {
            if (email.text.isEmpty() || password.text.isEmpty()) {
                Toast.makeText(this, "Nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show()
            } else {
                // tạm thời cho login thành công
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            }
        }

        // 👉 Xử lý click SIGN UP
        goSignUp.setOnClickListener {
            startActivity(Intent(this, SignUpActivity::class.java))
        }
    }
}