package com.betiana.recyclerviewperros

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.betiana.recyclerviewperros.adapter.RazaPerrosAdapter
import com.betiana.recyclerviewperros.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        RazaPerrosProvider.razaperrosList
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }
 private fun initRecyclerView(){
     val manager = LinearLayoutManager(this)
     binding.rvPerros.layoutManager = manager
     binding.rvPerros.adapter = RazaPerrosAdapter(RazaPerrosProvider.razaperrosList) {razaPerros ->
         onItemSelected(
             razaPerros)
     }
 }
    fun onItemSelected(razaPerros: RazaPerros){
        Toast.makeText(this,razaPerros.nombre, Toast.LENGTH_SHORT).show()
    }

}
