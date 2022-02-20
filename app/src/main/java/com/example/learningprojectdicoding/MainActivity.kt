package com.example.learningprojectdicoding

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.learningprojectdicoding.MateriData.IconMateri


class MainActivity : AppCompatActivity() {

    companion object{
        val Intent_parcelable = "OBJECT_INTENT"
    }

    private lateinit var listMateri: RecyclerView
    private var list: ArrayList<Materi> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Action Bar
        val actionBar: ActionBar?
        actionBar = supportActionBar
        val colorDrawable = ColorDrawable(Color.parseColor("#073042"))
        actionBar?.setBackgroundDrawable(colorDrawable);
        getActionBar()


        listMateri = findViewById(R.id.list_Materi)
        listMateri.setHasFixedSize(true)

        list.addAll(MateriData.listdata)
        showRecyclerCardView()


    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }


    private fun showRecyclerCardView() {
        listMateri.layoutManager = LinearLayoutManager(this)
        val cardViewMateriAdapter = CardViewMateriAdapter.CardViewMateriAdapter(list)
        listMateri.adapter = cardViewMateriAdapter
    }

    fun moveprofil(item: MenuItem) {
        val intent = Intent(this, profil::class.java)
        startActivity(intent)
    }


}