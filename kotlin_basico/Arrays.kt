package kotlin_basico

fun main(args: Array<String>){


    var array = arrayOf("BA", "SP", "RJ")
    println(array[1])

    //Arrays com vários tipos
    var mix = arrayOf(1, "Str", 3)


    //Array de inteiros
    var intArray = intArrayOf(1,2,3,4,5)

    //For com index do Array
    for( (index, cont) in intArray.withIndex() ){
        println("Index: $index, Valor: $cont")
    }

    println();

    //Somando Arrays
    var array01 = arrayOf("A", "B", "C")
    var array02 = arrayOf("D", "E", "F")

    var arraySoma = array01 + array02


    for( letra in arraySoma ){
        println(letra)
    }

    println()

    //srting como array
    var str = "Luis"
    for( letra in str ){
        println(letra)
    }
}