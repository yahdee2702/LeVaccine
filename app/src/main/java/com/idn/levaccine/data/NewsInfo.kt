package com.idn.levaccine.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize data class NewsInfo(
    val title : String,
    val date : String,
    val reporter : String,
    val category : String,
    val content : String,
    val photo : Int,
    val photoInfo : String
) : Parcelable
