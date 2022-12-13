package com.example.Group7_MAPD711_001_ASSIGNMET2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class phonemodels : AppCompatActivity() {
    lateinit var buttonName: String
    lateinit var appleModels: Array<String>
    private  var value="SamSung"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phonemodels)

        val Samsung_S22 = findViewById<TextView>(R.id.textView9)
        val Samsung_S22_ultra= findViewById<TextView>(R.id.textView10)
        val Samsung_z= findViewById<TextView>(R.id.textView10)
        Samsung_z.setOnClickListener{
            val bundle = Bundle()
            bundle.putString("PhoneName", "SamSung")
            bundle.putString("Phone_Model","Galaxy Z")
            val intent = Intent(this, Iphone_type::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
        Samsung_S22_ultra.setOnClickListener {

                val bundle = Bundle()
                bundle.putString("PhoneName", value)
                bundle.putString("Phone_Model", "Galaxy S22 Ultra")
                val intent = Intent(this, storageColor::class.java)
                intent.putExtras(bundle)
                startActivity(intent)
            }
        Samsung_S22.setOnClickListener{

                val bundle = Bundle()
                bundle.putString("PhoneName", value)
                bundle.putString("Phone_Model", "Galaxy S22")
                val intent = Intent(this, storageColor::class.java)
                intent.putExtras(bundle)
                startActivity(intent)
            }


//        var arrayAdapter: ArrayAdapter<*>
//        val mListView = findViewById<ListView>(R.id.userList)
//        if(buttonName =="Apple") {
//          appleModels = resources.getStringArray(R.array.AppleModels)
//            arrayAdapter = ArrayAdapter(this,
//                android.R.layout.simple_list_item_1, appleModels)
//            mListView.adapter = arrayAdapter
//            mListView.onItemClickListener = AdapterView.OnItemClickListener {parent,view, position, id ->
//                // Get the selected item text from ListView
//                val selectedItem = parent?.getItemAtPosition(position).toString()
//                val bundle = Bundle()
//                bundle.putString("PhoneName", value)
//                bundle.putString("Phone_Model", selectedItem)
//                Toast.makeText(this, "apple", Toast.LENGTH_LONG).show()
//                Toast.makeText(this, selectedItem, Toast.LENGTH_LONG).show()
//                val intent = Intent(this, storageColor::class.java)
//                intent.putExtras(bundle)
//                startActivity(intent)
//            }
//        }
//        if(buttonName =="Oppo") {
//            appleModels = resources.getStringArray(R.array.OppoModels)
//            arrayAdapter = ArrayAdapter(this,
//                android.R.layout.simple_list_item_1, appleModels)
//            mListView.adapter = arrayAdapter
//            mListView.onItemClickListener = AdapterView.OnItemClickListener {parent,view, position, id ->
//                // Get the selected item text from ListView
//                val selectedItem = parent?.getItemAtPosition(position).toString()
//                val bundle = Bundle()
//                bundle.putString("PhoneName", value)
//                bundle.putString("Phone_Model", selectedItem)
//                val intent = Intent(this, storageColor::class.java)
//                intent.putExtras(bundle)
//                startActivity(intent)
//            }
//        }
//        if(buttonName =="Samsung") {
//            appleModels = resources.getStringArray(R.array.SamsungModels)
//            arrayAdapter = ArrayAdapter(this,
//                android.R.layout.simple_list_item_1, appleModels)
//            mListView.adapter = arrayAdapter
//            mListView.onItemClickListener = AdapterView.OnItemClickListener {parent,view, position, id ->
//                // Get the selected item text from ListView
//                val selectedItem = parent?.getItemAtPosition(position).toString()
//                val bundle = Bundle()
//                bundle.putString("PhoneName", value)
//                bundle.putString("Phone_Model", selectedItem)
//                val intent = Intent(this, storageColor::class.java)
//                intent.putExtras(bundle)
//                startActivity(intent)
//            }
//        }
//        if(buttonName =="GooglePixel") {
//            appleModels = resources.getStringArray(R.array.GooglePixelModels)
//            arrayAdapter = ArrayAdapter(this,
//                android.R.layout.simple_list_item_1, appleModels)
//            mListView.adapter = arrayAdapter
//            mListView.onItemClickListener = AdapterView.OnItemClickListener {parent,view, position, id ->
//                // Get the selected item text from ListView
//                val selectedItem = parent?.getItemAtPosition(position).toString()
//                val bundle = Bundle()
//                bundle.putString("PhoneName", value)
//                bundle.putString("Phone_Model", selectedItem)
//                val intent = Intent(this, storageColor::class.java)
//                intent.putExtras(bundle)
//                startActivity(intent)
//            }
//        }
    }
}








