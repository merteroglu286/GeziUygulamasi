package com.example.geziuygulamasi.Adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.geziuygulamasi.Kategoriler.*
import com.example.geziuygulamasi.Modal
import com.example.geziuygulamasi.R

class CardAdapter(private val cardData :List<Modal>) : RecyclerView.Adapter<CardAdapter.MyViewHolder>() {


    private val items: MutableList<CardView>

    init {
        this.items = ArrayList()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.textView.text = cardData[position].title
        items.add(holder.cardView)

        if (cardData[position] == cardData[0]){
            holder.button.setOnClickListener {
                val intent = Intent(it.context, ParklarActivity::class.java)
                it.context.startActivity(intent)
            }
        }
        if (cardData[position] == cardData[1]){
            holder.button.setOnClickListener {
                val intent = Intent(it.context, KutuphanelerActivity::class.java)
                it.context.startActivity(intent)
            }
        }
        if (cardData[position] == cardData[2]){
            holder.button.setOnClickListener {
                val intent = Intent(it.context, TarihiYerlerActivity::class.java)
                it.context.startActivity(intent)
            }
        }
        if (cardData[position] == cardData[3]){
            holder.button.setOnClickListener {
                val intent = Intent(it.context, OtellerActivity::class.java)
                it.context.startActivity(intent)
            }
        }
        if (cardData[position] == cardData[4]){
            holder.button.setOnClickListener {
                val intent = Intent(it.context, MarketlerActivity::class.java)
                it.context.startActivity(intent)
            }
        }
        if (cardData[position] == cardData[5]){
            holder.button.setOnClickListener {
                val intent = Intent(it.context, IbadetYerleriActivity::class.java)
                it.context.startActivity(intent)
            }
        }
        if (cardData[position] == cardData[6]){
            holder.button.setOnClickListener {
                val intent = Intent(it.context, OtoparklarActivity::class.java)
                it.context.startActivity(intent)
            }
        }
    }

    override fun getItemCount(): Int {
        return cardData.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView:TextView =itemView.findViewById(R.id.textView_title)
        val cardView : CardView = itemView.findViewById(R.id.cardView)
        val button : Button = itemView.findViewById(R.id.cardView_button)
    }
}