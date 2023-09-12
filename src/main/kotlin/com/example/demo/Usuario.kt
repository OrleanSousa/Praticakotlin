package com.example.demo

class Cliente(val nome: String) {
    // cria a lista de telefones
      val telefones = mutableListOf<Telefone>()
    //garante que pode ser vazio ou nulo
      private var numeroPreferencial: Telefone? = null

    // função para adicionar o telefone
      fun adicionarTelefone(telefone: Telefone) {
            telefones.add(telefone)
      }

    // define numero preferencial a cliente
      fun definirNumeroPreferencial(telefone: Telefone): Boolean {
            if (telefones.contains(telefone)) {
                  numeroPreferencial = telefone
                  return true
            }else return false

      }

    // adiciona o numero preferencial
      fun getNumeroPreferencial(): Telefone? {
            return numeroPreferencial
      }

    //sobrescreve para imprimir todos os numeros de telfone caso aja algum, e caso não indica nenhum
      override fun toString(): String {
            val sb = StringBuilder()
            sb.append("Nome do Cliente: $nome\n")
            sb.append("Telefones do Cliente:\n")
            for (telefone in telefones) {
                  sb.append("${telefone.numero}\n")
            }
            sb.append("Número Preferencial: ${numeroPreferencial?.numero ?: "Nenhum"}")
            return sb.toString()
      }



}

class Telefone(val numero: Int)

fun main() {
            val cliente1 = Cliente("João")
            val telefone1 = Telefone(123456478)
            val telefone2 = Telefone(987654321)
            val telefone3 = Telefone(784582154)
            cliente1.adicionarTelefone(telefone1)
            cliente1.adicionarTelefone(telefone2)
            cliente1.adicionarTelefone(telefone3)

            if (cliente1.definirNumeroPreferencial(telefone1)) {
                  println("Número preferencial definido com sucesso: ${cliente1.getNumeroPreferencial()?.numero}")
            } else {
                  println("Erro ao definir número preferencial.")
            }

      println(cliente1)

}