package com.example.tugas2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class myAdapter (private val list_negara :ArrayList<item_negara>):

        RecyclerView.Adapter<myAdapter.ImageViewHolder>(){

        var onItemClick : ((item_negara) -> Unit)? = null

            class ImageViewHolder(itemView : View):RecyclerView.ViewHolder(itemView){
                val imageView : ImageView = itemView.findViewById(R.id.image1)
                val imageTitle : TextView = itemView.findViewById(R.id.txta1)
                val imagedeskripsi : TextView = itemView.findViewById(R.id.txta2)

            }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.tampilan_list_negara,parent,false)
        return ImageViewHolder(view)
    }

    override fun getItemCount(): Int {
       return list_negara.size
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        val main = list_negara[position]
        holder.imageView.setImageResource(main.gambar)
        holder.imageTitle.text = main.nama
        holder.imagedeskripsi.text = main.tahun

        holder.itemView.setOnClickListener{
            onItemClick?.invoke(main)
        }
    }
}