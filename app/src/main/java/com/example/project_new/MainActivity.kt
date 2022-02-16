package com.example.project_new

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    lateinit var submit: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        submit = findViewById(R.id.submit)
        submit.setOnClickListener {

            Toast.makeText(applicationContext, "Submit ", Toast.LENGTH_SHORT).show()
            var intent = Intent(this,create_task::class.java)
            startActivity(intent)
        }
    }
}