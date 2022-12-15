package com.example.Group7_MAPD711_001_ASSIGNMET2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Iphone_type : AppCompatActivity() {
    private  var value="Apple"
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iphone_type)
        val Samsung_S22 = findViewById<TextView>(R.id.textViewIp14)
        val Samsung_S22_ultra= findViewById<TextView>(R.id.textViewIp14Pro)
        val Samsung_z= findViewById<TextView>(R.id.textViewIp14ProMax)
        val button2= findViewById<Button>(R.id.button2)
        Samsung_z.setOnClickListener{
            val bundle = Bundle()
            bundle.putString("PhoneName", "Apple")
            bundle.putString("Phone_Model", "Iphone 14 Pro Max")
            val intent = Intent(this, Iphone_type::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
        Samsung_S22_ultra.setOnClickListener {

            val bundle = Bundle()
            bundle.putString("PhoneName", value)
            bundle.putString("Phone_Model", "Iphone 14 pro")
            val intent = Intent(this, storageColor::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
        Samsung_S22.setOnClickListener{

            val bundle = Bundle()
            bundle.putString("PhoneName", value)
            bundle.putString("Phone_Model","Iphone i4")
            val intent = Intent(this, storageColor::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }
}