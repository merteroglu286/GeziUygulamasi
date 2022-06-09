package com.example.geziuygulamasi.Kategoriler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.geziuygulamasi.Adapters.KategoriAdapter
import com.example.geziuygulamasi.KategoriModal
import com.example.geziuygulamasi.R
import com.example.geziuygulamasi.databinding.ActivityParklarBinding

class ParklarActivity : AppCompatActivity() {
    private lateinit var binding: ActivityParklarBinding
    private lateinit var recyclerView : RecyclerView
    private lateinit var adapter: KategoriAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityParklarBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val data : MutableList<KategoriModal> = ArrayList()

        data.add(KategoriModal(R.drawable.mezepotamya_parki.toString(),"Tabiat Parkı","Mardin İli Derik İlçesi sınırları içerisinde kalan ve ilçe merkezine 5 km. uzaklıkta bulunan tabiat parkımızdır. 527 dekar alana sahip olup şelale ve jeolojik değerler açısından zengindir.","ücretsiz","08:00 - 22:00",0,true))
        data.add(KategoriModal(R.drawable.musa_anter_parki.toString(),"Musa Anter Parkı","Mardin'in Merkez ilçesinde bulunan bir parktır.Güncel adres: Yenişehir, Ravza Cd. No:58, 47200 Mardin Merkez/Mardin","ucretsiz","24 saat açık",1,false))
        data.add(KategoriModal(R.drawable.dedas_parki.toString(),"Dedas Parkı","Mardin ili Artuklu İlçesi sınırları içerisinde bulunan bir ziyaretçi parkıdır.","ücretsiz","24 saat açık",3,false))
        data.add(KategoriModal(R.drawable.babessor_parki.toString(),"Babessor Parkı","Babessor Parkı, Park olarak hizmet vermektedir. Mardin ilinde Artuklu ilçesinde olan Babessor Parkı, Park dir. Artuklu ilçesinde Park arandığında Babessor Parkı, Park olarak hizmet vermektedir.","ücretsiz","24 saat açık",4,false))
        data.add(KategoriModal(R.drawable.demokrasi_parki.toString(),"Demokrasi Parkı","Demokrasi Parkı Mardin (Park), Savur İlçesi, Mardin'de yer almaktadır. Demokrasi Parkı Mardin'in Adresi Yenişehir, Vali Ozan Blv. No:61, 47200 Artuklu/Mardin, Türkiye.","ücretsiz","08:00 - 05:00",5,true))




        recyclerView = binding.parklarRecyclerView
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