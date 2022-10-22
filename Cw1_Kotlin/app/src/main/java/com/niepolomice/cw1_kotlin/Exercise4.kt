package com.niepolomice.cw1_kotlin

fun main(){
    print("Podaj liczbę: ")
    val liczba = readln().trim().toInt();
    if(IsPrime(liczba)){
        println("$liczba jest liczba pierwsza")
    }else{
        println("$liczba nie jest liczba pierwsza")
    }
}
fun IsPrime(number:Int):Boolean {
    if(number<2) return false;
    var licznik = 2
    while (licznik*licznik<=number){
        if(number % licznik == 0) return false;
        licznik++;
    }
    println("Ilość wykonan pętli: $licznik");
    return true;
}