package com.niepolomice.cw1_kotlin

import kotlin.random.Random

fun main(){
   // Ex5_1()
   // Ex5_2()
    Ex5_3()
}

fun Ex5_1(){
    var name:String? = null;
    if(name is String){
        println(name.length);
    }else{
        println("nie można podać rozmiaru")
    }
    if(name!=null){
        println(name.length);
    }else{
        println("nie można podać rozmiaru")
    }
    println(name?.length)
    //var a = name!!.length;
    var napis = if(name!=null) "OK" else "niestety null";
    //val l = b?.length ?: -1
    var napis2 = name?.length ?: "niestey null";
    println(name?.length ?: "niestey null")
//    val myTab = IntArray(5){it * it}
//    val myTab = IntArray(5){ Random.nextInt(1,20) }
    val myTab = BooleanArray(100){ IsPrime(it) }

    for (i in myTab){
        println(i);
    }
}
fun Ex5_2(){
    val result = getPrimeArray(30,100);
    for (i in result){
        println(i)
    }
}
fun Ex5_3(){
    var result = getArrayString("koniec");
    for (i in result){
        println(i)
    }
}
fun getPrimeArray(limit:Int,start:Int):IntArray{
    var result = IntArray(0)
    var counter = 0;
    var actual = start;
    while(counter<limit){
        if(IsPrime(actual)){
            result += actual; // push do tablicy
            counter++;
        }
        actual++;
    }
    return result;
}
fun getArrayString(end:String ):Array<String> {
    var result:Array<String> = arrayOf();
    result += "sddsddsd";
    return result;
}