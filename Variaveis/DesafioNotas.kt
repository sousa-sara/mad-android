// Média escolar: crie um programa para calculadora de média escolar considere 3 notas. Considere: nota1, nota2, nota3 e média.

fun main() {

    // Notas escolares
    val nota1 = 7.0
    val nota2 = 8.0
    val nota3 = 7.0

    // Cálculo base para a média das notas
    val media = (nota1 + nota2 + nota3) / 3

    // Formata a média para 2 casas decimais
    val mediaFormatada = String.format("%.2f", media)

    // Impressão da média
    println("A média é $mediaFormatada")
}
