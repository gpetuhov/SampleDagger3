# SampleDagger3
Learn Dagger 2 Component dependencies and Scopes in Android.

## Requirements
* Android Studio 3.5 Canary 8
* Kotlin 1.3.21
* Android Gradle Plugin 3.5.0-alpha08
* Gradle wrapper 5.3-rc-2
* AAPT 2

## Notes
This application has no logic, it just displays texts in TextViews, but the text to display is provided by corresponding providers, which are injected into activities by Dagger.

The app has 4 screens (activities): MainActivity, CalculatorActivity, AdderActivity and SubtractorActivity. MainActivity starts CalculatorActivity and CalculatorActivity. Each activity has to display application title, which is provided by AppTitleProvider. CalculatorActivity, AdderActivity and SubtractorActivity along with app title have to display calculator title, which is provided by CalculatorTitleProvider. AdderActivity along with app title and calculator title has to display add result. SubtractorActivity along with app title and calculator title has to display subtract result.

In order to control the lifecycle Dagger injected instances we have 4 scopes: global (@Singleton) and one for each of the calculator activities.

For the component to be able to inject classes from the other component this example uses Component dependencies mechanism. For the example with Subcomponents see this repo: https://github.com/gpetuhov/SampleDagger 

## References
https://habr.com/ru/post/279641/