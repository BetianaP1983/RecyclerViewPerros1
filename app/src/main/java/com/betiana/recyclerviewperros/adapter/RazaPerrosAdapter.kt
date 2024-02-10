package com.betiana.recyclerviewperros.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.betiana.recyclerviewperros.R
import com.betiana.recyclerviewperros.RazaPerros
import com.betiana.recyclerviewperros.RazaPerrosProvider.Companion.razaperrosList

class RazaPerrosAdapter(private val razaperrosList:List<RazaPerros>, private val onClickListener:(RazaPerros) -> Unit): RecyclerView.Adapter<RazaPerrosViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RazaPerrosViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return RazaPerrosViewHolder(layoutInflater.inflate(R.layout.item_razaperros, parent,false))
    }

    override fun getItemCount(): Int = razaperrosList.size


    override fun onBindViewHolder(holder: RazaPerrosViewHolder, position: Int) {
       val item = razaperrosList[position]
       holder.render(item, onClickListener)

    }


}
