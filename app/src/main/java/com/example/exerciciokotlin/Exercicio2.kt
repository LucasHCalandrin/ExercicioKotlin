package com.example.exerciciokotlin

fun main() {

    val familiaMap: MutableMap<String, String> = mutableMapOf(Pair("Pai", "Pedro"),
        Pair("Mãe", "Marcela"),
        Pair("Filho", "João"),
        Pair("Caçula", "Cadu"),
        Pair("Pet", "Paçoca"))

    familiaMap.keys.forEach { println("$it : ${familiaMap.get(it)}") }
}