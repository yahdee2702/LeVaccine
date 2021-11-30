package com.idn.levaccine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.idn.levaccine.databinding.ActivityDetailNewsBinding

class DetailNewsActivity : AppCompatActivity() {
    private lateinit var binding : ActivityDetailNewsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailNewsBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }
}