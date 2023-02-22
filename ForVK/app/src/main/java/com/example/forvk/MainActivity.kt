package com.example.forvk

import android.content.Intent
import android.content.Intent.ACTION_MAIN
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.get
import com.example.forvk.databinding.ActivityMainBinding
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding
    var micCheck = true
    var camCheck = true




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)


        val contactName = intent.getStringExtra("contactName")
        bindingClass.tHe.text = contactName


        bindingClass.bExit.setOnClickListener {
            exitProcess(0)
        }

        if (bindingClass.tHe.text.length > 20) {
            var text = bindingClass.tHe.text.dropLast(bindingClass.tHe.text.length - 18)
            val dots = "..."
            bindingClass.tHe.text = text.toString() + dots
        }

        bindingClass.bMic.setOnClickListener {
            if (micCheck) {
                bindingClass.bMic.setImageResource(R.drawable.mic_off_48px)
                bindingClass.tYou.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.mic_off_48px, 0);
                micCheck = false
            }
            else {
                bindingClass.bMic.setImageResource(R.drawable.mic_48px)
                bindingClass.tYou.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.mic_48px, 0);
                micCheck = true
            }
        }

        bindingClass.bCam.setOnClickListener {
            if (camCheck) {
                bindingClass.bCam.setImageResource(R.drawable.no_photography_48px)
                camCheck = false
            } else {
                bindingClass.bCam.setImageResource(R.drawable.photo_camera_48px)
                camCheck = true
            }
        }
        bindingClass.bChange.setOnClickListener {
            if (bindingClass.body.get(0) == bindingClass.cYou) {
                bindingClass.body.removeView(bindingClass.cYou)
                bindingClass.body.addView(bindingClass.cYou)
            } else {
                bindingClass.body.removeView(bindingClass.cHe)
                bindingClass.body.addView(bindingClass.cHe)
            }
        }
        bindingClass.bContacts.setOnClickListener{
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

        bindingClass.bMessanger.setOnClickListener{
            val intent = Intent(ACTION_MAIN)
            intent.type = "vnd.android-dir/mms-sms"
            startActivity(intent)
        }

    }

    fun sendHello (view: View) {
        val dialog = AlertDialog.Builder(this)
            .setIcon(R.drawable.waving_hand_48px)
            .setCancelable(false)
            .setTitle("Greeting")
            .setMessage("Hello!")
            .setPositiveButton("Hi!", null)
            .create()
        dialog.show()
    }

}