// Criar uma função que calcule a soma dos quadrados de dois números. Utilize somaDosQuadrados e 'a' e 'b' como variáveis. Calcule a soma dos quadrados de 'a' e 'b' e retorne o resultado.  Imprime uma mensagem com os valores de 'numero1', 'numero2' e 'resultado'.

fun somaDosQuadrados(a: Int, b: Int) : Int {

    // Calcula o quadrado de 'a' e armazena o resultado na variável 'quadradoA'
    val quadradoA = a * a
    
    // //Calcula o quadrado de 'b' e armazena o resultado na variável 'quadradoB'
    val quadradoB = b * b

    // Calcula a soma dos quadrados
    val resultado = quadradoA + quadradoB
    
    // Retorna o resultado
    return resultado
}

fun main() {
    
    val numero1 = 7
    val numero2 = 8
    
    // Calcula a soma dos quadrados
    val resultado = somaDosQuadrados(numero1, numero2)
    
    // Imprime a mensagem com os valores
    println("A soma dos quadrados de $numero1 e $numero2 é $resultado")

}