package com.example.myapplication.data.model.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "city_data_info")
data class CityDataDb(
    @ColumnInfo(name = "lat") val lat: Double,
    @ColumnInfo(name = "lon") val lon: Double,
    @ColumnInfo(name = "timezone") val timezone: String,
    @ColumnInfo(name = "timezone_offset") val timezoneOffset: Long,
    @PrimaryKey @ColumnInfo(name = "dt") val dt: Long,
    @ColumnInfo(name = "sunrise") val sunrise: Long,
    @ColumnInfo(name = "sunset") val sunset: Long,
    @ColumnInfo(name = "moonrise") val moonrise: Long,
    @ColumnInfo(name = "moonset") val moonset: Long,
    @ColumnInfo(name = "moon_phase") val moonPhase: Double,
    @ColumnInfo(name = "pressure") val pressure: Int,
    @ColumnInfo(name = "humidity") val humidity: Int,
    @ColumnInfo(name = "dew_point") val dewPoint: Double,
    @ColumnInfo(name = "wind_speed") val windSpeed: Double,
    @ColumnInfo(name = "wind_deg") val windDeg: Int,
    @ColumnInfo(name = "wind_gust") val windGust: Double,
    @ColumnInfo(name = "clouds") val clouds: Int,
    @ColumnInfo(name = "pop") val pop: Double,
    @ColumnInfo(name = "rain") val rain: Double,
    @ColumnInfo(name = "uvi") val uvi: Double,
    @ColumnInfo(name = "temp_day") val tempDay: Double,
    @ColumnInfo(name = "temp_min") val tempMin: Double,
    @ColumnInfo(name = "temp_max") val tempMax: Double,
    @ColumnInfo(name = "temp_night") val tempNight: Double,
    @ColumnInfo(name = "temp_eve") val tempEve: Double,
    @ColumnInfo(name = "temp_morn") val tempMorn: Double,
    @ColumnInfo(name = "feels_like_day") val feelsLikeDay: Double,
    @ColumnInfo(name = "feels_like_night") val feelsLikeNight: Double,
    @ColumnInfo(name = "feels_like_eve") val feelsLikeEve: Double,
    @ColumnInfo(name = "feels_like_morn") val feelsLikeMorn: Double,
    @ColumnInfo(name = "weather_id") val weatherId: Long,
    @ColumnInfo(name = "weather_main") val weatherMain: String,
    @ColumnInfo(name = "weather_description") val weatherDescription: String,
    @ColumnInfo(name = "weather_icon") val weatherIcon: String
)