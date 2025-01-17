package com.example.test1

class baocc( val name: String)
fun main(){
    println("baocc")
    multiple(1,9)
    multiple(9,1)
    sum(9,1)
    val a = baocc("ninhnguuluat")
}
fun multiple(a: Int, b: Int): Int = a /b

fun sum(a: Int, b: Int): Double = a.toDouble() * b