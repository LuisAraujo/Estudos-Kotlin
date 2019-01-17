package kotlin_basico

fun main (args: Array<String>){
    olaMundo()
    olaFulano("Luis")
    println(dobrar(10))
    println(mutiplicar(10, 10))
}

//funcoes void
fun olaMundo(){
    println("Olá Mundo")
}

//funcoes void com parametro
fun olaFulano(nome: String){
    println("Olá "+nome)
}


//funçoes com retorn e parametro
fun dobrar(x: Int): Int{
    return x*2
}


fun mutiplicar(x: Int, y: Int): Int{
    return x*y
}