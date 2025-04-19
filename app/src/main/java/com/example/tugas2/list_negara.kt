package com.example.tugas2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tugas2.databinding.ListNegaraBinding

class list_negara : AppCompatActivity() {
    private lateinit var binding: ListNegaraBinding

    private lateinit var negaraRecyclerView : RecyclerView
    private lateinit var myAdapter: myAdapter
    private lateinit var listnegara : ArrayList<item_negara>

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ListNegaraBinding.inflate(layoutInflater)
        setContentView(binding.root)

        listnegara = ArrayList()
        listnegara.add(
            item_negara(
                R.drawable.indonesia,
                "Indonesia",
                "17 Agustus 1945",
                R.drawable.indonesia,
                "Indonesia",
                "Indonesia merdeka pada 17 Agustus 1945, setelah dijajah Belanda selama lebih dari 300 tahun dan diduduki Jepang selama 3 tahun. Setelah Jepang menyerah kepada Sekutu, Soekarno dan Hatta memproklamasikan kemerdekaan di Jakarta. Proklamasi ini ditulis dan dibacakan oleh mereka atas nama bangsa Indonesia. Namun, Belanda tidak langsung mengakui kemerdekaan, sehingga terjadi perjuangan diplomasi dan pertempuran bersenjata. Akhirnya, Belanda mengakui kedaulatan Indonesia pada 27 Desember 1949."
            )
        )

        listnegara.add(
            item_negara(
                R.drawable.malaysian,
                "malaysia",
                "31 agustus 1957",
                R.drawable.malaysian,
                "Malaysia",
                "Malaysia (dahulu Malaya) merdeka pada 31 Agustus 1957 dari penjajahan Inggris. Kemerdekaan diproklamasikan oleh Tunku Abdul Rahman, Perdana Menteri pertama Malaysia, di Stadium Merdeka, Kuala Lumpur. Proses menuju kemerdekaan dilakukan secara damai melalui negosiasi dengan Inggris. Pada 16 September 1963, terbentuklah Malaysia, yang merupakan gabungan Federasi Malaya, Sabah, Sarawak, dan Singapura (meskipun Singapura keluar pada 1965 dan menjadi negara sendiri."
            )
        )

        listnegara.add(
            item_negara(
                R.drawable.singapura,
                "Singapura",
                "9 Agustus 1965",
                R.drawable.singapura,
                "Singapura",
                "Singapura merdeka pada 9 Agustus 1965, setelah keluar dari Federasi Malaysia. Awalnya, Singapura bergabung dengan Malaysia pada 16 September 1963, namun terjadi ketegangan politik dan ekonomi antara pemimpin Singapura dan pemerintah pusat Malaysia. Karena konflik tersebut, Singapura dikeluarkan dari federasi dan menjadi negara merdeka secara resmi pada 9 Agustus 1965. Kemerdekaan ini diumumkan oleh Lee Kuan Yew, yang kemudian menjadi Perdana Menteri pertama Singapura dan tokoh penting dalam membangun negara tersebut."
            )
        )

                listnegara.add(
            item_negara(
                R.drawable.thailand,
                "Thailand",
                "24 Juni 1932",

                R.drawable.thailand,
                "Thailand",
                "Thailand adalah satu-satunya negara di Asia Tenggara yang tidak pernah dijajah oleh bangsa Barat. Dahulu dikenal sebagai Siam, negara ini mengalami modernisasi besar-besaran pada abad ke-19 di bawah Raja Rama IV (Mongkut) dan Rama V (Chulalongkorn), yang berhasil menjaga kemerdekaan dengan bernegosiasi dan menyeimbangkan kekuatan kolonial Inggris dan Prancis Pada tahun 1932, sistem pemerintahan berubah dari monarki absolut menjadi monarki konstitusional melalui kudeta damai. Nama Thailand, yang berarti \"Tanah Kebebasan,\" resmi digunakan sejak tahun 1939 (dan kembali digunakan setelah sempat diganti selama Perang Dunia II)."
            )
                )
        listnegara.add(
            item_negara(
                R.drawable.filipina,
                "Filipina",
                "12 Juni 1998",
                R.drawable.filipina,
                "Filipina",
                "Filipina merdeka pada 12 Juni 1898 dari penjajahan Spanyol, diproklamasikan oleh Emilio Aguinaldo, pemimpin revolusi Filipina. Namun, kemerdekaan ini belum diakui secara internasional karena setelah itu Filipina dijajah oleh Amerika Serikat akibat Perang Spanyol–Amerika. Setelah perjuangan panjang, kemerdekaan Filipina secara resmi diakui oleh Amerika pada 4 Juli 1946, setelah berakhirnya Perang Dunia II."
            )
        )
        listnegara.add(
            item_negara(
                R.drawable.vietnam,
                "Vietnam",
                "2 Desember 1945",
                R.drawable.vietnam,
                "Vietnam",
                "Vietnam merdeka pada 2 September 1945 dari penjajahan Prancis dan Jepang. Kemerdekaan ini diproklamasikan oleh Ho Chi Minh di Hanoi, setelah Jepang menyerah pada akhir Perang Dunia II. Namun, Prancis berusaha kembali menguasai Vietnam, sehingga terjadi Perang Indochina. Setelah kemenangan Vietnam dalam Pertempuran Dien Bien Phu (1954), Prancis akhirnya mundur, dan Vietnam terbagi menjadi dua: Vietnam Utara (komunis) dan Vietnam Selatan (didukung Barat) Vietnam bersatu kembali pada tahun 1975, setelah perang Vietnam berakhir dan pasukan komunis merebut Saigon."
            )
        )
        listnegara.add(
            item_negara(
                R.drawable.laos,
                "Laos",
                "2 Desember 1975",
                R.drawable.laos,
                "Laos",
                "Laos merdeka dari Prancis pada 19 Juli 1949 sebagai kerajaan konstitusional, tetapi masih berada di bawah pengaruh kolonial. Kemerdekaan penuh dan efektif baru tercapai setelah kemenangan gerakan komunis Pathet Lao, yang memproklamasikan berdirinya Republik Demokratik Rakyat Laos pada 2 Desember 1975."
            )
        )
        listnegara.add(
            item_negara(
                R.drawable.kamboja,
                "Kamboja",
                "9 Novemer 1953",
                R.drawable.kamboja,
                "Kamboja",
                "Kamboja merdeka dari Prancis pada 9 November 1953. Setelah menjadi bagian dari Indochina Prancis sejak abad ke-19, Raja Norodom Sihanouk memimpin perjuangan diplomatik yang akhirnya berhasil membuat Prancis menyerahkan kedaulatan penuh tanpa perang. Namun, setelah merdeka, Kamboja mengalami masa-masa sulit, termasuk perang saudara, kekuasaan Khmer Merah (1975–1979) yang brutal, dan intervensi asing sebelum akhirnya stabil sebagai kerajaan konstitusional."
            )
        )
        listnegara.add(
            item_negara(
                R.drawable.myanmar,
                "Myanmar",
                "4 Januari 1948",
                R.drawable.myanmar,
                "Myanmar",
                "Myanmar (dulu bernama Burma) merdeka dari Inggris pada 4 Januari 1948. Setelah dijajah sejak abad ke-19, Myanmar menjadi bagian dari Kekaisaran Britania hingga Perang Dunia II. Selama perang, Jepang sempat menduduki wilayah Myanmar, tetapi setelah Jepang kalah, Inggris kembali menguasainya. Gerakan nasionalis yang dipimpin oleh Jenderal Aung San menekan Inggris untuk memberi kemerdekaan. Meski Aung San dibunuh pada 1947, perjuangannya berhasil, dan Myanmar merdeka setahun kemudian sebagai negara republik."
            )
        )
        listnegara.add(
            item_negara(
                R.drawable.brunei,
                "Brunei Darusallam",
                "2 Januari 1984",
                R.drawable.brunei,
                "Brunei Darusallam",
                "Brunei merdeka dari Inggris pada 1 Januari 1984 Brunei merupakan protektorat Inggris sejak tahun 1888. Meskipun memiliki pemerintahan sendiri, urusan luar negeri dan pertahanan ditangani oleh Inggris. Setelah melalui beberapa tahap otonomi, Brunei akhirnya menyatakan kemerdekaan penuh secara damai pada 1 Januari 1984, dengan Sultan Hassanal Bolkiah sebagai pemimpin negara. Brunei memilih tetap menjadi monarki absolut dengan Islam sebagai agama resmi."
            )
        )








        negaraRecyclerView = findViewById(R.id.tampilan_list_negara)
        negaraRecyclerView.setHasFixedSize(true)
        negaraRecyclerView.layoutManager = LinearLayoutManager(this)

        myAdapter = myAdapter (listnegara)
        negaraRecyclerView.adapter = myAdapter
        myAdapter.onItemClick = {
            val intent = Intent(this, tampilan_detail_list_negara::class.java)
            intent.putExtra("negara", it)
            startActivity(intent)
        }
    }
}