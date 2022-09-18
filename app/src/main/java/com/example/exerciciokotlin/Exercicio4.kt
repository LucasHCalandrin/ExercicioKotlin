package com.example.exerciciokotlin

fun somar(i: Int, j: Int) = i + j

fun catt(i: String, j: String): String = "${i}${j}"

fun <T> xpto (item1: T, item2: T, funcao: (T, T)-> T): T{
    return funcao(item1, item2)
}

fun main() {
    println(xpto(2, 3, ::somar))
    println(xpto("Jo", "ão", ::catt))
}
