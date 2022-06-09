package com.example.geziuygulamasi.Adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.example.geziuygulamasi.DetayActivity
import com.example.geziuygulamasi.KategoriModal
import com.example.geziuygulamasi.R

class KategoriAdapter(private val kategoriData : List<KategoriModal>) : RecyclerView.Adapter<KategoriAdapter.ViewHolder>() {


    private val items: MutableList<CardView>

    init {
        this.items = ArrayList()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.kategori_card_view,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.title.text = kategoriData[position].title
        holder.genelBilgi.text = kategoriData[position].genelBilgi
        holder.ucret.text = kategoriData[position].ucret
        holder.saat.text = kategoriData[position].saat
        holder.imageView.setImageResource(kategoriData[position].image.toInt())

        holder.star.isVisible = kategoriData[position].favoriMi == true

        items.add(holder.cardView)


        holder.yorum.setOnClickListener {
            val intent = Intent(it.context,DetayActivity::class.java)
            intent.putExtra("title",kategoriData[position].title)
            intent.putExtra("genel_bilgi",kategoriData[position].genelBilgi)
            intent.putExtra("ucret",kategoriData[position].ucret)
            intent.putExtra("saat",kategoriData[position].saat)
            intent.putExtra("resim",kategoriData[position].image)
            intent.putExtra("index",kategoriData[position].index.toString())
            it.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return kategoriData.size
    }


    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val cardView : CardView = itemView.findViewById(R.id.cardView)
        val imageView: ImageView = itemView.findViewById(R.id.cardView_image)
        val title:TextView =itemView.findViewById(R.id.cardView_title)
        val star: ImageView = itemView.findViewById(R.id.starView)
        val saat: TextView = itemView.findViewById(R.id.textView_saat)
        val genelBilgi:TextView =itemView.findViewById(R.id.textView_genel_bilgi)
        val ucret:TextView =itemView.findViewById(R.id.textView_ucret)
        val yorum: TextView = itemView.findViewById(R.id.yorum_tikla)
    }
}