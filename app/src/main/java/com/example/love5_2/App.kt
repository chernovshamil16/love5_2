package com.example.love5_2

import android.app.Application
import com.example.love5_2.Love.LoveAPI

class App:Application() {

    companion object{
        lateinit var api: LoveAPI
    }


    override fun onCreate() {
        super.onCreate()
        api = RetrofitService().api
    }
}