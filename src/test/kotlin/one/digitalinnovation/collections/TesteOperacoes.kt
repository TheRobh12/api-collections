package one.digitalinnovation.collections

fun main() {

    val salarios = doubleArrayOf(1000.0, 2250.0, 4080.0)

    for (salario in salarios) {
        println(salario)
    }

    println("----------------------")
    println("Maior Salário:  ${salarios.maxOrNull()}")
    println("Menor Salário:  ${salarios.minOrNull()}")
    println("MÉDIA Salarial:  ${salarios.average()}")

    val salariosMaiorQue2500  = salarios.filter { it > 2500.0 }
    println("----------------------")
    salariosMaiorQue2500.forEach{println(it)}
}