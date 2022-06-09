package com.example.geziuygulamasi.Kategoriler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.geziuygulamasi.Adapters.KategoriAdapter
import com.example.geziuygulamasi.KategoriModal
import com.example.geziuygulamasi.R
import com.example.geziuygulamasi.databinding.ActivityKutuphanelerBinding

class KutuphanelerActivity : AppCompatActivity() {
    private lateinit var binding: ActivityKutuphanelerBinding
    private lateinit var recyclerView : RecyclerView
    private lateinit var adapter: KategoriAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKutuphanelerBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val data : MutableList<KategoriModal> = ArrayList()

        data.add(KategoriModal(R.drawable.halk_kutuphanesi.toString(),"Mardin Halk Kutuphanesi","11 bin 600 metrekare alana kurulu ve 100 binden fazla kitabın bulunduğu kütüphane, bölgenin en büyük kütüphanesi olma özelliğine sahip. Kütüphanenin deposuyla 700 bin kitap kapasitesi bulunuyor.","ücretsiz","09:00 - 05:00",0,true))
        data.add(KategoriModal(R.drawable.mardin_muzesi_cocuk_kutuphanesi.toString(),"Mardin Müzesi Çocuk Kütüphanesi","Mardin Müzesi Çocuk Kütüphanesi , ÇOCUK KÜTÜPHANESİ olarak hizmet vermektedir. ","ücretsiz","09:00 - 05:00",1,true))
        data.add(KategoriModal(R.drawable.mehmet_agirakca_kutuphanesi.toString(),"Prof. Dr. Mehmet Ağırakça Kütüphanesi","Çağlar, 47100 Artuklu/Mardin adresinde bulunan bir kütüphanedir.","ücretsiz","09:00 - 22:00 ",2,false))
        data.add(KategoriModal(R.drawable.halkkutuphanesi.toString(),"Midyat İlçe Halk Kütüphanesi","Yeni, 47500 Midyat/Mardin adresinde bulunan, Midyat ilçesi sınırları içerisindeki kütüphanelerden biridir.","ücretsiz","09:00 - 05:00",3,false))
        data.add(KategoriModal(R.drawable.uykusuz_kutuphane.toString(),"Mardin Uykusuz Kütüphanesi","umut fotokopi yanı, Ravza caddesi adana dostlar kebap salonu, karşısı, 47100 Artuklu/Mardin adresinde bulunan yaygın bir kütüphanedir.","ücretsiz","08:00 - 22:00",4,false))


        recyclerView = binding.kutuphaneRecyclerView
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