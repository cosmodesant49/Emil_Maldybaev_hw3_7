package com.geeks.emil_maldybaev_hw7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.geeks.emil_maldybaev_hw7.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val upFragment = UpFragment()
        val downFragment = DownFragment()

        supportFragmentManager.beginTransaction()
            .replace(R.id.upFragment, upFragment)
            .replace(R.id.downFragment, downFragment)
            .commit()
    }
}