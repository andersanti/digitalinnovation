package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista

fun main() {
    val joao = Analista("João da Silva","98765432111",2000.0)
    ImprimeRelatorioFuncionario.imprime(joao)
}