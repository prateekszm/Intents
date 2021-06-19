package com.example.intents

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

const val KEY_1="Name"
const val KEY_2="Age"
const val KEY_3="Student"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener{
            val intent=Intent(this,MainActivity2::class.java)
            intent.putExtra(KEY_1,"Prateek Singh")
            intent.putExtra(KEY_2,99)
            intent.putExtra(KEY_3,true)
            startActivity(intent)
        }

        button4.setOnClickListener {
        val address=editTextTextPersonName.text.toString()
            val intent=Intent()
            intent.action=Intent.ACTION_SENDTO
            intent.data= Uri.parse("mailto:$address")
            startActivity(intent)
        }
        button3.setOnClickListener {
            val mobile=editTextTextPersonName.text.toString()
            val intent=Intent()
            intent.action=Intent.ACTION_DIAL
            intent.data= Uri.parse("tel:$mobile")
            startActivity(intent)
        }
        button5.setOnClickListener {
            val url=editTextTextPersonName.text.toString()
            val intent=Intent()
            intent.action=Intent.ACTION_VIEW
            intent.data= Uri.parse("http://$url")
            startActivity(intent)
        }
    }
}