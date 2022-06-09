package com.example.geziuygulamasi.Kategoriler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.geziuygulamasi.Adapters.KategoriAdapter
import com.example.geziuygulamasi.KategoriModal
import com.example.geziuygulamasi.R
import com.example.geziuygulamasi.databinding.ActivityMarketlerBinding
import com.example.geziuygulamasi.databinding.ActivityTarihiYerlerBinding

class TarihiYerlerActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTarihiYerlerBinding
    private lateinit var recyclerView : RecyclerView
    private lateinit var adapter: KategoriAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTarihiYerlerBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val data : MutableList<KategoriModal> = ArrayList()

        data.add(KategoriModal(R.drawable.kale.toString(),"Mardin Kalesi","Mardin Kalesi, Mardin'de bir kaledir. Mardin Kalesinin diğer bir ismi \"Kartal Yuvası\"dır. Şehrin büyük alanının dayanmış olduğu zinin üst tarafına kurulmuş müstahkem bir yerdir. Subari, Sümer, Babil, Mitaniler, Asur, Pers, Roma, Bizans, Emevi, Abbasi, Hamdaniler, Selçuklu Hanedanı, Artuklu, Karakoyunlu, Akkoyunlu, Safaviler, Osmanlılar dönemlerini yaşamış çok önemli bir kaledir. MS 330 yılında ateşe ibadet eden ve güneşe tapan Şad Buhari isminde bir kral gelip Mardin kalesinde kalır. Hastalanmış olan kral, kalede yaşadığında iyileşince, kendisine bir kasır yaptırıp, 12 yıl burada hayatını devam ettirir. Sonra kendi memleketi Pers ve Babil'den birçok asker ve sivil getirip, onlar için Mardin'e yerleşim yeri yaptırır. Halkın etkisi sayesinde MS.442 yılına kadar ilerlemeler görülür. MS 442'de veba hastalığının yaygın hale gelmesi kaledekilerin hayatını kaybetmelerine neden olmuştur. MS 542'e kadar Mardin Kalesi kullanılmadı.","ücretsiz","08:00 - 22:00",0,false))
        data.add(KategoriModal(R.drawable.zinciriye_medresesi.toString(),"Zinciriye Meddresesi","Halk arasında Zinciriye Medresesi diye de anılan Sultan İsa Medresesi, doğu ve batı uçlarındaki dilimli kubbeleri ve doğu tarafına rastlayan yüksek anıtsal portali ile çok uzaklardan bile dikkati çeker. Dikdörtgen ve geniş bir alanı kaplamakta olan yapı, iki kat üzerinde avlu, cami, türbe ve çeşitli ek mekânlardan meydana gelir. Portalden girince yıldız tonozla örtülü bir bölüme çıkılır. Batısında ise cami ile birlikte avluya açılan bir koridor vardır. Koridorun güneyindeki cami mekânının ortasında mukarnaslı tromplu bir kubbe yer alır. Mihrabın etrafı kakma motiflerle işlenmiştir. Minber kesme taştan yapılmıştır. Avlunun batısındaki eyvandan ise türbe olduğu anlaşılan ve kubbe ile örtülü mekâna geçilir. Üst kat daha çok küçük oda mekânlarından oluşmaktadır. Bunlar bir zamanlar medresede okuyan kişilerin odacıklarıdır.","ücretsiz","08:00 - 22:00",1,false))
        data.add(KategoriModal(R.drawable.deyrulzafaran.toString(),"Deyrulzafaran Manastırı","Deyrüzzaferân Manastırı Mardin'in 3 km doğusunda, 5. yüzyılda yapılan bir Süryani manastırı ve Süryanilerin önemli merkezlerinden biridir. Mor Hananyo Kilisesi, Azizler Evi, Meryem Ana Kilisesi ve Güneş Tapınağı manastırın önemli yapılarını oluşturur. Manastırın içinde tarihi bir Süryanice İncil ve kutsal taş bulunmakta, ilk tıp fakültesinin burada kurulduğu söylenmektedir. Kurulduğu dönemden kalma mozaikler bugün de durmaktadır. Canlı bir tarih görünümünde olan manastırın en büyük özelliklerinden biri de içinde 52 Süryani patriğinin mezarlarının bulunmasıdır. Deyrüzzaferân Manastırı, 2021 yılında UNESCO tarafından Dünya Mirası Geçici Listesi'ne dahil edilen Tur Abdin'deki dokuz kilise ve manastırdan biri oldu.","ücretsiz","08:00 - 22:00",2,true))
        data.add(KategoriModal(R.drawable.dara_antik_kenti.toString(),"Dara Antik Kenti","Mezopotamya'nın en önemli yerleşim yerlerinden birisi olan Dara, İmparator Anastasius'un (491-518) girişimleriyle 505 yılında, Doğu Roma İmparatorluğu’nun doğu sınırını Sasanilere karşı korumak için askeri amaçlı bir garnizon kenti olarak inşa ettirdiği sanılmaktadır. 4 kilometrelik alana yayılmış sur yapıları İç kale, kentin kuzeyinde ve 50 metre yüksekliğindeki tepenin üst düzlüğüne kurulmuştur. Mezopotamya ovası ile Tur-Abdin Dağlarının birleştiği yerde kireçtaşı ana kaya üzerinde kurulan kent Kaya içine oyulan yapılardan oluşmuş ve geniş bir alana yayılmıştır.","ücretsiz","08:00 - 22:00",3,true))
        data.add(KategoriModal(R.drawable.zindan.toString(),"Dara Yeraltı Zindanı","Agora caddesinin yaklaşık 100 m. kuzeybatısında, kalan büyük sarnıçtır. Düzgün kesme taş duvarlı sarnıcın orijinal girişi doğu cephesindedir. Bağlantılı yapıların ve yan mekânların hala toprak altında olmasına ve yapının üstünde sonradan bir ev inşa edilmiş olmasına rağmen, yapı görkemini hala korumaktadır. İki katlı yapının üzerinde şehrin katedrali (büyük kilise ) bulunmakta olup bugün sadece batı kısmında bir duvarı ayaktadır. Tarihçi Prokopius’a göre Dara’da 2 tane önemli kilise vardır. Bunlardan birisi ‘Büyük Kilise’ diğeri, Bartholomew Kilisesi’dir. Tarihçi Theodora Lector’a göre;  Aziz Bartholomew, Anastasius’un rüyasına girmiş ve şehrin korunmasını istemiştir. Bunun üzerine Anastasius, Bartholomew’un kemiklerini Kıbrıs’tan Dara’ya getirtmiştir. Dara’da 14. yüzyıla kadar süryani metropolitliği bulunmaktaydı.","ücretsiz","08:00 - 22:00",4,false))
        data.add(KategoriModal(R.drawable.kasimiye.toString(),"Kasimiye Medresesi","Kasımiye Medresesi, Mardin'de bir medresedir. Artuklular döneminde yapımına başlanan medresenin inşası Timur dönemindeki Moğol saldırıları nedeniyle yarım kalmış, 15. yüzyılın sonlarında Akkoyunlu sultanı Kasım ibn Cihangir döneminde tamamlanmıştır. Medrese, eğitim verdiği dönemde bölgenin en önemli eğitim merkezlerindendi. 16. yüzyılda Mardin'de en fazla maddi kaynağa sahip medrese olduğu bilinmektedir. I. Dünya Savaşı sırasında kapanmıştır. İki mescide, bir türbe ve bir çeşmeye de ev sahipliği yapmaktadır. Rivayetlere göre Kasım Paşa burada katledilmiştir. Kasımiye Medresesi eyvanı, rivayete göre, Kasım Paşa'nın kız kardeşi, Kasım Paşa öldüğünde kanlı gömleğini ağıtlar eşliğinde bu eyvanın duvarlarına sürmüş ve hala o duvarlara su döküldüğünde duvardaki kan izleri belli olmaktaymış, duvarlardaki kan izlerinin bunlara ait olduğu söylenir.","ücretsiz","08:00 - 22:00",4,true))


        recyclerView = binding.tarihiRecyclerView
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