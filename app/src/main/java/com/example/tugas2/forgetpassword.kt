package com.example.tugas2

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tugas2.databinding.ActivityForgetpasswordBinding
import kotlin.jvm.java

class forgetpassword : AppCompatActivity() {
    private lateinit var binding: ActivityForgetpasswordBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_forgetpassword)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.login)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding = ActivityForgetpasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //pesan
        binding.btnpassword.setOnClickListener {
            Toast.makeText(this, "Password telah diperbarui.", Toast.LENGTH_SHORT).show()
        }

        // kembali ke login
        binding.txtbacklogin.setOnClickListener {
            startActivity(Intent(this, login::class.java))
        }
    }
}