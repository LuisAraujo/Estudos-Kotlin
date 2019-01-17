package kotlin_intermediario.colecoes

//possui um valor associado a chave
fun main(args: Array<String>) {

    val map = hashMapOf("Chava1" to 1,"Chave2" to 2, "Chave3" to 3)

    //imutavel
    val map2 = mapOf("Chava1" to 1,"Chave2" to 2, "Chave3" to 3)

    map.put("Chave4", 4)
    //map2.put("Chave4", 4)

    println(map)

    for(chave in map.keys){
        println("Chave $chave: Valor ${map.get(chave)}")
    }

    map.remove("Chave3")
    println(map)

    println( map.contains("Chave2") )


}