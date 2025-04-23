package com.example.tugas2

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tugas2.databinding.HalamanUtamaBinding
import com.example.tugas2.Profile
import com.google.android.material.bottomnavigation.BottomNavigationView

class HalamanUtama : AppCompatActivity() {

    private lateinit var binding: HalamanUtamaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = HalamanUtamaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Window insets
        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Tombol RecyclerView
        binding.btnrv.setOnClickListener {
            val intent = Intent(this, list_negara::class.java)
            startActivity(intent)
        }

        // Tombol Kirim SMS
        binding.btntugas3.setOnClickListener {
            val textToSend = "Hi!"
            val sendIntent = Intent(Intent.ACTION_SEND).apply {
                type = "text/plain"
                putExtra(Intent.EXTRA_TEXT, textToSend)
            }
            val chooserIntent = Intent.createChooser(sendIntent, "Pilih aplikasi untuk mengirim pesan")
            startActivity(chooserIntent)
        }

        // Bottom Navigation
        val bottomNavigation = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNavigation.setOnItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.navigation_settings -> {
                    Toast.makeText(this, "Settings click", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.navigation_search -> {
                    Toast.makeText(this, "Search click", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.navigation_profile -> {
                    val intent = Intent (this, Profile::class.java)
                    startActivity(intent)
                    true
                }
                else -> false
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.logout -> {
                startActivity(Intent(this, login::class.java))
                finish()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}