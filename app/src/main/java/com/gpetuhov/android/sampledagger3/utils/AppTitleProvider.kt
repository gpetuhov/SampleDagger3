package com.gpetuhov.android.sampledagger3.utils

// Provides title of the application.
// Has to be injected into all 4 activities.
class AppTitleProvider {
    val appTitle get() = "My Super Application"
}