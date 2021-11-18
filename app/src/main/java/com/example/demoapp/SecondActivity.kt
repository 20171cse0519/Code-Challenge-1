package com.example.demoapp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.demoapp.databinding.ActivitySecondBinding
import com.example.demoapp.databinding.ListItemBinding

class SecondActivity: AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val bundle: Bundle? = intent.extras
        val desc = bundle!!.getString("prod_desc")
         binding.prodDetail.text = desc

        binding.cartBtn.setOnClickListener {
            Toast.makeText(this,"Product has been added to cart",Toast.LENGTH_SHORT).show()
        }


    }
}