package com.gpetuhov.android.sampledagger3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pawegio.kandroid.startActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calculatorButton.setOnClickListener { startActivity<CalculatorActivity>() }
    }
}
