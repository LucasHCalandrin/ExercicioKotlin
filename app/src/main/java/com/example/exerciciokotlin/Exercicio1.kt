package com.example.exerciciokotlin

fun main() {
    val listaCursos: MutableList<String> = mutableListOf(
        "Sistemas para Dispositivos Móveis",
        "Análise e Desevolvimento de Sistemas")

    listaCursos.add("Técnico em Informática para Internet")
    listaCursos.add("Manutenção de Aeronaves")
    listaCursos.add("Técnico em Células")
    listaCursos.add("Processos Gerenciais")

    val listaSistemas: MutableList<String> = mutableListOf()

    for(item in listaCursos) {
        if(item.contains("Sistemas")){
            listaSistemas.add(item)
        }
    }

    for(i in 0..listaSistemas.size - 1 ){
        println("${i} - ${listaSistemas[i]}")
    }
}