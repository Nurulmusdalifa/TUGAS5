package com.example.tugas2

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class tampilan_detail_list_negara : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.tampilan_detail_list_negara)

        val negara = intent.getParcelableExtra<item_negara>("negara")
        if (negara!= null) {
            val imageView: ImageView = findViewById(R.id._imageDetail)
            val textViewTitle: TextView = findViewById(R.id._imageTitle)
            val textViewDesc: TextView = findViewById(R.id._imageDesc)

            imageView.setImageResource(negara.imageSource)
            textViewTitle.text = negara.imageTitle
            textViewDesc.text = negara.imageDesc
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.negara)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    }
}