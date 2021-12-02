package com.idn.levaccine.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.idn.levaccine.R
import com.idn.levaccine.data.VaccineInfo
import com.idn.levaccine.databinding.BottomSheetVaccineInfoBinding
import com.idn.levaccine.databinding.RowItemVaccineBinding

class VaccineAdapter(private val vaccineList : ArrayList<VaccineInfo>,private val textFormat : ArrayList<String>) : RecyclerView.Adapter<VaccineAdapter.MyViewHolder>() {
    inner class MyViewHolder(val binding: RowItemVaccineBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val rowItem = RowItemVaccineBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(rowItem)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.apply {
            tvItemVaccine.text = textFormat[0].format(vaccineList[position].name)
        }

        holder.itemView.setOnClickListener {
            val layoutInflater = LayoutInflater.from(it.context)
            val bs : BottomSheetVaccineInfoBinding = BottomSheetVaccineInfoBinding.inflate(layoutInflater)
            bs.apply {
                tvVaccineTitle.text = vaccineList[position].name
                tvVaccineListEffects.text = vaccineList[position].sideEffects
                tvVaccineDoses.text = textFormat[1].format(vaccineList[position].dose)
                tvVaccineEffectiveness.text = textFormat[2].format(vaccineList[position].effectivity.toString() + "% ")
            }
            val dialog = BottomSheetDialog(it.context)
            dialog.setContentView(bs.root)
            dialog.show()
        }
    }

    override fun getItemCount(): Int {
        return vaccineList.size
    }
}