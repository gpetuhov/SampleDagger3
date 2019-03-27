package com.gpetuhov.android.sampledagger3.application.dagger.modules

import com.gpetuhov.android.sampledagger3.utils.AppTitleProvider
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

// AppModule provides AppTitleProvider with Singleton scope

@Module
class AppModule {

    @Provides
    @Singleton
    fun providesAppTitleProvider() = AppTitleProvider()
}