package com.example.logging

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.logging.databinding.ActivityMainBinding
import timber.log.Timber

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btLog.setOnClickListener {
            Log.v("From EditText", binding.etText.text.toString())
        }
        binding.btTimber.setOnClickListener {
            Timber.v(binding.etText.text.toString())
        }
    }
}