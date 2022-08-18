package com.example.birthdaycardapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        createBirthdayButton.setOnClickListener {
//
//        }
    }

    fun createBirthdayCard(view: View) {
//        val name = nameInput.editableText.toString()
//        Toast.makeText(this, "Your name is $name", Toast.LENGTH_LONG).show()

        val name = nameInput.editableText.toString()

        if (name == "") {
            Toast.makeText(this, "Don't let the field empty.", Toast.LENGTH_LONG).show()
        } else {
            val intent = Intent(this, BirthdayGreetActivity::class.java)
            intent.putExtra(BirthdayGreetActivity.NAME_EXTRA, name)
            startActivity(intent)
        }

    }


}