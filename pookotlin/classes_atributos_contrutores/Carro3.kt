package pookotlin.classes_atributos_contrutores

//construtor
class Carro3(var cor: String, var ano: Int, var modelo: String) {

}


fun main(args: Array<String>){

    //instaciando um objeto
    var uno = Carro2("Prata", 2018, "Uno")

    print("Carro " + uno.modelo)
    print(" Cor ${uno.cor} ano ${uno.ano} ")

}