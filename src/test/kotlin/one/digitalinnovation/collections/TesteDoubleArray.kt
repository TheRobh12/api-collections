package one.digitalinnovation.collections

fun  main() {
    val salarios = DoubleArray(5)

    salarios[0] = 1000.0
    salarios[1] = 2500.0
    salarios[2] = 3000.0
    salarios[3] = 7000.0
    salarios[4] = 8803.0

    salarios.forEach { println(it) }
    println("-----------------------")
    salarios.forEachIndexed() { index, salario ->
        salarios[index] = salario + 1.1
    }

    salarios.forEach { println(it) }

    println("-----------------------")
    val salarios2 = doubleArrayOf(1500.0, 1250.4,5000.0,857.69,1466.0)
    salarios2.sort()
    salarios2.forEach { println(it) }

    println("-----------------------")
    println(salarios.count { it in 2000.0..5000.0 })

    println("-----------------------")
    println(salarios.find { it == 2250.0})
    println(salarios.find { it == 500.0})

    println("-----------------------")
    println(salarios.any { it == 1000.0})
}