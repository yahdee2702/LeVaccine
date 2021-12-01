package com.idn.levaccine.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.idn.levaccine.databinding.RowItemVaccineBinding

class VaccineAdapter(private val vaccineList : ArrayList<String>,private val textFormat : String) : RecyclerView.Adapter<VaccineAdapter.MyViewHolder>() {
    inner class MyViewHolder(val binding: RowItemVaccineBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val rowItem = RowItemVaccineBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(rowItem)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.apply {
            tvItemVaccine.text = textFormat.format(vaccineList[position])
        }
    }

    override fun getItemCount(): Int {
        return vaccineList.size
    }
}