package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Anderson"
    var cpf: String = "123.123.123-44"
}

fun main() {
    val anderson = Pessoa()

    println(anderson.nome)
    println(anderson.cpf)
}