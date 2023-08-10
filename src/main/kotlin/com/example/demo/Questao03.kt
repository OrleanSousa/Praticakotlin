package com.example.demo

class Questao03 {

    fun numerosPrimos(numero: Int): Boolean{
        var quantidadeDeDivisores: Int = 0
        for (i in 1 .. numero){
                if(numero % i == 1){
                    quantidadeDeDivisores++;
                }
        }
        return if (quantidadeDeDivisores >= 2){
            println("Numero é primo")
            true
        }else {
            println("numero não é primo")
            false
        }
    }
}

