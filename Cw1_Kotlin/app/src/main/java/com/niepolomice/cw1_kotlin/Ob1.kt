package com.niepolomice.cw1_kotlin

fun main() {
    val p1 = Person("Antoni", "Wałecki")
    val p2 = Person("Antoni", "Wałecki")
    p2.firstName = "dfgdfgdg";
    println(p1.Show())
    println(p2.Show())
    val b1 = Book("Nowy tytuł",34.99);
    val b2 = Book("inny tytuł",45.88,"Helion")
}

class Person(var firstName: String,private var lastName: String) {
    init {
        println("Zainicjowanie obiektu klasy Person ${firstName} ${lastName}")
    }
    fun Show():String {
        return "Obiekt klasy Person ${this.firstName} ${this.lastName}"
    }
}
class Book(var title:String,var price:Double){
    var editor: String? = null
    constructor(title: String,price: Double,editor:String?)
    :this(title,price)
    {
        this.editor = editor;
    }
}


//class Person constructor(_firstName: String,_lastName:String){
//    var firstName:String
//    var lastName:String
//    init {
//        this.firstName = _firstName;
//        this.lastName = _lastName;
//        println("Zainicjowanie obiektu klasy Person ${_firstName} ${_lastName}")
//    }
//}
//
//class Person(_firstName: String, _lastName: String) {
//    var firstName: String
//    var lastName: String
//
//    init {
//        this.firstName = _firstName;
//        this.lastName = _lastName;
//        println("Zainicjowanie obiektu klasy Person ${_firstName} ${_lastName}")
//    }
//}