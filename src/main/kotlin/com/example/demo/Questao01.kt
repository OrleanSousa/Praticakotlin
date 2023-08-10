package com.example.demo

class Questao01 {


    fun maiorNumero(numero1: Int, numero2: Int): Int{
        return if(numero1 > numero2){
            println(numero1)
            numero1;
        }else {
            println(numero2)
            numero2;
        }
    }
}