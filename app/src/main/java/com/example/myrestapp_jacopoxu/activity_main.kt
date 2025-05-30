package com.example.myrestapp_jacopoxu

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_main : AppCompatActivity() {

    private val TAG = "MainActivity - MyRESTApp"
    private lateinit var txtTitle : TextView
    private lateinit var btnWebview : ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        txtTitle = findViewById<TextView>(R.id.idTitle)
        btnWebview = findViewById<ImageButton>(R.id.idButton)

        btnWebview.setOnClickListener(View.OnClickListener { val intent = Intent(this, WebviewActivity::class.java)
            startActivity(intent) }
        )

    }
}