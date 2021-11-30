package com.idn.levaccine.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.idn.levaccine.R
import com.idn.levaccine.databinding.FragmentNewsBinding

class NewsFragment : Fragment() {
    private var _binding : FragmentNewsBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentNewsBinding.inflate(inflater, container, false)



        return binding.root
    }
}