package com.example.myapplication.other

import android.app.Fragment
import com.example.myapplication.presentation.choosecity.ChooseCityFragment
import ru.terrakok.cicerone.android.pure.AppScreen

class ChooseCityScreen : AppScreen() {
    override fun getFragment(): Fragment {
        return ChooseCityFragment()
    }
}