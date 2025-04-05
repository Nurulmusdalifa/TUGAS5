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

        listProduk.add(ItemData(R.drawable.soekarno, "Ir Soekarno", "Presiden pertama Indonesia"))
        listProduk.add(ItemData(R.drawable.mohhatta, "Moh.Hatta", "Wakil Presiden pertama indonesia"))
        listProduk.add(ItemData(R.drawable.kihajardewantara, "Ki.Hajar Dewantara", "Bapak Pendidikan indonesia"))
        listProduk.add(ItemData(R.drawable.dipenogoro, "Pangeran Dipenogora", "Ksatria Piningit atau Ksatria Tersembunyi"))
        listProduk.add(ItemData(R.drawable.kartini, "Ra Kartini", "Pahlawan emansipasi wanita"))
        listProduk.add(ItemData(R.drawable.sultanhasanuddin, "Sultan Hasanuddin", "ayam jantan dari Timur"))
        listProduk.add(ItemData(R.drawable.franskaisepo, "Frans Kaisepo", "Pahlawan dari Papua yang pertama kali mengibarkan bendera Merah Putih di Indonesia"))

        produkRecyclerView.layoutManager = LinearLayoutManager(this )
        produkRecyclerView.setHasFixedSize(true)
        produkAdapter = MyAdapter(listProduk)
        produkRecyclerView.adapter = produkAdapter

    }
}