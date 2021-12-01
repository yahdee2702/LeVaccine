package com.idn.levaccine.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.idn.levaccine.ui.HomeFragment
import com.idn.levaccine.ui.NewsFragment

class PageAdapter(fragment : FragmentActivity) : FragmentStateAdapter(fragment) {
    override fun getItemCount() = 2

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> HomeFragment()
            1 -> NewsFragment()
            else -> HomeFragment()
        }
    }
}