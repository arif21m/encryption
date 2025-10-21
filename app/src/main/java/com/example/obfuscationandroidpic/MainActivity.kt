package com.example.obfuscationandroidpic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var key1 = "DmartReadySecretKey"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this,Secret().key1,Toast.LENGTH_SHORT).show()
        Toast.makeText(this,Secret().key2,Toast.LENGTH_SHORT).show()
        Toast.makeText(this,Secret().key3,Toast.LENGTH_SHORT).show()
        Toast.makeText(this,Secret().key4,Toast.LENGTH_SHORT).show()
    }
}