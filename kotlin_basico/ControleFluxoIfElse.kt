package kotlin_basico

fun main(args : Array<String>) {

    var n1 = 10

    if(n1 < 10){
        println("N1 é menor que 10")
    }else if( n1 > 10){
        println("N1 é maior que 10")
    }else{
        println("N1 é  10")
    }

    //colocando retorno de ifs nas variaveis (idem a ternário)
    var str = if(n1==10) "ok" else "erro"

    var str2 = if(n1==10){
        println("passou")
        //ultima linha é o retorno
        "ok2"
    } else{
        println("passou 2")
        //ultima linha é o retorno
        "erro2"
    }


    println(str + "\n" + str2)
}