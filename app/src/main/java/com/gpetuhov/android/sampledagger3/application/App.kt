package com.gpetuhov.android.sampledagger3.application

import android.app.Application
import com.gpetuhov.android.sampledagger3.application.dagger.components.AppComponent
import com.gpetuhov.android.sampledagger3.application.dagger.components.DaggerAppComponent

class App : Application() {

    companion object {
        lateinit var appComponent: AppComponent
    }

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder().build()
    }
}