package com.gpetuhov.android.sampledagger3.calculator

// Provides add result.
// Has to be injected into AdderActivity.
class Adder {
    val result get() = "2 + 2 = 4"
}