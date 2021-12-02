package com.idn.levaccine

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.tabs.TabLayout
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
            when(tab.position){
                0 -> {
                    tab.setIcon(R.drawable.ic_logo)
                }
                1 -> {
                    tab.setIcon(0)
                }
            }
        }.attach()
    }
}