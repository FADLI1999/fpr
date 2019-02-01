package com.example.bibdev.FRONT_PERJUANGAN_RAKYAT


import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var Button : Button
    lateinit var Button1 : Button
    lateinit var Button2 : Button
    lateinit var Button3 : Button
    lateinit var Button4: Button
    lateinit var Button5: Button
    lateinit var Button6: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Button=findViewById(R.id.button)
        Button.setOnClickListener{
            startActivity(Intent(this,fprActivity::class.java))
        }
        Button1=findViewById(R.id.button1)
        Button1.setOnClickListener{
            startActivity(Intent(this,fmnActivity::class.java))
        }
        Button2=findViewById(R.id.button2)
        Button2.setOnClickListener{
            startActivity(Intent(this,puskebaActivity::class.java))
        }
        Button3=findViewById(R.id.button3)
        Button3.setOnClickListener{
            startActivity(Intent(this,pembaruActivity::class.java))
        }
        Button4=findViewById(R.id.button4)
        Button4.setOnClickListener{
            startActivity(Intent(this,seruniActivity::class.java))
        }
        Button5=findViewById(R.id.button5)
        Button5.setOnClickListener{
            startActivity(Intent(this,agraActivity::class.java))
        }
    }
}

