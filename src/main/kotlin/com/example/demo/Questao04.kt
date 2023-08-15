package com.example.demo

class Questao04 {
    fun cifraDeCesar (cifra: String, quantidade: Int): String{
        val seguinte: CharArray = CharArray(cifra.length)
        for (i in cifra.indices) {
           seguinte[i] = cifra[i] + quantidade
        }
        println(seguinte)

        return String(seguinte)
    }
}