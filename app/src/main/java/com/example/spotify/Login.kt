package com.example.spotify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val btnSignUp=findViewById<Button>(R.id.login)
        val dont=findViewById<TextView>(R.id.dont)
        btnSignUp.setOnClickListener{
            val a=findViewById<EditText>(R.id.pass)
            val password=a.text.toString()

            val b=findViewById<EditText>(R.id.user)
            val userName=b.text.toString()
            if (userName==userName&&password==password){
                Toast.makeText(this,"login successful",Toast.LENGTH_SHORT).show()
                val intent=Intent(this,MainActivity::class.java)
                startActivity(intent)
            }
            else{
                Toast.makeText(this,"please enter valid details",Toast.LENGTH_SHORT).show()
            }
        }
        dont.setOnClickListener {
            val intent=Intent(this,SignUp::class.java)
            startActivity(intent)
        }
    }


        }


