package com.gpetuhov.android.sampledagger3.application.dagger.modules

import com.gpetuhov.android.sampledagger3.application.dagger.scopes.SubtractorScope
import com.gpetuhov.android.sampledagger3.calculator.Subtractor
import dagger.Module
import dagger.Provides

// SubtractorModule provides Subtractor with SubtractorScope

@Module
class SubtractorModule {

    @Provides
    @SubtractorScope
    fun providesSubtractor() = Subtractor()
}