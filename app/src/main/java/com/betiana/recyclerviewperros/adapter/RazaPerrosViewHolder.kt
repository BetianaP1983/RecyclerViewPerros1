package com.betiana.recyclerviewperros.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.betiana.recyclerviewperros.R
import com.betiana.recyclerviewperros.RazaPerros
import com.betiana.recyclerviewperros.databinding.ItemRazaperrosBinding
import com.squareup.picasso.Picasso

class RazaPerrosViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val binding = ItemRazaperrosBinding.bind(view)


    fun render(razaPerros: RazaPerros,onClickListener:(RazaPerros) -> Unit) {
        binding.tvNombre.text = razaPerros.nombre
        binding.tvCaracter.text = razaPerros.caracter
        binding.tvCategoria.text = razaPerros.categoria
        Picasso.get().load(razaPerros.imagen).into(binding.ivRazaPerros)
        itemView.setOnClickListener {onClickListener(razaPerros)}
    }
}