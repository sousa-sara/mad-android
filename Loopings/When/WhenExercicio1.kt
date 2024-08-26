// Exercício de avaliação de notas

fun main() {

    // Definindo a nota do aluno Claudio
    val nota = 85

    // Usando o when para avaliar o conceito de notas
    val conceito = when(nota) {

        in 0..49 -> "F" 
        in 0..59 -> "D" 
        in 0..69 -> "C" 
        in 0..79 -> "B" 
        in 0..100 -> "A"
        else -> "Nota inválida"

    }

    // Exibindo o conceito de nota
    println("A nota foi: $conceito")
}
