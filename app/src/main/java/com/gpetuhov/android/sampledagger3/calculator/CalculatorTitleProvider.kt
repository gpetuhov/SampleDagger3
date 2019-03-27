package com.gpetuhov.android.sampledagger3.calculator

// Provides title of the calculator.
// Has to be injected into CalculatorActivity, AdderActivity and SubtractorActivity.
class CalculatorTitleProvider {
    val calculatorTitle get() = "The Kalculator"
}