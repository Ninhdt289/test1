package com.example.test1

class baocc(val name: String)
fun main(){
    println("nguyen khac hang con cho an cut")
    val a = baocc("khac hoang ngu")
    multiple(1,1)
    sum(9,10)
}

fun multiple(a: Int, b: Int): Int = a /b
fun sum(a:Int,b : Int):Int = a+b