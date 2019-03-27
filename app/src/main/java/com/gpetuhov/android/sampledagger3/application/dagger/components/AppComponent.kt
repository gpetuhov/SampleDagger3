package com.gpetuhov.android.sampledagger3.application.dagger.components

import com.gpetuhov.android.sampledagger3.MainActivity
import com.gpetuhov.android.sampledagger3.application.dagger.modules.AppModule
import com.gpetuhov.android.sampledagger3.utils.AppTitleProvider
import dagger.Component
import javax.inject.Singleton

@Component(modules = [AppModule::class])
@Singleton
interface AppComponent {
    fun appTitleProvider(): AppTitleProvider

    fun inject(mainActivity: MainActivity)
}