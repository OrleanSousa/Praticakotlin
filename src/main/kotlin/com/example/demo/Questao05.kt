package com.example.demo


class Questao05 {
    fun inverterString(palavra: String): String{
        val invertido: CharArray =  CharArray(palavra.length)

        var crescente = 0

        for (decrescente in invertido.size -1 downTo 0) {
            invertido[crescente++] = palavra[decrescente]

            print(invertido[decrescente])
        }

        return String(invertido)
    }


}

