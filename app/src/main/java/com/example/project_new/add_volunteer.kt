package com.example.project_new

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class add_volunteer : AppCompatActivity() {

    lateinit var submitvolunteer: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_volunteer)

        submitvolunteer=findViewById(R.id.submitvolunteer)
        submitvolunteer.setOnClickListener{

            Toast.makeText(applicationContext, "Submit successful", Toast.LENGTH_SHORT).show()
            var intent = Intent(this,add_income::class.java)
            startActivity(intent)
        }
    }
}