package com.example.love5_2.Retrofit

import android.app.Application

    class App : Application() {

        companion object {
            lateinit var api: LoveInterface
        }
        override fun onCreate() {
            super.onCreate()
            api = Retrofit().api
        }
    }
