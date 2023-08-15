package com.example.demo

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Questao06Test{

    val questao = Questao06();
    @Test
    fun `QUANDO receber a palavra  DEVE retirar a letra`(){
        val response = questao.retirarLetra("orlean", 'o')
        assertEquals("rlean", response)
    }
}