package com.example.tugas2

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tugas2.databinding.ActivityMainBinding
class main : AppCompatActivity() {
    companion object {
        const val EXTRA_MESSAGE = "com.example.tugas2.EXTRA_MESSAGE"
    }
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val message: String = intent.getStringExtra(EXTRA_MESSAGE).toString()
        val textView: TextView = findViewById(R.id.textUsername)
            textView.text = "Hallo $message"


        binding.btnLogout.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
            startActivity(intent)
            finish()
        }

        // Btn RV
        binding.btnrv.setOnClickListener{
            startActivity(Intent(this, RecyclerView::class.java))
        }
        //btntugas3
        binding.btntugas3.setOnClickListener{
            startActivity(Intent(this, sms::class.java))
        }

    }
}