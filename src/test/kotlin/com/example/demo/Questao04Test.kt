package com.example.demo

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Questao04Test{

    val questao = Questao04()
    @Test
    fun `QUANDO receber a letra A e o valor 1 DEVE retornar B`(){
        val response = questao.cifraDeCesar("a", 1)
        assertEquals("b", response)
    }

    @Test
    fun `QUANDO receber a letra A e o valor quantidade DEVE retornar nova posicao`(){
        val response = questao.cifraDeCesar("orlean", 4)
        assertEquals("svpier", response)
    }
    @Test
    fun `QUANDO receber uma string vazia DEVE retornar vazio`(){
        val response = questao.cifraDeCesar("", 4)
        assertEquals("", response)
    }
    @Test
    fun `QUANDO receber uma string A DEVE retornar um simbolo`(){
        val response = questao.cifraDeCesar("a", -4)
        assertEquals("]", response)
    }
}