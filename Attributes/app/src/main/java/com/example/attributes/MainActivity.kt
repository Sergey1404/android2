package com.example.attributes

import androidx.appcompat.app.AppCompatActivity
import android.graphics.Color
import android.os.Bundle
import com.example.attributes.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding) {
            btBlackText.setOnClickListener {
                et.setTextColor(Color.BLACK)
            }
            btWhiteText.setOnClickListener {
                et.setTextColor(Color.WHITE)
            }
            btBigSize.setOnClickListener {
                et.textSize = 24F
            }
            btLowSize.setOnClickListener {
                et.textSize = 8F
            }
            btWhiteBackground.setOnClickListener {
                et.setBackgroundColor(Color.WHITE)
            }
            btYellowBackground.setOnClickListener {
                et.setBackgroundColor(Color.YELLOW)
            }
        }
    }
}