package kotlin_basico

fun main(args : Array<String>) {

    var n1: Int = 3

    //similar ao case do java
    when( n1 ){

        1 -> println("n1 é 1")
        2 -> println("n1 é 2")
        3 -> {
            println("n1 é 3")
            println("n1 é impar")
        }
        4 -> println("n1 é 4")

        else -> {
            println("n1 não é 1,2,3 ou 4")
        }

    }

    //colocando em uma variavel
    val result: String  = when( n1 ) {
        0, 1 -> "binario"
        else -> "erro"
    }

    println(result)


}