package com.example.a7minuteworkout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val flstartbutton:FrameLayout=findViewById(R.id.fl_start)
        flstartbutton.setOnClickListener{
            Toast.makeText(this,"STOP",
                Toast.LENGTH_LONG
                ).show()
        }
    }
}