// Exercicio: Soma dos Elementos

fun main() {

    // Array de inteiros
    val numbers = intArray(5,10,15,20,25) // Imutável
    val sum = 0 // Variável para armazenar a soma // mutável

    // Loop para somar os elementos do array
    for (number in numbers) {
        sum += number
    }

    // Imprima o resultado
    println("Soma dos elementos do array: $sum")
}