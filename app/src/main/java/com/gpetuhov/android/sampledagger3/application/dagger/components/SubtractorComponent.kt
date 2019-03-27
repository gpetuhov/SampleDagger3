package com.gpetuhov.android.sampledagger3.application.dagger.components

import com.gpetuhov.android.sampledagger3.SubtractorActivity
import com.gpetuhov.android.sampledagger3.application.dagger.modules.SubtractorModule
import com.gpetuhov.android.sampledagger3.application.dagger.scopes.SubtractorScope
import dagger.Component

@Component(
    dependencies = [CalculatorComponent::class],
    modules = [SubtractorModule::class]
)
@SubtractorScope
interface SubtractorComponent {
    fun inject(subtractorActivity: SubtractorActivity)
}