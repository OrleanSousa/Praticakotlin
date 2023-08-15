package com.example.demo

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Questao05Test {

    val questao = Questao05();
    @Test
    fun `QUANDO receber a palavra  DEVE retornar ela invertida`(){
        val response = questao.inverterString("orlean")
        assertEquals("naelro", response)
    }
}