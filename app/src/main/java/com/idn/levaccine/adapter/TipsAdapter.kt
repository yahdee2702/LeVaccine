package com.idn.levaccine.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.idn.levaccine.data.TipsInfo
import com.idn.levaccine.databinding.RowItemTipsBinding

class TipsAdapter(private val tipsList : ArrayList<TipsInfo>) : RecyclerView.Adapter<TipsAdapter.MyViewHolder>() {
    inner class MyViewHolder(val binding: RowItemTipsBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val rowItem = RowItemTipsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(rowItem)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.apply {
            imgItemTips.setImageResource(tipsList[position].image)
            tvItemTips.text = tipsList[position].text
        }
    }

    override fun getItemCount(): Int {
        return tipsList.size
    }
}