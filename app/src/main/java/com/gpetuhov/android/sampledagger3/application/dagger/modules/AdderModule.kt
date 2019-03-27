package com.gpetuhov.android.sampledagger3.application.dagger.modules

import com.gpetuhov.android.sampledagger3.application.dagger.scopes.AdderScope
import com.gpetuhov.android.sampledagger3.calculator.Adder
import dagger.Module
import dagger.Provides

@Module
class AdderModule {

    @Provides
    @AdderScope
    fun providesAdder() = Adder()
}