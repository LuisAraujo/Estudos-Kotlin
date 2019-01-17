package pookotlin.classes_atributos_contrutores

//construtor
class Carro2(cor: String, ano: Int, modelo: String) {

    var cor: String
    var ano: Int
    var modelo: String

    init{
        this.cor = cor
        this.ano = ano
        this.modelo = modelo
    }
}

/*
fun main(args: Array<String>){

    //instaciando um objeto
    var uno = Carro2("Azul", 2018,"Uno")

    print("Carro " + uno.modelo)
    print(" Cor ${uno.cor} ano ${uno.ano} ")

}*/