package com.example.tugas2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tugas2.databinding.ActivityProfileBinding

class Profile : AppCompatActivity() {

    private lateinit var binding: ActivityProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Menggunakan ViewBinding
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Mengisi data
        setupProfile()
    }

    private fun setupProfile() {
        binding.nama.text = "Nurul musdalifa"
        binding.tanggal.text = "03-10-2004"
        binding.nomor.text = "+62 857-7605-3833"
        binding.txtumur.text = "21 tahun"

        // Opsional: klik edit
        binding.editProfile.setOnClickListener {
            // Tambahkan aksi edit di sini
        }
    }
}