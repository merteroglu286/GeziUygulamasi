package com.example.geziuygulamasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.geziuygulamasi.Adapters.CardAdapter
import com.example.geziuygulamasi.databinding.ActivityMainBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var user : FirebaseAuth
    private lateinit var recyclerView : RecyclerView
    private lateinit var adapter: CardAdapter
    private lateinit var databaseReference: DatabaseReference


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        user = FirebaseAuth.getInstance()
        databaseReference = FirebaseDatabase.getInstance().reference

        binding.cikisYap.setOnClickListener {
            user.signOut()
            startActivity(Intent(this,SignInActivity::class.java))
            finish()
        }

        val email = user.currentUser!!.email!!

        binding.txtEmail.text = email


        val kategoriData : MutableList<Modal> = ArrayList()

        kategoriData.add(Modal("Parklar"))
        kategoriData.add(Modal("Kütüphaneler"))
        kategoriData.add(Modal("Tarihi Yerler"))
        kategoriData.add(Modal("Oteller"))
        kategoriData.add(Modal("Marketler"))
        kategoriData.add(Modal("İbadet Yerleri"))
        kategoriData.add(Modal("Otoparklar"))


        recyclerView = binding.recyclerView
        adapter = CardAdapter(kategoriData)

        recyclerView.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.HORIZONTAL,
            false
        )
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = adapter
    }


}