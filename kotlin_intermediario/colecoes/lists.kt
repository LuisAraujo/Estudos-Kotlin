package kotlin_intermediario.colecoes

//pode ser mutavel ou nao
fun main(args: Array<String>){

    //imutavel
    val item = listOf("SP", "RJ", "SC")
    val item2 = arrayListOf(1,2,3,4)

    var item3 = ArrayList<String>(10)
    item3.add("Luis")
    item3.add("Luisa")
    item3.add("Maria")
    println(item3)

    item3.remove("Luisa")
    println(item3)
    println("Tamanho da lista "+item3.size)
    println("A Lista está vazia? " + item3.isEmpty())
    println("Existe o elemento Luis na lista? " + item3.contains("Luis"))


    //mutalvel
    val m_item = mutableListOf("SP", "RJ", "SC")


}