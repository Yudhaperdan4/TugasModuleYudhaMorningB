package com.example.tugasyudhamodule

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Food(
    val imgFood: Int,
    val nameFood: String,
    val descFood: String
): Parcelable
