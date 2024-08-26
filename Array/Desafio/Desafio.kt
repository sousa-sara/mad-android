/*
Crie um programa que explore a funcionalidade de arrays em Kotlin, realizando somas entre arrays de números pares e impares.

Inicie com os arrays pré-definidos: pares e impares conforme abaixo.

Pares 0, 2, 4, 61 impares 1, 3, 5, 7

Utilize as operações de soma para calcular as somas entre os elementos correspondentes dos arrays pares e impares.

Armazene os resultados em um novo array chamado soma.

Exiba os resultados das somas, mostrando o valor resultante para cada par de números
 */

fun main() {
    // Arrays pré-definidos
    val pares = intArrayOf(0, 2, 4, 6)
    val impares = intArrayOf(1, 3, 5, 7)
 
    // Array para armazenar as somas
    val soma = IntArray(pares.size) // Presumindo que ambos os arrays têm o mesmo tamanho

    // Loop para somar os elementos correspondentes
    for (i in pares.indices) {
        soma[i] = pares[i] + impares[i]
    }

    // Exibir os resultados das somas
    for (i in soma.indices) {
        println("A soma do par (${pares[i]}) e ímpar (${impares[i]}) é: ${soma[i]}")
    }
}
