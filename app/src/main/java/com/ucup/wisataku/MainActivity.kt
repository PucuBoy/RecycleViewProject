package com.ucup.wisataku

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvTempat: RecyclerView
    private val list = ArrayList<Tempat>()

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            setHomeAsUpIndicator(R.drawable.about)
        }

        toolbar.setNavigationOnClickListener {
            val intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
        }

        rvTempat = findViewById(R.id.wisata)
        rvTempat.setHasFixedSize(true)

        list.addAll(getListTempat())
        showRecyclerList()
    }

    private fun getListTempat(): ArrayList<Tempat> {
        val dataName = resources.getStringArray(R.array.data_name)
        val dataDescription = resources.getStringArray(R.array.data_description)
        val dataPhoto = resources.obtainTypedArray(R.array.data_photo)
        val listTempat = ArrayList<Tempat>()
        for (i in dataName.indices) {
            val tempat = Tempat(dataName[i], dataDescription[i], dataPhoto.getResourceId(i, -1))
            listTempat.add(tempat)
        }
        dataPhoto.recycle()
        return listTempat
    }

    private fun showRecyclerList() {
        rvTempat.layoutManager = LinearLayoutManager(this)
        val listTempatAdapter = ListTempat(list)
        rvTempat.adapter = listTempatAdapter

        listTempatAdapter.setOnItemClickCallback(object : ListTempat.OnItemClickCallback {
            override fun onItemClicked(data: Tempat) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("nama_tempat", data.name)
                intent.putExtra("deskripsi_tempat", data.description)
                intent.putExtra("posisi_gambar", list.indexOf(data))
                startActivity(intent)
            }
        })
    }
}

