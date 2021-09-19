package ru.geekbrains.nasaapi.viewmodel

import com.example.nasaapp.model.data.EarthEpicServerResponseData
import com.example.nasaapp.model.data.PODServerResponseData
import com.example.nasaapp.model.data.SputnikServerResponseData
import ru.geekbrains.lesson_1314_3_1_main.repository.SolarFlareResponseData
import ru.geekbrains.nasaapi.repository.dto.MarsPhotosServerResponseData

sealed class AppState {
    data class SuccessPOD(val serverResponseData: PODServerResponseData) : AppState()
    data class SuccessEarthEpic (val serverResponseData: List<EarthEpicServerResponseData>) : AppState()
    data class SuccessMars(val serverResponseData: MarsPhotosServerResponseData) : AppState()
    data class SuccessWeather(val solarFlareResponseData:List<SolarFlareResponseData>) : AppState()
    data class Error(val error: Throwable) : AppState()
    object Loading : AppState()
}
