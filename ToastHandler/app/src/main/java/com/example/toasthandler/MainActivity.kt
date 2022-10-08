package com.example.toasthandler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.toasthandler.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setlistener()
    }
    private fun setlistener() {
        binding.btOk.setOnClickListener {
            Toast.makeText(this, "Кнопка ОК!", Toast.LENGTH_SHORT).show()
        }
    }
}