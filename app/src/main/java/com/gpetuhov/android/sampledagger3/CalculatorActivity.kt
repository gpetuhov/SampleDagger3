package com.gpetuhov.android.sampledagger3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.gpetuhov.android.sampledagger3.application.App
import com.gpetuhov.android.sampledagger3.calculator.CalculatorTitleProvider
import com.gpetuhov.android.sampledagger3.utils.AppTitleProvider
import com.pawegio.kandroid.startActivity
import kotlinx.android.synthetic.main.activity_calculator.*
import javax.inject.Inject

class CalculatorActivity : AppCompatActivity() {

    @Inject lateinit var appTitleProvider: AppTitleProvider
    @Inject lateinit var calculatorTitleProvider: CalculatorTitleProvider

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        // Inject dependencies and use them to get app title and calculator title
        App.getCalculatorComponent()?.inject(this)
        appTitle.text = appTitleProvider.appTitle
        calculatorTitle.text = calculatorTitleProvider.calculatorTitle

        // Start AdderActivity or SubtractorActivity
        addButton.setOnClickListener { startActivity<AdderActivity>() }
        subtractButton.setOnClickListener { startActivity<SubtractorActivity>() }
    }

    override fun onDestroy() {
        // This clears CalculatorComponent instance and allows Dagger to clear
        // all class instances with the corresponding scope (CalculatorScope)
        App.clearCalculatorComponent()
        super.onDestroy()
    }
}