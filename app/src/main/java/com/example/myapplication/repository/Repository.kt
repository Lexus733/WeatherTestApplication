package com.example.myapplication.repository

import com.example.myapplication.api.RetrofitService
import com.example.myapplication.data.model.net.CityDataNet
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Repository : IRepos {
    private lateinit var retrofitService: RetrofitService

    override fun getCityDataByLanLon(lat: String, lon: String) {
        retrofitService.weatherApi.loadCity(
            lat = lat,
            lon = lon,
            exclude = "current,minutely,hourly,alerts",
            appid = "8ce151ab8384bf58d6cc140730b73002",
            units = "metric"
        ).enqueue(object : Callback<CityDataNet> {
            override fun onResponse(call: Call<CityDataNet>, response: Response<CityDataNet>) {
            }

            override fun onFailure(call: Call<CityDataNet>, t: Throwable) {
            }
        })
    }
}