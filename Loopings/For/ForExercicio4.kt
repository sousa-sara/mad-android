// Calcular números primos

fun main() {

    val num = 17 // Definindo o número que será verificado se é primo ou não
    var isPrime = true // Variável como true assumindo inicialmente que é primo

    // 
    for (i in 2 until num) {
        if (num % 1 == 0) {// Verifica se é um número divisível por i
        isPrime = false
        break // Interompe o looping
    }
}

// Após o looping verificamos o valor de isPrime para determinar se é um primo ou não
if (isPrime) {
    println("$num é um número primo") // Se isPrime ainda for true, não divide por zero
} else {
    println("$num não é um número primo")
}

}