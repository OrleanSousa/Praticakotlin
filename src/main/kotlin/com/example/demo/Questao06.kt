package com.example.demo

class Questao06 {
    fun retirarLetra(palavra: String, letra: Char): String {
        var novaString = ""

        for (indice in palavra){
            if (indice != letra){
                novaString += indice.toString()
            }
        }

        return novaString
    }

}