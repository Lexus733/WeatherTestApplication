package com.example.myapplication

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.example.myapplication.database.DataBase
import ru.terrakok.cicerone.Cicerone
import ru.terrakok.cicerone.NavigatorHolder
import ru.terrakok.cicerone.Router

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        sharedPreferences = getSharedPreferences(
            "WeatherApplication", Context.MODE_PRIVATE
        )
        cicerone = Cicerone.create()
        db = DataBase.getInstance(this)
    }

    companion object {
        private var cicerone: Cicerone<Router>? = null
        private var db: DataBase? = null
        private lateinit var sharedPreferences: SharedPreferences

        fun getDb() = db!!.dataDao()

        fun getSP() = sharedPreferences

        fun getNavigatorHolder(): NavigatorHolder =
            requireNotNull(cicerone) { "Parameter 'cicerone' is missing!" }
                .navigatorHolder

        fun getRouter(): Router =
            requireNotNull(cicerone) { "Parameter 'cicerone' is missing!" }
                .router
    }
}