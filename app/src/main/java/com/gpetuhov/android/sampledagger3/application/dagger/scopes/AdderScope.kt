package com.gpetuhov.android.sampledagger3.application.dagger.scopes

import javax.inject.Scope

// Scope is the way to control the instance of the classes being injected.
// These instances exist as long as exists the component annotated with this scope.

// Scope for AdderActivity
@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class AdderScope