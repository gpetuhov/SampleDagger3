package com.gpetuhov.android.sampledagger3.application

import android.app.Application
import com.gpetuhov.android.sampledagger3.application.dagger.components.*
import com.gpetuhov.android.sampledagger3.application.dagger.modules.AppModule

class App : Application() {

    companion object {
        var appComponent: AppComponent? = null
        private var calculatorComponent: CalculatorComponent? = null
        private var adderComponent: AdderComponent? = null
        private var subtractorComponent: SubtractorComponent? = null

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

        fun getAdderComponent(): AdderComponent? {
            if (adderComponent == null) {
                adderComponent = DaggerAdderComponent.builder()
                    .calculatorComponent(calculatorComponent)
                    .build()
            }
            return adderComponent
        }

        fun clearAdderComponent() {
            adderComponent = null
        }

        fun getSubtractorComponent(): SubtractorComponent? {
            if (subtractorComponent == null) {
                subtractorComponent = DaggerSubtractorComponent.builder()
                    .calculatorComponent(calculatorComponent)
                    .build()
            }
            return subtractorComponent
        }

        fun clearSubtractorComponent() {
            subtractorComponent = null
        }
    }

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule())     // this line can be omitted
            .build()
    }
}