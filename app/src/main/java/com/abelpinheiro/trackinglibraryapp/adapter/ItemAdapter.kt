package com.abelpinheiro.trackinglibraryapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.abelpinheiro.trackinglibraryapp.R
import com.abelpinheiro.trackinglibraryapp.model.Series
import com.google.android.material.imageview.ShapeableImageView

class ItemAdapter(private val context: Context, private val dataset: List<Series>) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view){
        val title: TextView = view.findViewById(R.id.item_title)
        val author: TextView = view.findViewById(R.id.item_author)
        val quantityOwn: TextView = view.findViewById(R.id.item_quantity_own)
        val quantityTotal: TextView = view.findViewById(R.id.item_quantity_total)
        val imageView: ShapeableImageView = view.findViewById(R.id.item_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.title.text = item.name
        holder.author.text = item.author
        holder.quantityOwn.text = item.quantityOwn.toString()
        holder.quantityTotal.text = item.quantityTotal.toString()
        holder.imageView.setImageResource(item.image)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}