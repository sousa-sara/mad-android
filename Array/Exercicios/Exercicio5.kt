// Exercício de busca de elemento dentro do array

fun main() {
    // Array de string
    val names = arrayOf("Alice", "Bob", "Charlie", "David", "Emma")
    val searchName = "Charlie" // Elemento a ser buscado
    var found = false // Variável para verificar se o elemento foi encontrado

    // Loop para verificar se o elemento está presente
    for (name in names) {
        if (name == searchName) {
            found = true
            break
        }
    }

    // Verificação se o elemento foi encontrado
    if (found) {
        println("$searchName foi encontrado no array.")  
    } else {
        println("$searchName não foi encontrado no array.")
    }
}
