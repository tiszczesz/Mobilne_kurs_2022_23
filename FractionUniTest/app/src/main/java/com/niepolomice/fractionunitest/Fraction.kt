package com.niepolomice.fractionunitest

class Fraction(numerator:Int,  denumerator:Int) {

     private var denumerator = denumerator
        set(value) {
            field = if (value<0) -value else value
        }
        get() {return denumerator}
    private  var numerator:Int = numerator
        set(value) {
            field = value
        }
        get() { return field}
    fun getNWD(a:Int,b:Int):Int{
        if(b==0) return a;
        return getNWD(b,a%b);
    }
    fun setCommonDen(a:Int,b:Int):Int{
        return a*b;
    }
    fun reduceFrac(reducer:Int){

    }
}