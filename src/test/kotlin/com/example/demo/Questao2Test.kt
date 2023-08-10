package com.example.demo

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Questao2Test{

    private val questao = Questao2()

    @Test
    fun `retorna true se for par`(){
        val response = questao.imprimaSeForPar(6)
        Assertions.assertTrue(response)
    }

    @Test
    fun `retorna false se for impar`(){
        val response = questao.imprimaSeForPar(5)
        Assertions.assertFalse(response)
    }

    @Test
    fun `retorna true se for zero`(){
        val response = questao.imprimaSeForPar(0)
        Assertions.assertTrue(response)
    }
}