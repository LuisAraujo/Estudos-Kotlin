package pookotlin.interfaces

fun main(args: Array<String>){

    var carro: Carro = Carro("Uno", 2018, "Azul")
    var carro2: Dirigivel =  Carro("Uno", 2018, "Azul")

    println("O carro ${carro.modelo} de cor ${carro.cor} e ano ${carro.ano}")
    carro.abrirPorta()

    //erro ce acesso
    //println("O carro ${carro2.modelo} de cor ${carro2.cor} e ano ${carro2.ano}")
    //carro2.abrirPorta();

}