package com.example.myapplication.presentation.main

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R
import com.example.myapplication.api.RetrofitService
import com.example.myapplication.data.model.net.CityDataNet
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        RetrofitService.weatherApi.loadCity(
            lat = 33.44,
            lon = -94.04,
            exclude = "current,minutely,hourly,alerts",
            appid = "8ce151ab8384bf58d6cc140730b73002",
            units = "metric"
        ).enqueue(object : Callback<CityDataNet> {
            override fun onResponse(call: Call<CityDataNet>, response: Response<CityDataNet>) {
                val data = response.body()?.lat ?: 0
                Log.d("LAN LON","$data")
            }

            override fun onFailure(call: Call<CityDataNet>, t: Throwable) {
                Log.d("LAN LON","$t")
            }
        })
    }
}