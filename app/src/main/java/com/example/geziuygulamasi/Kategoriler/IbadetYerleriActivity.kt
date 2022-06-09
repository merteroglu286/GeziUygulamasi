package com.example.geziuygulamasi.Kategoriler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.geziuygulamasi.Adapters.KategoriAdapter
import com.example.geziuygulamasi.KategoriModal
import com.example.geziuygulamasi.R
import com.example.geziuygulamasi.databinding.ActivityIbadetYerleriBinding
import com.example.geziuygulamasi.databinding.ActivityMarketlerBinding

class IbadetYerleriActivity : AppCompatActivity() {
    private lateinit var binding: ActivityIbadetYerleriBinding
    private lateinit var recyclerView : RecyclerView
    private lateinit var adapter: KategoriAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIbadetYerleriBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val data : MutableList<KategoriModal> = ArrayList()

        data.add(KategoriModal(R.drawable.ulucami.toString(),"Ulu Cami","Artuklu Dönemi mimari örneklerinden, dilimli kubbesi ve minaresiyle Mardin’in sembolü olan Mardin Ulu Cami kayıtlara göre iki minareli inşa edilmiştir. Caminin bugün mevcut olan tek minaresinin kare kaidesindeki yazıt, yapım tarihini 1176 olarak vermektedir, fakat bugünkü minare 1888/1889 yıllarında yeni ve elektik bir üslupla yapılmıştır. Bazı Süryani yazarlar kiliseden çevrildiğini söylerler. Yapı kiliseden çevrilmemiş olsa bile, yerinde eski bir kilisenin bulunması muhtemeldir.","ücretsiz","24 saat açık",0,true))
        data.add(KategoriModal(R.drawable.meryem.toString(),"Meryem Ana Kilisesi","Cumhuriyet Meydanında bulunan Meryem Ana Kilisesi, Süryani Katolik Cemaati'ne aittir. 1986 yılında Antakya Patriği İgnatios Antuhan Semheri tarafından yaptırılan kilisede kemer, yuvarlak taş sütunlar ve avluda korkuluklar yer alır. Patrikhane ise 1895 yılında inşa ettirilmiştir. 1988 yılında Kültür ve Turizm Bakanlığı'na devredilen patrikhane, restore edilerek 1995 yılından itibaren müze olarak kullanılmaktadır. Patriğin oturma yeri ile İncil vaiz yeri, üzüm salkımlı motiflerle süslenmiştir. ","ücretsiz","08:30 - 16:00",1,true))
        data.add(KategoriModal(R.drawable.protestan_kilisesi.toString(),"Mardin Protestan Kilisesi","Cumhuriyet Meydanında bulunan Meryem Ana Kilisesi, Süryani Katolik Cemaati'ne aittir. 1986 yılında Antakya Patriği İgnatios Antuhan Semheri tarafından yaptırılan kilisede kemer, yuvarlak taş sütunlar ve avluda korkuluklar yer alır. Patrikhane ise 1895 yılında inşa ettirilmiştir. 1988 yılında Kültür ve Turizm Bakanlığı'na devredilen patrikhane, restore edilerek 1995 yılından itibaren müze olarak kullanılmaktadır. Patriğin oturma yeri ile İncil vaiz yeri, üzüm salkımlı motiflerle süslenmiştir. ","ücretsiz","24 saat açık",2,false))
        data.add(KategoriModal(R.drawable.sehidiye.toString(),"Şehidiye Cami","13'üncü yüzyılın başlarında Artuklu Sultanı Melik Nasreddin Artuk Aslan tarafından yaptırıldığı sanılmaktadır. Güney yönünde iki nefli mescidin yer aldığı revaklı avlulu ve eyvanlı medrese şeması veren yapıdaki bir çok değişiklik, onarım ve eklemelerle medresenin orijinal durumundan pek az şey kalmıştır. Yapının yıkılmış olan minaresi 1916/17 yıllarında Ermeni Mimar Serkis Lole tarafından eklektik bir üslupla ve iskelesiz olarak inşa edilmiştir. Medresede en çok oynanmış olan yerlerden biri camidir. İki enine nefli ve ilk yapıldığında oldukça süslü bir cepheye sahip olduğu anlaşılan cami kısmı devamlı değişmiştir.","ücretsiz","08:30 - 16:00",3,false))
        data.add(KategoriModal(R.drawable.kilise.toString(),"Kırklar Kilisesi","Mor Behnam ile kız kardeşi Saro adına yapılan ve şu anda Kırklar Kilisesi olarak tanınan kilise iki ismini de erken dönem Hıristiyan efsanelerinden almıştır ve 6'ncı yüzyılın ortalarına ait bir yapıdır. Doğu-batı yönünde 12 masif sütun üzerine oturtulmuş kemerlerle taşınan tavan bölümü düzgün kesme taşlarla örülüdür. 1293’te Mardin Süryani Kadim Patriklik Merkezi olduktan sonra halkın ruhani ve idari işleri bu kiliseden idare edilmeye başlamıştır. Kırklar Kilisesi’nde patrikler ve metropolitler önceleri kilisenin avlusunda tavanları kesme taşla örülmüş odalarda ikamet ederlerdi. 1850’de bu odaların yerine yeni bir patriklik merkezi inşa edilmiş, 1925’te bu mekan genişletilerek yanına kesme taşlardan bir divanhane yapılmıştır. 1799’da burda bir okul açılmış olup, 1825-1899 yılları arasında faal olduğu bilinmektedir. 1928 yılına kadar eğitim ve öğretim devam etmiştir.","24 saat açık","08:30 - 16:00",4,false))
        data.add(KategoriModal(R.drawable.erkulu.toString(),"Erkulu Cami","Mardin için tarihi eserleri belirlerken mutlaka camii alanlarını da planlarınıza almalısınız. Bunlardan biri de fazla büyük olmamasına rağmen mimari işçiliği ile dikkate değer bulunan Erkulu Camii olacaktır. Günümüzde Kasım Tuğmamer Camii olarak bilinen camii, 1960 öncesinde bu isimle anılıyordu.Merhum Kasım Tuğmaner yapıyı genişleterek daha büyük hale getirdi ve cemaatin rahat namaz kılması için alan oluşturdu. Mükemmel işçiliği, revaklı silindir biçimindeki minaresi, iç mekanlarındaki ve mihrabındaki nakış işçiliği son derece mükemmel bulunmaktadır. Pek büyük olmayan yapısıyla cami 95- 100 metrekare arasında olsa da, geleneksel Mardin taş bezemeciliğine iyi bir örnek olmaktadır. Tek şerefeli minaresi ile farklı bulabileceğiniz camii, Mardin ziyaretinde unutulmamalıdır..","ücretsiz","24 saat açık",4,false))


        recyclerView = binding.ibadetRecyclerView
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