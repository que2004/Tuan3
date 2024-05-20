package com.tranlamque.myapplication.tuan312

import android.content.Context
import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.tranlamque.myapplication.R

class Tuan312Adapter(context: Context,ls:ArrayList<Tuan312Contact>):BaseAdapter() {
    var ls:ArrayList<Tuan312Contact> = ls;
    var context: Context = context;
    //Lay tong so item
    override fun getCount(): Int {
       return ls.size
    }
    //Lay ve item hien tai
    override fun getItem(position: Int): Any {
        return ls.get(position)
    }
    //Lay id cua item
    override fun getItemId(position: Int): Long {
        return position.toLong()
    }
    //Tao view
    //Gan du lieu cho cac view
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var c = convertView
        //tao view
        var vax: ViewAX
        if(convertView == null){
            vax = ViewAX()
            c=LayoutInflater.from(context).inflate(R.layout.tuan312_item_view, null)
            // anh xa tung thanh phan cua layout
            vax.img_hinh=c.findViewById(R.id.tuan312ItemHinh)
            vax.tv_ten=c.findViewById(R.id.tuan312ItemTen)
            vax.tv_tuoi=c.findViewById(R.id.tuan312ItemTuoi)
            //tao template de lan sau su dung
            c.tag=vax
        }
        //1.2 Neu da co-> su dung view cu
        else
        {
            vax=c!!.tag as ViewAX
        }
        //2.Gan du lieu cho view
        vax.img_hinh!!.setImageResource(ls[position].hinh!!)
        vax.tv_ten!!.text=ls[position].ten!!
        vax.tv_tuoi!!.text=ls[position].tuoi!!
        return c !!

    }
    // Khai bao lop anh xa ItemView
    inner class ViewAX{
        var img_hinh: ImageView ?= null
        var tv_ten: TextView ?= null
        var tv_tuoi : TextView ?= null
    }

}