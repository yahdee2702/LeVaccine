package com.idn.levaccine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.idn.levaccine.data.NewsInfo
import com.idn.levaccine.databinding.ActivityDetailNewsBinding

class DetailNewsActivity : AppCompatActivity() {
    private lateinit var binding : ActivityDetailNewsBinding

    companion object {
        val DATA_NEWS = "news"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailNewsBinding.inflate(layoutInflater)

        setSupportActionBar(binding.toolbarDetail)

        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
            title = "Detail"
        }

        val newsData = intent.getParcelableExtra<NewsInfo>(DATA_NEWS)

        if (newsData != null) {
            binding.apply {
                tvTitleDetail.text = newsData.title
                tvDateDetail.text = newsData.date
                tvAuthorDetail.text = getString(R.string.txt_rsc_reporter, newsData.reporter)
                tvContentDetail.text = newsData.content
            }
        }

        setContentView(binding.root)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}