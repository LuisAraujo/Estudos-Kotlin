package pookotlin.dataclasse

fun main(args: Array<String>){

    var carro: Carro = Carro("Uno", 2018, "Azul")
    var carro2: Carro = Carro("Uno", 2018, "Azul")

    var datacarro: DataCarro = DataCarro("Uno", 2018, "Azul")
    var datacarro2: DataCarro = DataCarro("Uno", 2018, "Azul")
    var datacarro3: DataCarro = DataCarro("Uno", 2017, "Azul")

    //diferenca entre classe e dataclasse
    println(carro)

    //já vem com tostring implementado
    println(datacarro)

    var (cor, ano, modelo) = datacarro
    println("Cor: $cor, ano: $ano, modelo: $modelo")


    println("carro e carro 2 são igula "+ carro.equals(carro2))

    //ja vem como o metodo equals implementado, segundo os dados do objeto
    println("datacarro e datacarro2 são igula "+ datacarro.equals(datacarro2))
    println("datacarro e datacarro2 são igula "+ datacarro.equals(datacarro3))

}