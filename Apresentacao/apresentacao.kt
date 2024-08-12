//Comentário de linha
/*Comentário em bloco */

fun main() {
    // Declaração de variável
    var idade = 22 // Idade
    var altura = 1.56f // Altura (usando o 'f' para indicar que é um float)
    var inicial = 'S' // Inicial do nome

    // Impressão das informações do indivíduo usando interpolação de strings
    println("A inicial do meu nome é $inicial, tenho $idade e minha altura é de %.2f".format(altura))
}