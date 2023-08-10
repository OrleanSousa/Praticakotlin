package com.example.demo

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Questao01Test{

    private val questao = Questao01()

    @Test
    fun `recebendo dois numeros deve retornar o maior`(){
        val response = questao.maiorNumero(5,2)
        Assertions.assertEquals(5, response)
    }

}