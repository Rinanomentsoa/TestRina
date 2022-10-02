package com.example.testrina

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
    }
    fun showtips (view: View){
        val intent= Intent(this,TipsActivity:: class.java)
        startActivity(intent)}
}