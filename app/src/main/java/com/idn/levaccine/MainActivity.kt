package com.idn.levaccine

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayoutMediator
import com.idn.levaccine.adapter.PageAdapter
import com.idn.levaccine.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolBar)

        supportActionBar?.apply {
            title = ""
        }

        binding.vpMain.adapter = PageAdapter(this)
        val tabList = arrayOf("Home","News")

        TabLayoutMediator(binding.mainTabs,binding.vpMain) { tab, position ->
            tab.text = tabList[position]
        }.attach()
    }
}