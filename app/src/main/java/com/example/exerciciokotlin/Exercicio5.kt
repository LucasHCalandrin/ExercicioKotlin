package com.example.exerciciokotlin

// Funções de alta ordem
fun processaInteiro(i: Int, f: (Int) -> Int): Int{
    return f(i)
}
fun processaInteiros(i: Int, j: Int, f: (Int, Int) -> Int): Int{
    return f(i, j)
}
// Funções
fun somaa(i: Int, j: Int): Int{
    return i + j
}
fun multiplica(i: Int, j: Int): Int{
    return i * j
}
fun raizQuadrada(numero: Int): Int {
    for (n in 1..numero) {
        if (n * n == numero)
            return n
    }
    return -1
}
fun main() {
    // 1. Chamadas do primeiro passo

    println(processaInteiros(2, 2, ::somaa))
    println(processaInteiros(2, 3, ::multiplica))
    println(processaInteiro(4, ::raizQuadrada))

    // 2. Chamadas do segundo passo

    println(processaInteiros(2, 2) {x: Int, y: Int -> x + y})
    println(processaInteiros(2, 3) {x: Int, y: Int -> x * y})
    println(processaInteiro(4) {x: Int -> Math.sqrt(x.toDouble()).toInt()})
}