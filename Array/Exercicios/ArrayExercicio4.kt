// Maior e menor elemento
// Lembrar que quando armazena uma variável se deve dar um clear

fun main() {
    // Array de inteiros
    val numbers = intArrayOf(8, 3, 12, 6, 20)
    var min = numbers[0] // Variável para armazenar o menor elementos
    var max = numbers[0]

    // Loop para encontrar o menor e o maior elemento
    for (number in numbers) {
        if (number < min) {
            min = number
        }
        if (number > max) {
            max = number
        }

    }

        println("O menor elemento é $min")
        println("O maior elemento é $max")
    }