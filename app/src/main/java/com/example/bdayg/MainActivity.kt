package com.example.bdayg

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun createhbdcard(view: View) {
val name =nameInput.editableText.toString()
        Toast.makeText(this, "name is $name",Toast.LENGTH_LONG).show()
   val intent = Intent(this, hapyyyy::class.java)
        intent.putExtra(hapyyyy.Name_Extra, name)
        startActivity(intent)

    }

}