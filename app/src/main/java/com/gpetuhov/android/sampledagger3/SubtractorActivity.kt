package com.gpetuhov.android.sampledagger3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.gpetuhov.android.sampledagger3.application.App
import com.gpetuhov.android.sampledagger3.calculator.CalculatorTitleProvider
import com.gpetuhov.android.sampledagger3.calculator.Subtractor
import com.gpetuhov.android.sampledagger3.utils.AppTitleProvider
import kotlinx.android.synthetic.main.activity_operation.*
import javax.inject.Inject

class SubtractorActivity : AppCompatActivity() {

    @Inject lateinit var appTitleProvider: AppTitleProvider
    @Inject lateinit var calculatorTitleProvider: CalculatorTitleProvider
    @Inject lateinit var subtractor: Subtractor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_operation)

        App.getSubtractorComponent()?.inject(this)

        appTitle.text = appTitleProvider.appTitle
        calculatorTitle.text = calculatorTitleProvider.calculatorTitle
        result.text = subtractor.result
    }

    override fun onDestroy() {
        App.clearSubtractorComponent()
        super.onDestroy()
    }
}