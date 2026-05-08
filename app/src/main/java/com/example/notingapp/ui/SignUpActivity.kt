package com.example.notingapp.ui

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.notingapp.R

class SignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val email = findViewById<EditText>(R.id.emailInput)
        val password = findViewById<EditText>(R.id.passwordInput)
        val btn = findViewById<Button>(R.id.signUpBtn)

        btn.setOnClickListener {
            if (email.text.isEmpty() || password.text.isEmpty()) {
                Toast.makeText(this, "Nhập đầy đủ", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Đăng ký thành công", Toast.LENGTH_SHORT).show()
                finish()
            }
        }
    }
}