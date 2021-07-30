package com.example.spotify

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class SignUp : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val btnLogin=findViewById<Button>(R.id.btn1)
        val already =findViewById<TextView>(R.id.already)
        btnLogin.setOnClickListener{
            val x=findViewById<EditText>(R.id.password)
            val password=x.text.toString()

            val y=findViewById<EditText>(R.id.userName)
            val userName=y.text.toString()

            val v=findViewById<EditText>(R.id.email)
            val email=v.text.toString()

            if (userName==userName&&password==password){
                Toast.makeText(this,"SignUp is successful",Toast.LENGTH_SHORT).show()
                val intent= Intent(this,MainActivity::class.java)
                startActivity(intent)
            }
            else{
                Toast.makeText(this,"please provide rightful details",Toast.LENGTH_SHORT).show()
            }
        }
        already.setOnClickListener {
            val intent=Intent(this,Login::class.java)
            startActivity(intent)
        }
    }
}