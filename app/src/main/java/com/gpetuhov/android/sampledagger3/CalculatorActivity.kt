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

        App.getCalculatorComponent()?.inject(this)

        appTitle.text = appTitleProvider.appTitle
        calculatorTitle.text = calculatorTitleProvider.calculatorTitle

        addButton.setOnClickListener { startActivity<AdderActivity>() }
        subtractButton.setOnClickListener { startActivity<SubtractorActivity>() }
    }

    override fun onDestroy() {
        App.clearCalculatorComponent()
        super.onDestroy()
    }
}