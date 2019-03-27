package com.gpetuhov.android.sampledagger3.application.dagger.components

import com.gpetuhov.android.sampledagger3.CalculatorActivity
import com.gpetuhov.android.sampledagger3.application.dagger.modules.CalculatorModule
import com.gpetuhov.android.sampledagger3.application.dagger.scopes.CalculatorScope
import dagger.Component

@Component(
    dependencies = [AppComponent::class],
    modules = [CalculatorModule::class]
)
@CalculatorScope
interface CalculatorComponent {
    fun inject(calculatorActivity: CalculatorActivity)
}