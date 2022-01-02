package com.example.myapplication.presentation.main

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.arellomobile.mvp.MvpActivity
import com.arellomobile.mvp.presenter.InjectPresenter
import com.example.myapplication.R
import com.example.myapplication.api.RetrofitService
import com.example.myapplication.data.model.net.CityDataNet
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : MvpActivity(),MainActivityView{
    @InjectPresenter
    lateinit var presenter: MainActivityPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}