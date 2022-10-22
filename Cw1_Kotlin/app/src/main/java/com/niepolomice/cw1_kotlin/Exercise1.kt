package com.niepolomice.cw1_kotlin
var b = 56;
fun main(){
   // Ex1();
    Ex2()
}
fun Ex1(){
    //cw1
    //            print("Hello from Kotlin\n");
    //            println("Hello from Kotlin");
    //            print(4567);
    //cw2
    val myName = "Jan Nowak";
    var a:Int  = 232;
    //myName = "cos innego"; error
    a = 457;
    //a = "ala ma kota"; error język silnie typowalny
    println(myName);
    println(a);
    println(b);
    println(56/89);
    val one = 1 // Int
    val threeBillion = 3000000000 // Long
    val oneLong = 1L // Long
    val oneByte: Byte = 1

    val oneMillion = 1_000_000
    val creditCardNumber = 1234_5678_9012_3456L
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val myBytes = 0b010
    val bytes = 0b11010010_01101001_10010100_10010010
    println(bytes)
    println(myBytes)
}
fun Ex2(){
    //utworzyć zmienne przechowujące typy
    /*
    "Kurs Android"
    13.37F
    3.14159265358979
    25
    2020
    18881234567
    true
    'a'
     */
    val a:Boolean = true;
    var result = 35;
    val znak:Char = 'A';
    val napis:String = "ala ma kota";
    println(napis[napis.length-1]);
    result /= 2;  //result = result / 2
    var result2 = result.toDouble()/2;
    println(result);
    println(result2);
    //operatory logiczne  (== != < > <= >=)
    //operatory arytmetyczne (+ * - / %    += ++ -- *= -= /=)
    var aa = 12;
    var bb = 12;     // bb++ == 12   true     ++bb == 12  false
    println(aa++);
    println(aa);
    println(++bb);
    println(bb);
    println(" aa = ${aa}");
    println(" aa = $aa");
    println(" aa = ${aa+bb}");
}
