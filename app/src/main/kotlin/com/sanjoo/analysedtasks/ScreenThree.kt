package com.sanjoo.analysedtasks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter

class ScreenThree : AppCompatActivity() {

    private lateinit var rec:RecyclerView
    private lateinit var Dlist:ArrayList<Dinner>
    private lateinit var adap:Screen3Adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen_three)

        val search=findViewById<SearchView>(R.id.s3_search)
//        search.set("search here")
        rec=findViewById(R.id.s3_rv)
        rec.layoutManager=LinearLayoutManager(this)

        Dlist=ArrayList()
        Dlist.add(Dinner(R.drawable.hotdog,"hotdog"))
        Dlist.add(Dinner(R.drawable.pastry,"pastry"))
        Dlist.add(Dinner(R.drawable.hotdog,"hotdog"))
        Dlist.add(Dinner(R.drawable.pastry,"pastry"))
        Dlist.add(Dinner(R.drawable.hotdog,"pastry"))
        Dlist.add(Dinner(R.drawable.pastry,"pastry"))
        Dlist.add(Dinner(R.drawable.hotdog,"pastry"))

        adap= Screen3Adapter(Dlist)
        rec.adapter=adap
    }
}