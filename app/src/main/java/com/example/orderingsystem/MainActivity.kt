package com.example.orderingsystem

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        data?.extras?.let {
            if(requestCode==1 && resultCode == Activity.RESULT_OK){
                order_drink.text = it.get("Drink").toString()
                order_sweet.text = it.get("Sweet").toString()
                order_ice.text = it.get("Ice").toString()
            }
        }
    }

    fun GoToMenu(v : View){
        val intent = Intent(this, MenuActivity::class.java)
        startActivityForResult(intent, 1)
    }
}
