package com.niepolomice.exerciselayouts

class CalculateCener(private var numberA:Double,private var numberB:Double) {
    public fun Add():String {
        return String.format("%.2f",numberA+numberB)
    }
}