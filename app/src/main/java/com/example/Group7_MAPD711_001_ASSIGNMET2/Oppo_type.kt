package com.example.Group7_MAPD711_001_ASSIGNMET2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Oppo_type : AppCompatActivity() {
    private  var value=""
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oppo_type)
        val Samsung_S22 = findViewById<TextView>(R.id.textViewX3)
        val Samsung_S22_ultra= findViewById<TextView>(R.id.textViewFindX5)
        val Samsung_z= findViewById<TextView>(R.id.textViewX5Pro)
        val button2= findViewById<Button>(R.id.button2)

        Samsung_z.setOnClickListener{
            val bundle = Bundle()
            bundle.putString("PhoneName", "Oppo")
            bundle.putString("Phone_Model", "Oppo Find X5 Pro")
            val intent = Intent(this, Iphone_type::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
        Samsung_S22_ultra.setOnClickListener {

            val bundle = Bundle()
            bundle.putString("PhoneName", "Oppo")
            bundle.putString("Phone_Model", "Oppo Find X5")
            val intent = Intent(this, storageColor::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
        Samsung_S22.setOnClickListener{

            val bundle = Bundle()
            bundle.putString("PhoneName", "Oppo")
            bundle.putString("Phone_Model", "Oppo Find X3")
            val intent = Intent(this, storageColor::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
        button2.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("PhoneName", "Oppo")
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }
}