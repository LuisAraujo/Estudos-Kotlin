package kotlin_intermediario.enumerados


fun main(args: Array<String>){

    var carro: Carro = Carro("Amarelo", 2018, "Uno")
    carro.direcao = Direcao.ESQUERDA
    carro.andar()

}