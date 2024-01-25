package com.example.androidavanzado

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HeroAdapter: RecyclerView.Adapter<HeroAdapter.HeroViewHolder>() {

    val heros = listOf(
        "Goku",
        "Vegeta",
        "Picolo",
        "Krilin",
        "Goku",
        "Vegeta",
        "Picolo",
        "Krilin",
        "Goku",
        "Vegeta",
        "Picolo",
        "Krilin",
        "Goku",
        "Vegeta",
        "Picolo",
        "Krilin",

    )

    class HeroViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    private val heroName = itemView.findViewById<TextView>(R.id.heroName)
        fun bind(name: String){
            heroName.text = name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.item_hero, parent, false)
        return HeroViewHolder(view)
    }

    override fun getItemCount(): Int {
        return heros.size
    }

    override fun onBindViewHolder(holder: HeroViewHolder, position: Int) {
        holder.bind(heros[position])
    }
}

