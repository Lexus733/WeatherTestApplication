package com.example.myapplication.presentation.choosecity

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.arellomobile.mvp.MvpFragment
import com.arellomobile.mvp.presenter.InjectPresenter
import com.example.myapplication.R

class ChooseCityFragment: MvpFragment(),ChooseCityView {
    @InjectPresenter
    lateinit var presenter: ChooseCityPresenter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.choose_city_fragment, container, false)
    }
}