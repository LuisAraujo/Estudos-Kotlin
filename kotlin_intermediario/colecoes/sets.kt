package kotlin_intermediario.colecoes

//nao permite valores duplicados
fun main(args: Array<String>) {

    val strings = hashSetOf("a", "b", "c", "d")
    strings.add("e")

    //não ira adicionar
    strings.add("a")
    println(strings)

    strings.remove("b")
    println(strings)
}