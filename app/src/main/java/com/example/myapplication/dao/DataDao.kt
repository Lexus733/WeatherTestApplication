package com.example.myapplication.dao

import androidx.room.Dao
import androidx.room.Query
import com.example.myapplication.data.model.db.CityDb

@Dao
interface DataDao {

    @Query("SELECT * FROM cities")
    fun getAllCities(): List<CityDb>
}