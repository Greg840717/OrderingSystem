package com.example.orderingsystem

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        sentMenu.setOnClickListener {
            if(drink_name.length()<2){
                Toast.makeText(this,getString(R.string.drink_name),Toast.LENGTH_LONG).show()
            }
            else{
                var bundle = Bundle()
                bundle.putString("Drink",drink_name.text.toString())
                bundle.putString("Sweet",radioGroup.findViewById<RadioButton>(radioGroup.checkedRadioButtonId).text.toString())
                bundle.putString("Ice",radioGroup2.findViewById<RadioButton>(radioGroup2.checkedRadioButtonId).text.toString())
                setResult(Activity.RESULT_OK, Intent().putExtras(bundle))
                finish()
            }
        }
    }
}
