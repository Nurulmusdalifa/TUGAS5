package com.example.tugas2

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tugas2.databinding.ActivityRecyclerViewBinding


class RecyclerView : AppCompatActivity() {
    private lateinit var binding: ActivityRecyclerViewBinding

    private lateinit var produkRecyclerView: RecyclerView
    private lateinit var produkAdapter: MyAdapter
    private lateinit var listProduk: ArrayList<ItemData>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycler_view)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding = ActivityRecyclerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Btn back
        binding.btnback.setOnClickListener{
            startActivity(Intent(this, main::class.java))
        }

        produkRecyclerView = findViewById(R.id.produkRV)
        listProduk = ArrayList()

        listProduk.add(ItemData(R.drawable.indonesia, "Indonesia", "17 Agustus 1945"))
        listProduk.add(ItemData(R.drawable.malaysian, "Malaysia", "8 Agustus 1967"))
        listProduk.add(ItemData(R.drawable.myanmar, "Myanmar", "8 Agustus 1967"))
        listProduk.add(ItemData(R.drawable.brunei, "Brunei Darussalam", "7 Januari 1984"))
        listProduk.add(ItemData(R.drawable.thailand, "Thailand", "8 Agustus 1967"))
        listProduk.add(ItemData(R.drawable.kamboja, "Kamboja", "30 April 1997"))
        listProduk.add(ItemData(R.drawable.filipina, "Filipina", "8 Agustus 1967"))
        listProduk.add(ItemData(R.drawable.singapura, "Singapura", "8 Agustus1967"))
        listProduk.add(ItemData(R.drawable.laos, "Laos", "23 Juli 1997"))
        produkRecyclerView.layoutManager = LinearLayoutManager(this )
        produkRecyclerView.setHasFixedSize(true)
        produkAdapter = MyAdapter(listProduk)
        produkRecyclerView.adapter = produkAdapter

    }
}