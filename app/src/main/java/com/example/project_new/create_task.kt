package com.example.project_new

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class create_task : AppCompatActivity() {

    lateinit var create: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_task)

        create=findViewById(R.id.create)
        create.setOnClickListener {

            Toast.makeText(applicationContext, "Create successful", Toast.LENGTH_SHORT).show()
            var intent = Intent(this,add_volunteer::class.java)
            startActivity(intent)
        }
    }
}