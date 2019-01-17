package kotlin_basico

//evitando null pointer exception

fun main(args : Array<String>) {

    //erro
    //var str: String = null

    //correto usando a ?
    var str1: String? = null

    //erro
    //print(str.length)

    //correto usando a ?, retorna null
    println(str1?.length)

    //erro pois str1 é null
    //println(str1.length)

    var str2 = "Luis"
    println(str2.length)


    var size: Int = str2.length
    println(size)

    //evita o erro
    var size2: Int? = str1?.length
    println(size2)


    //forcando o null pointer exception
    str1!!.length

}