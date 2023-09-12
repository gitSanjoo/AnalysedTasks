package com.sanjoo.analysedtasks

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Screen3Adapter(val list:ArrayList<Dinner>): RecyclerView.Adapter<Screen3Adapter.Screen3ViewHolder>() {


    class Screen3ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        val img=itemView.findViewById<ImageView>(R.id.s3_img)
        val name=itemView.findViewById<TextView>(R.id.s3_name )
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Screen3ViewHolder {
        val inflater=LayoutInflater.from(parent.context)
        val view=inflater.inflate(R.layout.dinner_item,parent,false)
        return Screen3ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: Screen3ViewHolder, position: Int) {
        val l=list[position]
        holder.img.setImageResource(l.images)
        holder.name.setText(l.names)
    }
}