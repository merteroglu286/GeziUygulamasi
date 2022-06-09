package com.example.geziuygulamasi.Kategoriler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.geziuygulamasi.Adapters.KategoriAdapter
import com.example.geziuygulamasi.KategoriModal
import com.example.geziuygulamasi.R
import com.example.geziuygulamasi.databinding.ActivityKutuphanelerBinding
import com.example.geziuygulamasi.databinding.ActivityMainBinding
import com.example.geziuygulamasi.databinding.ActivityMarketlerBinding

class MarketlerActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMarketlerBinding
    private lateinit var recyclerView : RecyclerView
    private lateinit var adapter: KategoriAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMarketlerBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val data : MutableList<KategoriModal> = ArrayList()

        data.add(KategoriModal(R.drawable.hazar.toString(),"Hazar Market","Adres: Yenişehir, Ravza Cd. No:45, 47200 Mardin Merkez/Mardin","","08:00 - 22:00",0,false))
        data.add(KategoriModal(R.drawable.ortadogu.toString(),"Ortadoğu Market","Adres: 13 Mart, Mehtap Cd. No:12, 47200 Mardin Merkez/Mardin","","08:00 - 22:00",1,true))
        data.add(KategoriModal(R.drawable.aydin.toString(),"Aydın Market","Adres: 13 Mart, Mehtap Cd. No:7, 47200 Mardin Merkez/Mardin","","08:00 - 22:00",2,false))
        data.add(KategoriModal(R.drawable.baris.toString(),"Barış Market","Adres: Yenişehir, Barış Cd. No:15, 47200 Mardin Merkez/Mardin","","08:00 - 22:00",3,false))
        data.add(KategoriModal(R.drawable.mega.toString(),"Mega Yöresel Market","Adres: Yenişehir, PTT Cd. No:13, 47200 Mardin Merkez/Mardin","","08:00 - 22:00",4,true))


        recyclerView = binding.marketRecyclerView
        adapter = KategoriAdapter(data)
        recyclerView.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL,
            false
        )
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = adapter
    }
}