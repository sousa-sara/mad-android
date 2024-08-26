// Perfil do Usuário: Crie um programa simples que simule o armazenamento e exibição de informações de um perfil de usuário. Declare  variáveis para armazenar informações de um perfil de usuário, como nome, idade, email e se o usuário está ativo ou inativo. Atribua valores às variáveis de acordo com os dados que você escolher. Utilize println() para exibir as informações do perfil do usuário no console.

fun main() {

    println("Digite o seu nome: ")
    val nome = readLine()!!

    println("Digite a sua idade: ")
    val idade = readLine()!!.toInt()

    print("Digite o seu email: ")
    val email = readLine()!!

    print("O usuário está ativo? (true/false): ")
    val usuarioAtivo = readLine()!!.toBoolean()

    /*val nome = "Sara"
    val idade = 22
    val email = "sousaradev@gmail.com"
    val usuarioAtivo = "Ativo"*/

    println("\nInformação do Perfil de Usuário:")
    println("\nNome: $nome")
    println("Idade: $idade anos")
    println("Email: $email")
    println("Status: $usuarioAtivo")

}