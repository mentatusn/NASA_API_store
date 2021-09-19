package ru.geekbrains.nasaapi.repository.dto

import com.example.nasaapp.model.data.MarsServerResponseData
import com.google.gson.annotations.SerializedName

data class MarsPhotosServerResponseData(
    @field:SerializedName("photos") val photos: ArrayList<MarsServerResponseData>,
)