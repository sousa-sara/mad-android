fun main() {

    // Entrada que informa ao usuário que digite um número
    println("Digite um número para verificar se é primo:")

    val input = readLine() // Captura a entrada do usuário como uma string
    val num = input?.toIntOrNull() // Tenta converter a entrada para um número inteiro

    if (num == null || num <= 1) {
        println("Por favor, insira um número inteiro maior que 1.")
        return
    }

    var isPrime = true // Variável que assume inicialmente que o número é primo

    for (i in 2 until num) {
        if (num % i == 0) { // Verifica se o número é divisível por i
            isPrime = false
            break // Interrompe o loop
        }
    }

    // Após o loop, verificamos o valor de isPrime para determinar se é primo ou não
    if (isPrime) {
        println("$num é um número primo.")
    } else {
        println("$num não é um número primo.")
    }
}
