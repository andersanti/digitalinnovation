package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente

fun main() {
    val maria = Gerente("Maria José","12345678977",5000.0)
    ImprimeRelatorioFuncionario.imprime(maria)

}