package com.example.sixthhomeworkthirdmonth

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(private val carList: ArrayList<DataClass>) :
    RecyclerView.Adapter<Adapter.CarViewHolder>(){


    class CarViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val tvCar : TextView = itemView.findViewById(R.id.tv_car)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_car, parent, false)
        return CarViewHolder(view)
    }

    override fun onBindViewHolder(holder: CarViewHolder, position: Int) {
        val car = carList[position]
        holder.tvCar.text = car.name
    }

    override fun getItemCount(): Int {
        return carList.size
    }
}