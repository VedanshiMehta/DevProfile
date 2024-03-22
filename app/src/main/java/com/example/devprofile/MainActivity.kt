package com.example.devprofile

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory

class MainActivity : AppCompatActivity() {
    private lateinit var _imageViewLogo : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        _imageViewLogo = findViewById<ImageView>(R.id.imageViewLogo)
        val bitmap = BitmapFactory.decodeResource(resources,R.drawable.devslopesprofilelogo)
        val rounded = RoundedBitmapDrawableFactory.create(resources,bitmap)
        rounded.cornerRadius = 20f

        _imageViewLogo.setImageDrawable(rounded)
    }
}