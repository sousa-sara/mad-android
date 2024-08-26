// Exercício Detran
// Criar um programa que verifica se o usuário possui ou não carteira de habilitação.

fun main() {
    val idade = 25
    val possuiCarteiraDeMotorista = true // O usuário possui CNH

    // Verificar se a pessoa é maior de idade e se possui CNH
    if (idade >= 18 && possuiCarteiraDeMotorista) { // && é E
        println("Você pode dirigir legalmente.")
    } else {
        println("Você não poderia dirigir legalmente.")
    }

    val temIngresso = false
    val estaComCamisaDoTime = true

    // Verifica se a pessoa tem ingresso ou está com a camisa do time 
    if (temIngresso || estaComCamisaDoTime) { // || é OU
    println("Você pode entrar no estádio")
    } else {
        println("Você não pode entrar no estádio")
    }
}