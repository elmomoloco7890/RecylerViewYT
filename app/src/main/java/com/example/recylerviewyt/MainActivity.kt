package com.example.recylerviewyt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recylerviewyt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val activityBinding = ActivityMainBinding.inflate(layoutInflater)
        binding = activityBinding
        setContentView(activityBinding.root)
    }
}