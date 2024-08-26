// ==Entrada de Dados==

// Desafio Prático - Calculadora de Média Escolar

fun main() {
    println("Digite a nota da primeira avaliação: ")
    val nota1 = readLine()!!.toDouble()

    println("Digite a nota da segunda avaliação: ")
    val nota2 = readLine()!!.toDouble()

    println("Digite a nota da terceira avaliação: ")
    val nota3 = readLine()!!.toDouble()

// Calculando a média escolar
val media = (nota1 + nota2 + nota3) / 3

// Formatando média escolar
val mediaFormatada = String.format("%.2f", media)

// Impressão da média
println("A média é de: $mediaFormatada")

// Para buildar no terminal: java -jar DesafioNotasInput.jar
}