package com.niepolomice.viewbindingex1

class StringOperations {
    companion object {
        fun Reverse(text:String):String {
            return  text.reversed();
        }
        fun IsPalindrom(text:String):Boolean {
            return if(Reverse(text.toString().trim().lowercase()).equals(text.toString().trim().lowercase())){ true } else {false}
        }
    }
}