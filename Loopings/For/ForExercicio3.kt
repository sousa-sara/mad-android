// Calcular números naturais

fun main() {

    val numeros = 10
    var soma = 0

    // Utilizando o looping for para calcular a soma dos primeiros N numeros naturais
    for (i in 1..numeros) {
        soma += i
    }

    println("A soma dos primeiros $numeros numeros naturais é: $soma")

}