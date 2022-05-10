package com.example.klayout

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var d1: EditText? = null
    var d2: EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    fun initView() {
        val b_open = findViewById<Button>(R.id.b_open)
        d1 = findViewById(R.id.d1)
        d2 = findViewById(R.id.d2)
        b_open.setOnClickListener { UserDetail() }
    }

    fun UserDetail() {
        val intent = Intent(this, UserActivity::class.java)
        intent.putExtra("userid", d1!!.text.toString())
        intent.putExtra("userpw", d2!!.text.toString())
        startActivity(intent)
    }
}