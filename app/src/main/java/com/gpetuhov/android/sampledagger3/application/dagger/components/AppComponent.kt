package com.gpetuhov.android.sampledagger3.application.dagger.components

import com.gpetuhov.android.sampledagger3.MainActivity
import com.gpetuhov.android.sampledagger3.application.dagger.modules.AppModule
import com.gpetuhov.android.sampledagger3.utils.AppTitleProvider
import dagger.Component
import javax.inject.Singleton

// AppComponent uses AppModule to inject AppTitleProvider into MainActivity

// @Singleton scope is available by default
// In this example we never clear AppComponent,
// so AppTitleProvider instance exists throughout all the application's lifecycle.

@Component(modules = [AppModule::class])
@Singleton
interface AppComponent {
    // This tells Dagger, that those components, that are dependent on AppComponent,
    // will also be able to inject AppTitleProvider.
    // So we have to explicitly tell Dagger, which of the instances provided by AppModule,
    // AppComponent allows to use for its dependencies.
    // Note that the dependants of the dependants will not have access to AppTitleProvider,
    // until explicitly allowed in dependants.
    fun appTitleProvider(): AppTitleProvider

    fun inject(mainActivity: MainActivity)
}