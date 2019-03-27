package com.gpetuhov.android.sampledagger3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gpetuhov.android.sampledagger3.application.App
import com.gpetuhov.android.sampledagger3.utils.AppTitleProvider
import com.pawegio.kandroid.startActivity
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

// App's main screen.
// Here we use AppComponent to inject AppTitleProvider.
class MainActivity : AppCompatActivity() {

    @Inject lateinit var appTitleProvider: AppTitleProvider

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inject AppTitleProvider and display app title
        App.appComponent?.inject(this)
        appTitle.text = appTitleProvider.appTitle

        // Start CalculatorActivity
        calculatorButton.setOnClickListener { startActivity<CalculatorActivity>() }
    }
}
