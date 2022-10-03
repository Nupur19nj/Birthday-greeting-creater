package com.example.bdayg

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_hapyyyy.*

class hapyyyy : AppCompatActivity() {
    companion object{
        const val Name_Extra="name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hapyyyy)
        val name= intent.getStringExtra(Name_Extra)
       hbd.text="Happy birthday $name"
    }
}