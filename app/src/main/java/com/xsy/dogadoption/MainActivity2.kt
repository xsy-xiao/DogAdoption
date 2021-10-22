package com.xsy.dogadoption

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val imageView: ImageView = findViewById(R.id.imageView);
        val textView: TextView = findViewById(R.id.textView);
        val textView2: TextView = findViewById(R.id.textView2);

        val nameId: Int = intent.extras!!.getInt("name")
        textView.text = resources.getString(nameId)

        val picId: Int = intent.extras!!.getInt("pic")
        imageView.setImageResource(picId)

        val detailId: Int = intent.extras!!.getInt("detail")
        textView2.text = resources.getString(detailId)

    }
}