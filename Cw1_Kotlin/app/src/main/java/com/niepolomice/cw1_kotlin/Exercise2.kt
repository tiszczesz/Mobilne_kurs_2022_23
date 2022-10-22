package com.niepolomice.cw1_kotlin

import java.lang.Double.POSITIVE_INFINITY

fun main(){
  //  Ex2_1();
    Ex2_2()
}
fun Ex2_1(){
    print("Podaj swój wiek: ")
    val age = readln().toInt();
    if(age>=18){
        println("Pełnoletni");
    }else{
        println("Niepełnoletni");
    }
    var napis = if((age % 2)==0) "parzyste" else "nieparzyste";
    println(napis);
    println(GetAge(age));
    GetType(34.0)
}
fun GetAge(age:Int):String {
    when (age){
        in (Int.MIN_VALUE..0) ->  return "nie żyje";
        in (0..17) -> return "niepełnoletni";
        in (18..50) -> return "pełnoletni";
        else -> return "dziadek";
    }
}
fun GetType(arg:Any){
    when(arg){
        is Int -> println("'$arg' jest typu całkowitego")
        is Double -> println("'$arg' jest typu zmiennoprzecinkowy")
        is String -> println("'$arg' jest napisem")
        else -> println("'$arg' jakiś inny typ")
    }
}
fun Ex2_2(){
    print("Podaj numner dnia: ")
    val liczba = readln().toInt()
    val message = when{
        liczba % 2 == 0 -> "podzielne przez dwa"
        liczba % 3 == 0 -> "podzielne przez trzy"
        liczba % 4 == 0 -> "podzielne przez cztery"
        liczba % 5 == 0 -> "podzielne przez piec"
        liczba % 6 == 0 -> "podzielne przez szesc"
        liczba % 7 == 0 -> "podzielne przez siedem"
        liczba % 8 == 0 -> "podzielne przez dwa"
        liczba % 9 == 0 -> "podzielne przez dwa"
        liczba % 10 == 0 -> "podzielne przez dwa"
        else -> "pozostałe"
    }
    println(message);
}