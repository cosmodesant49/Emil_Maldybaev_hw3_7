package com.geeks.emil_maldybaev_hw7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geeks.emil_maldybaev_hw7.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction().add(R.id.container, DownFragment()).commit()



        val upFragment = UpFragment()
        val downFragment = DownFragment()

        supportFragmentManager.beginTransaction()
            .replace(R.id.upFragment, upFragment)
            .replace(R.id.downFragment, downFragment)
            .commit()

    }
}