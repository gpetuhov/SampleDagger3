package com.gpetuhov.android.sampledagger3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.pawegio.kandroid.startActivity
import kotlinx.android.synthetic.main.activity_calculator.*

class CalculatorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        addButton.setOnClickListener { startActivity<AdderActivity>() }
        subtractButton.setOnClickListener { startActivity<SubtractorActivity>() }
    }
}