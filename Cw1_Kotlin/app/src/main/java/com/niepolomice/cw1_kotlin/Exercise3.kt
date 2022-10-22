package com.niepolomice.cw1_kotlin

import kotlin.math.sqrt
import kotlin.random.Random

fun main(){
    Ex3_1();
}
fun Ex3_1(){
//    for(i in 1..10){
//        println("Numer liczby $i ${Random.nextInt(0,20)}")
//    }
//    for(i in 20 downTo  1 ){
//        println("Numer liczby $i ")
//    }
    // for(int i=2; i*i <= limit ;i++){...}
    var limit = 20.0
    var pow = 20;
    for(i in 2 until   pow ){
        println("Numer liczby $i ")
    }
    var sum = 0;
    while (sum<100){
        var losowa = Random.nextInt(0,20)
        println("wylosowano: $losowa")
        sum+=losowa
    }
    println("suma = $sum");
    println("---------------------------------------------------------")
    var index = 0;
    do {
        println(index)
    }while(index++<10);
}