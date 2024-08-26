// Crie um programa que verifica se o usuário tem acesso ao sistema ou não 
// Vinny, "123456" "Acesso permitido" "Acesso negado"

fun main() {

    println("Digite seu nome: ")
    val nomeInput = readLine()!!

    println("Digite sua senha: ")
    val senhaInput = readLine()!!

    val nome = "Vinny"
    val senha = "123456"

    if (nomeInput == nome && senhaInput == senha) {
        println("Acesso permitido.")
    } else {
        println("Acesso negado")
    }
}