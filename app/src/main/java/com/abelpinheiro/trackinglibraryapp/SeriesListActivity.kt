package com.abelpinheiro.trackinglibraryapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.abelpinheiro.trackinglibraryapp.adapter.ItemAdapter
import com.abelpinheiro.trackinglibraryapp.data.Datasource

class SeriesListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_series)

        val myDataset = Datasource().loadSeries()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, myDataset)
        recyclerView.setHasFixedSize(true)
    }
}