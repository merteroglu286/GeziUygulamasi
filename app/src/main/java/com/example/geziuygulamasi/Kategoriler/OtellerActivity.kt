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

class OtellerActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOtellerBinding
    private lateinit var recyclerView : RecyclerView
    private lateinit var adapter: KategoriAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOtellerBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val data : MutableList<KategoriModal> = ArrayList()

        data.add(KategoriModal(R.drawable.hilton.toString(),"Hilton Garden Inn Mardin","Türkiye'nin Mezopotamya platosuna ve antik, bozulmamış Mardin şehrine bakan Hilton Garden Inn Mardin oteli, Mardin Havalimanı yolunda elverişli bir konuma sahiptir. Bu Türk otelinin tüm şık Konuk Odaları ve Süitlerinde lüks Garden Sleep System® yataklar, ücretsiz kablolu ve kablosuz internet erişimi, 32 inç LCD TV ve ergonomik sandalyeli geniş bir çalışma masası bulunmaktadır.","1.274,44 TL","24 saat açık",0,false))
        data.add(KategoriModal(R.drawable.zinciriye.toString(),"Zinciriye Hotel","Zinciriye Hotel - Special Class konaklamanızda, Mardin merkezinde, Zinciriye Medresesi yakınında ve Mardin Müzesi ile 10 dakika yürüme mesafesinde olacaksınız. Misafirler için hızlı giriş, hızlı çıkış ve kuru temizleme/çamaşırhane mevcuttur. Ek ücret karşılığında (24 saat mevcut) gidiş-dönüş havaalanı servisi sağlanmaktadır.","1.016,31 TL","24 saat açık",1,true))
        data.add(KategoriModal(R.drawable.mardius.toString(),"Mardius Tarihi Konak","Mardius Tarihi Konak konaklamanızda Mardin (Artuklu) bölgesinde, Mardin Ulu Cami ve Ulu Cami yakınında olacaksınız. Misafirler için lobide ücretsiz gazete servisi, 24 saat açık resepsiyon ve bagaj muhafazası mevcuttur. Ek ücret karşılığında (24 saat mevcut) gidiş-dönüş havaalanı servisi sağlanmaktadır.","5.649,99 TL","24 saat açık",2,false))
        data.add(KategoriModal(R.drawable.selcuklu.toString(),"Tarihi Selcuklu Konagi","Tarihi Selçuklu Konağı konaklamanızda Mardin (Artuklu) bölgesinde, Şehidiye Camii yakınında ve Zinciriye Medresesi ile yaya olarak 3 dakika mesafede olacaksınız. Otel bünyesinde ücretsiz vale park hizmeti mevcuttur.","3.117,83","24 saat açık",3,true))
        data.add(KategoriModal(R.drawable.stone.toString(),"Stone Boutique Hotel","Stone Boutique Hotel size, Mardin merkezinde, Kırklar Kilisesi ve Mardin Müzesi ile birkaç adım mesafede konaklama fırsatı sunuyor. Misafirler için hızlı giriş, 24 saat açık resepsiyon ve birden fazla dil bilen personel mevcuttur. Ek ücret karşılığında (24 saat mevcut) gidiş-dönüş havaalanı servisi sağlanmaktadır.","706,22 TL","24 saat açık",4,false))


        recyclerView = binding.otelRecyclerView
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