// Temperatura: Crie um programa que faça a conversão de temperatura. Considere que Celsius = 25.0 °C. Fahrenheit = Celsius * 9/5 + 32. Kelvin é Celsius + 273.15.

fun main() {
    println("Insira a temperatura em Celsius para a conversão: ")
    val celsius = readLine()!!.toDouble()

    println("Qual tipo de conversão você deseja? ")
    println("1 - Celsius para Fahrenheit")
    println("2 - Celsius para Kelvin")
    val escolha = readLine()!!.toInt()

    when (escolha) {
        1 -> {
            val fahrenheit = celsius * 9/5 + 32
            println("A temperatura em Fahrenheit é: $fahrenheit")
        }
        2 -> {
            val kelvin = celsius + 273.15
            println("A temperatura em Kelvin é: $kelvin")
        }
        else -> println("Escolha inválida!")
    }
}
