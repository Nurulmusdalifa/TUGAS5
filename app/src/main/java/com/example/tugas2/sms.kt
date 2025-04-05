package com.example.tugas2

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class sms : AppCompatActivity() {

    private lateinit var editTextPhone: EditText
    private lateinit var editTextMessage: EditText
    private lateinit var buttonSend: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sms)

        editTextPhone = findViewById(R.id.editTextPhone)
        editTextMessage = findViewById(R.id.editTextMessage)
        buttonSend = findViewById(R.id.buttonSend)

        buttonSend.setOnClickListener {
            val phoneNumber = editTextPhone.text.toString()
            val message = editTextMessage.text.toString()

            if (phoneNumber.isNotEmpty() && message.isNotEmpty()) {
                val uri = Uri.parse("smsto:$phoneNumber")
                val intent = Intent(Intent.ACTION_SENDTO, uri)
                intent.putExtra("sms_body", message)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Nomor atau pesan tidak boleh kosong", Toast.LENGTH_SHORT).show()
            }
        }
    }
}