package com.example.tugasyudhamodule

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FoodAdapter(private val foodList: ArrayList<Food>)
    :RecyclerView.Adapter<FoodAdapter.FoodViewHolder>() {
    class FoodViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgFood = view.findViewById<ImageView>(R.id.foto)
        val nameFood = view.findViewById<TextView>(R.id.food_name)
        val descFood = view.findViewById<TextView>(R.id.description)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_food, parent, false)
        return FoodViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        val currentItem = foodList[position]
        holder.imgFood.setImageResource(currentItem.imgFood)
        holder.nameFood.text = (currentItem.nameFood)
        holder.descFood.text = (currentItem.descFood)
    }
    override fun getItemCount(): Int = foodList.size
}
