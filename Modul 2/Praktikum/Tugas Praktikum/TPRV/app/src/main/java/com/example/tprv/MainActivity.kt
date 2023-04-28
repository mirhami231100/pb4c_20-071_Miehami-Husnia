package com.example.tprv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: MyAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter=adapter
        

    }

    private fun init() {
        recyclerView = findViewById(R.id.recycler_view)

        var data = ArrayList<tprv>()
        data.add(tprv(R.drawable.makanan2, "Nasi Ayam Geprek", "Ayam geprek adalah ayam berlapis tepung tipis (bukan fried chicken) dan digoreng. Setelah digoreng ayam ini akan digeprek dan dicampur dengan sambal ulek. Geprek sendiri berasal dari bahasa Jawa yang berarti dipukul atau ditekan."))
        data.add(tprv(R.drawable.makanan3, "Ayam Goreng Kremes", "hidangan dengan bahan dasar ayam yang dibuat dengan teknik menggoreng. Ayam kremes digoreng dengan baluran tepung terigu yang telah dibumbui, dan digoreng hingga matang kecoklatan. Sensasi kriuk yang dihasilkan dari remah tepung terigu yang menjadikan olahan ini disebut dengan ayam kremes atau ayam kriuk dibeberapa tempat."))
        data.add(tprv(R.drawable.makanan5, "Bakmi Jawa", "Bakmi Jawa merupakan salah satu makanan khas khususnya di wilayah Yogyakarta dan sekitarnya. Bakmi Jawa atau Mi Jawa dahulu dikenal dengan istilah bakmi rebus atau dalam bahasa jawa disebut dengan Bakmi godhog yang dimasak dengan bumbu dan rempah yang khas masakan Jawa."))
        data.add(tprv(R.drawable.makanan6, "Bakso", "Bakso makanan yang disukai banyak orang"))
        data.add(tprv(R.drawable.makanan7, "Chiken Katsu", "versi ayam goreng crispy khas Jepang, biasanya ditemani bumbu tonkatsu yaitu saus barbeku manis dan gurih."))
        data.add(tprv(R.drawable.makanan8, "Chiken Wings", "Hidangan khas Amerika Serikat yaitu chicken wing biasanya berupa sayap ayam yang digoreng dan diberi saus. "))
        data.add(tprv(R.drawable.makanan9, "Gado Gado", "Gado-gado merupakan makanan khas Betawi berupa sayur-sayuran yang direbus dan dicampur jadi satu, dengan bumbu kacang atau saus dari kacang tanah dan yang dihaluskan disertai irisan telur dan pada umumnya banyak yang menambahkan kentang rebus yang sudah dihaluskan."))
        data.add(tprv(R.drawable.makanan10, "Ikan Bakar", "makanan yang sangat lezat yang banyak di jumpai di restoran makanan"))
        data.add(tprv(R.drawable.makanan11, "Ikan Goreng", "ikan atau makanan laut yang disajikan dengan cara digoreng."))
        data.add(tprv(R.drawable.makanan12, "Mie Ayama Ceker", "Mie ayam dengan toping Ceker ayam"))
        data.add(tprv(R.drawable.makanan14, "Nasi Campur", "salah satu hidangan khas Indonesia. yang terdiri atas nasi putih yang dihidangkan dengan bermacam-macam lauk"))
        data.add(tprv(R.drawable.makanan15, "Nasi Goreng", "Makanan kesukaan sejuta umat"))
        data.add(tprv(R.drawable.makanan16, "Nasi Pecel", "makanan yang menggunakan bumbu sambal kacang sebagai bahan utamanya yang dicampur dengan aneka jenis sayuran."))
        data.add(tprv(R.drawable.makanan17, "Nasi Rawon", "daging sapi yang dipotong kecil-kecil, utamanya adalah bagian sandung lamur."))
        data.add(tprv(R.drawable.makanan18, "Soto Ayam", "Soto ayam khas lamongan"))
        data.add(tprv(R.drawable.makanan19, "Spageti", "salah satu varian pasta yang memiliki bentuk silinder tipis dan padat"))
        data.add(tprv(R.drawable.makanan20, "Mie Ayam", "Mie ayam enak"))
        data.add(tprv(R.drawable.makanan21, "Tahu Telor", "kudapan pembuka (appetizer) khas Jawa Timur."))

        adapter=MyAdapter(data)
    }
}