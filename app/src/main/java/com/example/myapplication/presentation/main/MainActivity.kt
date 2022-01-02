package com.example.myapplication.presentation.main

import android.app.Fragment
import android.os.Bundle
import com.arellomobile.mvp.MvpActivity
import com.arellomobile.mvp.presenter.InjectPresenter
import com.example.myapplication.App
import com.example.myapplication.R
import com.example.myapplication.other.ChooseCityScreen
import ru.terrakok.cicerone.android.pure.AppNavigator
import ru.terrakok.cicerone.android.pure.AppScreen


class MainActivity : MvpActivity(), MainActivityView {
    @InjectPresenter
    lateinit var presenter: MainActivityPresenter
    private val navigator = object : AppNavigator(this, R.id.frame_layout) {
        override fun createFragment(screen: AppScreen?): Fragment {
            return screen?.fragment ?: super.createFragment(screen)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        App.getRouter().navigateTo(ChooseCityScreen())

    }

    override fun onResume() {
        super.onResume()
        App.getNavigatorHolder().setNavigator(navigator)
    }

    override fun onPause() {
        super.onPause()
        App.getNavigatorHolder().removeNavigator()
    }


}