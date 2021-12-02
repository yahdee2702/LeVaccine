package com.idn.levaccine.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.idn.levaccine.DetailNewsActivity
import com.idn.levaccine.data.NewsInfo
import com.idn.levaccine.databinding.RowItemNewsBinding

class NewsAdapter(private val newsInfos: ArrayList<NewsInfo>) : RecyclerView.Adapter<NewsAdapter.MyViewHolder>() {
    inner class MyViewHolder(val binding: RowItemNewsBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val rowItem = RowItemNewsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(rowItem)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.apply {
            tvNewsTitle.text = newsInfos[position].title
            tvNewsCategory.text = newsInfos[position].category
            tvNewsInfo.text = newsInfos[position].reporter + " - " + newsInfos[position].date
            imgNews.setImageResource(newsInfos[position].photo)
        }
        holder.itemView.setOnClickListener {
            val intent = Intent(it.context,DetailNewsActivity::class.java)
            intent.putExtra(DetailNewsActivity.DATA_NEWS,newsInfos[position])
            it.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return newsInfos.size
    }
}