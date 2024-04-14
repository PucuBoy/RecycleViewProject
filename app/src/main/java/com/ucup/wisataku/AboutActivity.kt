package com.ucup.wisataku

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val imageProfile = findViewById<ImageView>(R.id.image_profile)
        val textName = findViewById<TextView>(R.id.text_name)
        val textEmail = findViewById<TextView>(R.id.text_email)


        imageProfile.setImageResource(R.drawable.my_photo)
        textName.text = "Yusuf fadilah septiandika"
        textEmail.text = "yusuffadilah559@gmail.com"
    }

    fun goBackToMain(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

}
