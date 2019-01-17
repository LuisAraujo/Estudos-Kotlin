package pookotlin.interfaces

import pookotlin.heranca.Veiculo

//herdado de veiculo
class Carro( override var cor: String, override  var ano: Int, override  var modelo: String) :
    Veiculo(cor,ano, modelo), Dirigivel {

    fun abrirPorta(){
        println("Abrinado a porta do $modelo")
    }

    override  fun acelerar(velocidade: Long){
        println("Acelerando o $modelo a $velocidade km/h")
    }
}
