package com.example.myapplication.repository

interface IRepos {
    fun getCityDataByLanLon(lat: String, lon: String)
}