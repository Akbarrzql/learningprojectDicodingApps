package com.example.learningprojectdicoding

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.ActionBar

class DetailView : AppCompatActivity() {

    companion object{
        const val photo = "photo"
        const val nama = "name"
        const val materidetail = "materi"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_view)

        //ActionBar
        val actionBar: ActionBar?
        actionBar = supportActionBar
        val colorDrawable = ColorDrawable(Color.parseColor("#073042"))
        actionBar?.setBackgroundDrawable(colorDrawable);
        getActionBar()

        var imgPhoto: ImageView = findViewById(R.id.img_item_photo)
        var tvNama: TextView = findViewById(R.id.tv_item_name)
        var tvmateridetail: TextView = findViewById(R.id.tv_item_detail)

        val name = intent.getStringExtra(nama)
        val materi = intent.getStringExtra(materidetail)
        val photo = intent.getIntExtra(photo,0)

        imgPhoto.setImageResource(photo)
        tvNama.text = name
        tvmateridetail.text = materi
    }
}



