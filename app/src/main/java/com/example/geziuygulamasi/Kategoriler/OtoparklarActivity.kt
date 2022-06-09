package com.example.geziuygulamasi.Kategoriler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.geziuygulamasi.Adapters.KategoriAdapter
import com.example.geziuygulamasi.KategoriModal
import com.example.geziuygulamasi.R
import com.example.geziuygulamasi.databinding.ActivityMarketlerBinding
import com.example.geziuygulamasi.databinding.ActivityOtellerBinding
import com.example.geziuygulamasi.databinding.ActivityOtoparklarBinding

class OtoparklarActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOtoparklarBinding
    private lateinit var recyclerView : RecyclerView
    private lateinit var adapter: KategoriAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOtoparklarBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val data : MutableList<KategoriModal> = ArrayList()

        data.add(KategoriModal(R.drawable.koseoglu.toString(),"Köseoğlu Otopark","Adres: Cumhuriyet, 47510 midyat /mardin/Midyat/Mardin","30 TL","07:00 - 00:00",0,false))
        data.add(KategoriModal(R.drawable.mardin_otopark.toString(),"Mardin Otopark","Adres: Tepebaşı, Sobacılar Cd. No:75, 47460 Kızıltepe/Mardin","60 TL","24 saat açık",1,true))
        data.add(KategoriModal(R.drawable.kayapark.toString(),"Kayapark Kapalı Oto Yıkama","Adres: Eski Hastane Cad. Tarçın Apt. No:1/1, Kızıltepe/Mardin","50 TL","07:00 - 00:00",2,false))
        data.add(KategoriModal(R.drawable.zagros.toString(),"Zagros Otopark","Adres: YTepebaşı, 643. Sk., 47460 Kızıltepe/Mardin","30 TL","24 saat açık",3,false))

        recyclerView = binding.otoparkRecyclerView
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