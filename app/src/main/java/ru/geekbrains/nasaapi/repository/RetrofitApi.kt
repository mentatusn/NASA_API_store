package ru.geekbrains.nasaapi.repository


import com.example.nasaapp.model.data.EarthEpicServerResponseData
import com.example.nasaapp.model.data.PODServerResponseData
import com.example.nasaapp.model.data.SputnikServerResponseData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query
import ru.geekbrains.lesson_1314_3_1_main.repository.SolarFlareResponseData
import ru.geekbrains.nasaapi.repository.dto.MarsPhotosServerResponseData

interface RetrofitApi {


    @GET("planetary/apod")
    fun getPictureOfTheDay(
        @Query("api_key") apiKey: String,
        @Query("date") date: String,
    ): Call<PODServerResponseData>

    // Earth Polychromatic Imaging Camera
    @GET("EPIC/api/natural")
    fun getEPIC(
        @Query("api_key") apiKey: String,
    ): Call<List<EarthEpicServerResponseData>>

    @GET("/mars-photos/api/v1/rovers/curiosity/photos")
    fun getMarsImageByDate(
        @Query("earth_date") earth_date: String,
        @Query("api_key") apiKey: String,
    ): Call<MarsPhotosServerResponseData>


    @GET("DONKI/FLR")
    fun getSolarFlare(
        @Query("api_key") apiKey: String,
        @Query("startDate") startDate: String,
    ): Call<List<SolarFlareResponseData>>

    @GET("/planetary/earth/assets")
    fun getLandscapeImageFromSputnik(
        @Query("lon") lon: Float,
        @Query("lat") lat: Float,
        @Query("date") dateString: String,
        @Query("dim") dim: Float,
        @Query("api_key") apiKey: String
    ): Call<SputnikServerResponseData>
}

