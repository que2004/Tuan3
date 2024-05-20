package com.tranlamque.myapplication.tuan312

import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.tranlamque.myapplication.R

class Tuan312MainActivity : AppCompatActivity() {
    var adap:Tuan312Adapter? = null
    var ls: ArrayList<Tuan312Contact> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan312_main)
        var lv=findViewById<ListView>(R.id.tuan312lv)
        //tao nguon du lieu
        ls.add(Tuan312Contact("Nguyen Van A", "18", R.drawable.android))
        ls.add(Tuan312Contact("Nguyen Van B", "19", R.drawable.apple))
        ls.add(Tuan312Contact("Nguyen Van C", "20", R.drawable.facebook))
        ls.add(Tuan312Contact("Nguyen Van D", "21", R.drawable.firefox))
        ls.add(Tuan312Contact("Nguyen Van E", "22", R.drawable.hancock))
        adap=Tuan312Adapter(this,ls)
        lv.adapter=adap
    }
}