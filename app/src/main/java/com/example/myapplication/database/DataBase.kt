package com.example.myapplication.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.myapplication.dao.DataDao
import com.example.myapplication.data.model.db.CityDataDb
import com.example.myapplication.data.model.db.CityDb

@Database(entities = [CityDb::class, CityDataDb::class], version = 1)
abstract class DataBase : RoomDatabase() {
    abstract fun dataDao(): DataDao

    companion object {
        private var INSTANCE: DataBase? = null

        fun getInstance(context: Context): DataBase? {
            if (INSTANCE == null) {
                synchronized(DataBase::class) {
                    INSTANCE = Room
                        .databaseBuilder(
                            context.applicationContext, DataBase::class.java, "database.db"
                        )
                        .build()
                }
            }
            return INSTANCE
        }
    }
}