package com.example.geziuygulamasi.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.geziuygulamasi.UserModal
import com.example.geziuygulamasi.databinding.DetayRecyclerRowBinding

class CommentAdapter(private val emailList : ArrayList<UserModal>): RecyclerView.Adapter<CommentAdapter.MyHolder>() {

    class MyHolder(val binding: DetayRecyclerRowBinding) : RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val binding = DetayRecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MyHolder(binding)
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.binding.txtRecyclerEmail.text = emailList[position].email
        holder.binding.txtRecyclerComment.text = emailList[position].comment
        holder.binding.recyclerRating.text = emailList[position].rating.toString()
    }

    override fun getItemCount(): Int {
        return emailList.size
    }

}