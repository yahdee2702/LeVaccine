package com.idn.levaccine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.idn.levaccine.adapter.VaccineAdapter
import com.idn.levaccine.databinding.ActivityDaftarVaksinBinding

class DaftarVaksinActivity : AppCompatActivity() {
    private lateinit var binding : ActivityDaftarVaksinBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDaftarVaksinBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.vaccineDetailToolBar)
        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
        }

        val vaccinesList = arrayListOf(
            "Pfizer",
            "AstraZeneca",
            "Moderna",
            "Sinovac",
            "Sinopharm",
            "Janssen",
            "Convidecia",
        )

        binding.rvVaccines.apply {
            layoutManager = LinearLayoutManager(this.context,LinearLayoutManager.VERTICAL,false)
            adapter = VaccineAdapter(vaccinesList,getString(R.string.txt_rsc_vaccine))
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}