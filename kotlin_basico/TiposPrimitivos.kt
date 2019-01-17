package kotlin_basico

fun main(args : Array<String>){

    //declarando variavel como tipo
    var str: String = "Luis"

    //sem tipo
    var str2 = " "

    //constante
    val str3: String = "Gustavo"

    //erro
    //str3 = "  Gustavo"

    var ch = 'a'

    //print
    println(str + str2 + str3)

    //inteiro
    var n1 = 10
    var n2 = 12

    //double
    var n3 = 10.1
    var n4: Double = 11.1

    //float
    var n5 = 10.1f
    var n6 : Float = 10.1f

    //long
    var n7 = 10000L
    var n8: Long = 10000

    //binario
    var n9 : Byte = 0b0000011

    var bol: Boolean = true

    println(""+n1+" "+n2+" "+n3+" "+n4+" "+n5+" "+n6+" "+n7+" "+n8+" "+n9);
    println(ch)
    println(bol)


}