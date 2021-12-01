package com.idn.levaccine.data

object VaccineData {

    private val vaccineName = arrayListOf(
        "AstraZeneca",
        "Pfizer",
        "Moderna",
        "Sinovac",
        "Sinopharm",
        "Janssen",
        "Convidecia"
    )

    private val efekSamping = arrayListOf(
        arrayListOf(
            "Nyeri atau sakit saat ditekan di bekas suntikan",
            "Pembengkakan",
            "Sakit kepala",
            "Kemerahan",
            "Demam",
            "Gatal",
            "Mual"
        ),
        arrayListOf(
            "Nyeri atau sakit saat ditekan di bekas suntikan",
            "Sakit kepala",
            "Menggigil",
            "Demam",
            "Lemas",
            "Mual"
        ),
        arrayListOf(
            "Nyeri atau sakit saat ditekan di bekas suntikan",
            "Nyeri otot atau sendi",
            "Sakit kepala",
            "Kelelahan",
            "Menggigil",
            "Demam",
            "Mual"
        ),
        arrayListOf(
            "Nyeri atau sakit saat ditekan di bekas suntikan",
            "Gangguan pada kulit",
            "Sakit kepala",
            "Demam",
            "Diare",
            "Mual"
        ),
        arrayListOf(
            "Nyeri atau sakit saat ditekan di bekas suntikan",
            "Sakit kepala",
            "Kelelahan",
            "Nyeri otot",
            "Demam",
            "Batuk"
        ),
        arrayListOf(
            "Nyeri atau sakit saat ditekan di bekas suntikan",
            "Gangguan kulit",
            "Sakit kepala",
            "Demam",
            "Diare",
            "Mual"
        ),
        arrayListOf(
            "Nyeri atau kemerahan",
            "Sakit kepala",
            "Kelelahan",
            "Demam",
            "Diare",
            "Mual"
        )
    )

    private val Dosis = intArrayOf(
        2,
        2,
        2,
        2,
        2,
        1,
        1
    )

    private val efektifitas = arrayListOf(
        62.1f,
        95.5f,
        86.4f,
        65.3f,
        78.2f,
        67.2f,
        90.1f
    )

    fun getVaccinesInfo() : ArrayList<VaccineInfo> {
        val list = arrayListOf<VaccineInfo>()
        vaccineName.forEachIndexed{i,s ->
            var txtEffect = ""
            efekSamping[i].forEachIndexed {i2,s2 ->
                if(i2 < efekSamping.size-1) {
                    txtEffect += "* " + s2
                } else{
                    txtEffect += "* " + s2 + "\n"
                }
            }

            list.add(
                VaccineInfo(s,txtEffect,Dosis[i], efektifitas[i])
            )
        }
        return list
    }
}