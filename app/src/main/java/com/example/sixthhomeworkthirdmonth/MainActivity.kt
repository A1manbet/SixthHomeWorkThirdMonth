package com.example.sixthhomeworkthirdmonth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView : RecyclerView

    private lateinit var carList : ArrayList <DataClass>

    private lateinit var carAdapter: Adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        recyclerView = findViewById(R.id.recycler_view)

        recyclerView.setHasFixedSize(true)

        recyclerView.layoutManager = LinearLayoutManager(this)

        carList = ArrayList()

        carList.add(DataClass("Toyota"))
        carList.add(DataClass("Lexus"))
        carList.add(DataClass("Subaru"))
        carList.add(DataClass("BMW"))
        carList.add(DataClass("Mercedes"))
        carList.add(DataClass("Opel"))
        carList.add(DataClass("Lamborghini"))
        carList.add(DataClass("Ford"))
        carList.add(DataClass("Nissan"))
        carList.add(DataClass("Mitsubisi"))
        carList.add(DataClass("Ferrari"))


        carAdapter = Adapter(carList)

        recyclerView.adapter = carAdapter

    }
}