package com.gpetuhov.android.sampledagger3.application

import android.app.Application
import com.gpetuhov.android.sampledagger3.application.dagger.components.AppComponent
import com.gpetuhov.android.sampledagger3.application.dagger.components.CalculatorComponent
import com.gpetuhov.android.sampledagger3.application.dagger.components.DaggerAppComponent
import com.gpetuhov.android.sampledagger3.application.dagger.components.DaggerCalculatorComponent
import com.gpetuhov.android.sampledagger3.application.dagger.modules.AppModule

class App : Application() {

    companion object {
        var appComponent: AppComponent? = null
        private var calculatorComponent: CalculatorComponent? = null

        fun getCalculatorComponent(): CalculatorComponent? {
            if (calculatorComponent == null) {
                calculatorComponent = DaggerCalculatorComponent.builder()
                    .appComponent(appComponent)
                    .build()
            }
            return calculatorComponent
        }

        fun clearCalculatorComponent() {
            calculatorComponent = null
        }
    }

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule())     // this can be omitted
            .build()
    }
}