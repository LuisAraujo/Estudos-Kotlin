package kotlin_basico

fun main(args : Array<String>) {


    // de 1 a 20
    for(cont in 1..20){
        println("Contador $cont")
    }

    println()

    var myarray = arrayOf(1,2,3,4,5,6)

    for(cont in myarray){
        println("Contador $cont")
    }

}