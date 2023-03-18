# Aplikacje mobilne 2022-23 (Android)
## Przegląd technologi:
1. Android Studio: https://developer.android.com/studio
   1. Dokumnetacja dla programistów: https://developer.android.com/docs
   2. Podręczniki i tutoriale: https://developer.android.com/guide
2. Xamarin i Visuala studio: https://learn.microsoft.com/pl-pl/xamarin/get-started/what-is-xamarin
3. React Native: https://reactnative.dev/
4. Cordova Apache: https://cordova.apache.org/
5. Flutter i Dart: https://docs.flutter.dev/

## Architektura  systemu Android
* Opis architektury: https://developer.android.com/guide/platform

## Programowanie w systemie Android
- Java i Kotlin
- Dokumentacja Kotlin: https://kotlinlang.org/
- playground dla Kotlin: 

## Język Kotlin
- Typy danych: https://kotlinlang.org/docs/basic-types.html


```kotlin
    val one = 1 // Int
    val threeBillion = 3000000000 // Long
    val oneLong = 1L // Long
    val oneByte: Byte = 1

    //typy zmiennoprzecinkowe
    val e = 2.7182818284 // Double
    val eFloat = 2.7182818284f // Float, actual value is 2.7182817

    //string
    val myStr = "Hello World"
    var firCharInStr = myStr[0]
    var lastCharInStr = myStr[myStr.length - 1]
    val str = "abcd"
    println(str.uppercase()) // Create and print a new String object
    println(str) // The original string remains the same

    //boolean
    val myTrue: Boolean = true
    val myFalse: Boolean = false
    val boolNull: Boolean? = null

    println(myTrue || myFalse)
    println(myTrue && myFalse)
    println(!myTrue) 

    //char
    val aChar: Char = 'a'

    println(aChar)
    println('\n') // Prints an extra newline character
    println('\uFF00')

``` 
## Instrukcje sterujące

[Dokumentacja:] (https://kotlinlang.org/docs/control-flow.html)    

## Typy Nulowalne
dokumentacja: https://kotlinlang.org/docs/basic-syntax.html#nullable-values-and-null-checks

## Cykl życia activity

Dokumentacja: https://developer.android.com/guide/components/activities/activity-lifecycle

## Zadanie 1
### Omówienie Save key-value data
https://developer.android.com/training/data-storage/shared-preferences


## Android Room

```console

    implementation 'androidx.core:core-ktx:1.9.0'
    def room_version = "2.5.0"

    implementation "androidx.room:room-ktx:$room_version"
    implementation "androidx.room:room-runtime:$room_version"
    kapt "androidx.room:room-compiler:$room_version"
    implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:2.5.1"
    implementation "androidx.lifecycle:lifecycle-runtime-ktx:2.5.1"

    implementation 'androidx.core:core-ktx:1.9.0'



```