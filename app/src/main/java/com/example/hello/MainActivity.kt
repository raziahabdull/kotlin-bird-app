package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.imageView2.setOnClickListener {
            finish()
        }
        binding.imageView
        val intent = Intent(this, SecondBirdActivity::class.java)
        startActivity(intent)


        Picasso
            .get()
            .load("https://media.istockphoto.com/id/1499453496/photo/a-hummingbirds-feast-a-macro-photo-of-a-flower.webp?b=1&s=170667a&w=0&k=20&c=wElJTbFMUZSt_ko5MO1E-biXQOUIkX576ChYivrDDs0=")
            .centerInside()
            .resize(500, 500)
            .into(binding.imageView)
    }
    }

