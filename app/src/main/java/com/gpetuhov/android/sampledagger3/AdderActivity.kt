package com.gpetuhov.android.sampledagger3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.gpetuhov.android.sampledagger3.application.App
import com.gpetuhov.android.sampledagger3.calculator.Adder
import com.gpetuhov.android.sampledagger3.calculator.CalculatorTitleProvider
import com.gpetuhov.android.sampledagger3.utils.AppTitleProvider
import kotlinx.android.synthetic.main.activity_operation.*
import javax.inject.Inject

class AdderActivity : AppCompatActivity() {

    @Inject lateinit var appTitleProvider: AppTitleProvider
    @Inject lateinit var calculatorTitleProvider: CalculatorTitleProvider
    @Inject lateinit var adder: Adder

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_operation)

        // Inject dependencies and use them to display app title, calculator title and adder result
        App.getAdderComponent()?.inject(this)
        appTitle.text = appTitleProvider.appTitle
        calculatorTitle.text = calculatorTitleProvider.calculatorTitle
        result.text = adder.result
    }

    override fun onDestroy() {
        App.clearAdderComponent()
        super.onDestroy()
    }
}