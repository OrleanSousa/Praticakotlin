package com.example.demo

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Questao07Test{

    val questao = Questao07()

    @Test
    fun `QUANDO receber uma palavra DEVE retornar as vogais`(){
        val response = questao.removeConsoantes("orlean")
        assertEquals("oea", response)
    }
}