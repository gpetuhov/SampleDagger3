package com.gpetuhov.android.sampledagger3.application.dagger.modules

import com.gpetuhov.android.sampledagger3.application.dagger.scopes.CalculatorScope
import com.gpetuhov.android.sampledagger3.calculator.CalculatorTitleProvider
import dagger.Module
import dagger.Provides

@Module
class CalculatorModule {

    @Provides
    @CalculatorScope
    fun providesCalculatorTitleProvider() = CalculatorTitleProvider()
}