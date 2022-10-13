package com.idn.levaccine.ui

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.idn.levaccine.DetailNewsActivity
import com.idn.levaccine.R
import com.idn.levaccine.adapter.NewsAdapter
import com.idn.levaccine.data.NewsData
import com.idn.levaccine.databinding.FragmentNewsBinding

class NewsFragment : Fragment() {
    private var _binding : FragmentNewsBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentNewsBinding.inflate(inflater, container, false)

        val position = 0

        binding.rvNews.apply {
            adapter = NewsAdapter(NewsData.getAllInfo())
            layoutManager = LinearLayoutManager(context)
        }

        val headlineNewsData = NewsData.getHeadlineInfo()

        binding.apply {
            tvHeadlineTitle.text = headlineNewsData[position].title
            tvHeadlineContent.text = headlineNewsData[position].content
            tvHeadlineInfo.text = headlineNewsData[position].reporter + " - " + headlineNewsData[position].date
            imgHeadline.setImageResource(headlineNewsData[position].photo)
            cvHeadlineNews.setOnClickListener {
                val intent = Intent(context,DetailNewsActivity::class.java)
                intent.putExtra(DetailNewsActivity.DATA_NEWS,headlineNewsData[position])
                startActivity(intent)
            }
        }

        return binding.root
    }
}