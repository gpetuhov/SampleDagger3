package com.gpetuhov.android.sampledagger3.application.dagger.components

import com.gpetuhov.android.sampledagger3.CalculatorActivity
import com.gpetuhov.android.sampledagger3.application.dagger.modules.CalculatorModule
import com.gpetuhov.android.sampledagger3.application.dagger.scopes.CalculatorScope
import com.gpetuhov.android.sampledagger3.calculator.CalculatorTitleProvider
import com.gpetuhov.android.sampledagger3.utils.AppTitleProvider
import dagger.Component

// Dependent components cannot have the same scope!

// CalculatorComponent is dependent on AppComponent.
// This means, that CalculatorComponent can inject classes provided by CalculatorModule,
// and also classes, which AppComponent allows to inject for its dependants.

@Component(
    dependencies = [AppComponent::class],   // One component can have many dependencies
    modules = [CalculatorModule::class]
)
@CalculatorScope
interface CalculatorComponent {
    // CalculatorComponent allows its dependants to use AppTitleProvider (from AppComponent)
    fun appTitleProvider(): AppTitleProvider
    // and CalculatorTitleProvider
    fun calculatorTitleProvider(): CalculatorTitleProvider

    fun inject(calculatorActivity: CalculatorActivity)
}