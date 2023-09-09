package com.example.demo

class Cliente(val nome: String) {
      val telefones = mutableListOf<Telefone>()
      private var numeroPreferencial: Telefone? = null

      fun adicionarTelefone(telefone: Telefone) {
            telefones.add(telefone)
      }

      fun definirNumeroPreferencial(telefone: Telefone): Boolean {
            if (telefones.contains(telefone)) {
                  numeroPreferencial = telefone
                  return true
            }
            return false
      }

      fun getNumeroPreferencial(): Telefone? {
            return numeroPreferencial
      }

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
            val telefone1 = Telefone(123456789)
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