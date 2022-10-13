package com.idn.levaccine.ui

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.idn.levaccine.DaftarVaksinActivity
import com.idn.levaccine.R
import com.idn.levaccine.adapter.TipsAdapter
import com.idn.levaccine.data.TipsInfo
import com.idn.levaccine.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private var _binding : FragmentHomeBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater,container,false)
        val tipsList = tipsInit()
        binding.btnVaccinesList.setOnClickListener {
            startActivity(Intent(this.activity,DaftarVaksinActivity::class.java))
        }

        binding.rvTips.apply {
            layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
            adapter = TipsAdapter(tipsList)
        }

        return binding.root
    }

    private fun tipsInit() : ArrayList<TipsInfo> {
        var tipsList = arrayListOf<TipsInfo>()
        val tipsImages = intArrayOf(
            R.drawable.img_tips_corona,
            R.drawable.img_tips_hand,
            R.drawable.img_tips_distance,
            R.drawable.img_tips_cafe,
            R.drawable.img_tips_vaccine,
            R.drawable.img_tips_house
        )

        var tipsText : Array<String>? = null

        activity?.resources?.apply {
            tipsText = getStringArray(R.array.txt_tips)
        }

        tipsText?.forEachIndexed {i,s ->
            tipsList.add(TipsInfo(s,tipsImages[i]))
        }
        return tipsList
    }
}