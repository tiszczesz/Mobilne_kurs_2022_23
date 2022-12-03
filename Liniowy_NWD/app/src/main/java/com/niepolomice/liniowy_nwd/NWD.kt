package com.niepolomice.liniowy_nwd

class NWD
{
    fun NWDRec(a:Int,b:Int):Int{
        if(b==0) return a;
        return NWDRec(b,a%b);
    }
    fun NWDIter(a:Int,b:Int):Int{
        var temp = a;
        var _a = a;
        var _b = b;
        while (_b!=0){
            temp = _a;
            _a = _b
            _b = temp % _b
        }
        return _a
    }
}