package com.paulcode.hello

fun main(args: Array<String>) {

    println("Hello Paul !" + args.joinToString())

    val num1 = 100
    val num2 = 300
    val sum: Int = num1 + num2

    println("Sum is: $sum")
}
