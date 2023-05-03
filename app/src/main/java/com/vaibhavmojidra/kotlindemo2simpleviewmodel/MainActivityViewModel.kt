package com.vaibhavmojidra.kotlindemo2simpleviewmodel

import androidx.lifecycle.ViewModel

class MainActivityViewModel:ViewModel() {
    private var number:Int=0
    fun getNumber()=number
    fun setNumber(num:Int){
        number=num
    }
}