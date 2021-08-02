package com.podium.userinteractionv1

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    private lateinit var output: ConstraintLayout
    private lateinit var editPerson: EditText
    private lateinit var editEmail: EditText
    private lateinit var editPhone: EditText
    private lateinit var textPerson: TextView
    private lateinit var textPhone: TextView
    private lateinit var textEmail: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editEmail = findViewById(R.id.editTextEmailAddress)
        editPerson = findViewById(R.id.editTextPersonName)
        editPhone = findViewById(R.id.editTextPhone)
        textEmail = findViewById(R.id.textEmail)
        textPerson = findViewById(R.id.textName)
        textPhone = findViewById(R.id.textPhone)
        output = findViewById(R.id.output)

        val btnDone: Button = findViewById(R.id.btnDone)
        val btnReset: Button = findViewById(R.id.btnReset)

        /* click event logic */
        btnDone.setOnClickListener { processData() }
        btnReset.setOnClickListener { clearData() }
    }

    private fun processData() {
        // extraction of data
        val phone = editPhone.text.toString()
        val email = editEmail.text.toString()
        val name = editPerson.text.toString()
        // displaying the extracted data
        textPhone.text = phone
        textEmail.text = email
        textPerson.text = name
        output.visibility = View.VISIBLE
    }

    private fun clearData() {
        output.visibility = View.GONE
        editPhone.text.clear()
        editPerson.text.clear()
        editEmail.text.clear()
    }
}