package kotlin_intermediario.excecoes

fun main(args: Array<String>){

    try{
        println("Digite um numero")
        val numero = readLine()!!.toInt()
        val divisao = 100/ numero
        println(" A divisao é $divisao")

    }catch (e: Exception){

        println("Erro ${e.message}")

    }finally {
        println("Programa Finalizado")
    }

}