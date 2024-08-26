fun main() {
    // Criando uma lista mutável de números inteiros vazios
    val numeros = mutableListOf<Int>()

    // Adicionando elementos na lista
    numeros.add(1)
    numeros.add(2)
    numeros.add(3)

    // Exibindo a lista de números
    println("Lista de números: $numeros")

    // Removendo um elemento da lista
    numeros.removeAt(2)

    // Exibindo a lista após da remoção
    println("Lista de números após a remoção: $numeros")
}