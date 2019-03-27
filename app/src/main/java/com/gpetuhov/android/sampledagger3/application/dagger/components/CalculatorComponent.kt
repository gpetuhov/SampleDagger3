package com.gpetuhov.android.sampledagger3.application.dagger.components

import com.gpetuhov.android.sampledagger3.CalculatorActivity
import com.gpetuhov.android.sampledagger3.application.dagger.modules.CalculatorModule
import com.gpetuhov.android.sampledagger3.application.dagger.scopes.CalculatorScope
import com.gpetuhov.android.sampledagger3.calculator.CalculatorTitleProvider
import com.gpetuhov.android.sampledagger3.utils.AppTitleProvider
import dagger.Component

@Component(
    dependencies = [AppComponent::class],
    modules = [CalculatorModule::class]
)
@CalculatorScope
interface CalculatorComponent {
    fun appTitleProvider(): AppTitleProvider
    fun calculatorTitleProvider(): CalculatorTitleProvider

    fun inject(calculatorActivity: CalculatorActivity)
}