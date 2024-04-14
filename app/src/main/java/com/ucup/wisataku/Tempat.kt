package com.ucup.wisataku

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Tempat(
    val name: String,
    val description: String,
    val photo: Int
) : Parcelable
