package com.example.forvk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.forvk.databinding.ActivityMain2Binding
import com.example.forvk.databinding.ActivityMainBinding
import kotlin.system.exitProcess

class MainActivity2 : AppCompatActivity() {
    lateinit var bindingClass: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.tContact1.setOnClickListener{
            val intent = Intent(this@MainActivity2, MainActivity::class.java)
            intent.putExtra("contactName",bindingClass.tContact1.text.toString())
            startActivity(intent)
        }
        bindingClass.tContact2.setOnClickListener{
            val intent = Intent(this@MainActivity2, MainActivity::class.java)
            intent.putExtra("contactName",bindingClass.tContact2.text.toString())
            startActivity(intent)
        }
        bindingClass.longContact.setOnClickListener{
            val intent = Intent(this@MainActivity2, MainActivity::class.java)
            intent.putExtra("contactName",bindingClass.longContact.text.toString())
            startActivity(intent)
        }
    }

}