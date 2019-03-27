package com.gpetuhov.android.sampledagger3.application.dagger.components

import com.gpetuhov.android.sampledagger3.AdderActivity
import com.gpetuhov.android.sampledagger3.application.dagger.modules.AdderModule
import com.gpetuhov.android.sampledagger3.application.dagger.scopes.AdderScope
import dagger.Component

@Component(
    dependencies = [CalculatorComponent::class],
    modules = [AdderModule::class]
)
@AdderScope
interface AdderComponent {
    fun inject(adderActivity: AdderActivity)
}