package com.example.demo

class Questao07 {

    fun removeConsoantes(nome: String): String {
        val vogais: CharArray = charArrayOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
        var novaString = ""

        for (letra in nome) {
            if (letra in vogais) {
                novaString += letra
            }
        }
        return novaString

        }
}