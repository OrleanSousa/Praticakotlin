package com.example.demo

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Questao03Test{

    val questao = Questao03()

    @Test
    fun `recebe numero e retorna true se for primo`(){
        val response = questao.numerosPrimos(23)
        Assertions.assertTrue(response)
    }

    @Test
    fun `recebe numero e retorna false se for primo`(){
        val response = questao.numerosPrimos(4)
        Assertions.assertFalse(response)
    }
}