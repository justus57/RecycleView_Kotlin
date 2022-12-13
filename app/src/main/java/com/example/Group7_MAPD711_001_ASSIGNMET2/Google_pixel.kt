package com.example.Group7_MAPD711_001_ASSIGNMET2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Google_pixel : AppCompatActivity() {
    private  var value=""
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_google_pixel)
        val Samsung_S22 = findViewById<TextView>(R.id.textViewGp)
        val Samsung_S22_ultra= findViewById<TextView>(R.id.textViewGp6Pro)
        val Samsung_z= findViewById<TextView>(R.id.textViewGp6A)
        Samsung_z.setOnClickListener{
            val bundle = Bundle()
            bundle.putString("PhoneName", "Google Pixel")
            bundle.putString("Phone_Model", "Google Pixel 6a")
            val intent = Intent(this, Iphone_type::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
        Samsung_S22_ultra.setOnClickListener {

            val bundle = Bundle()
            bundle.putString("PhoneName", "Google Pixel")
            bundle.putString("Phone_Model", "Google Pixel 6 pro")
            val intent = Intent(this, storageColor::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
        Samsung_S22.setOnClickListener{

            val bundle = Bundle()
            bundle.putString("PhoneName", "Google Pixel")
            bundle.putString("Phone_Model", "Google Pixel")
            val intent = Intent(this, storageColor::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }
}