package pookotlin.interfaces
import pookotlin.heranca.Veiculo

//herdado de veiculo
class Caminhao( override var cor: String, override  var ano: Int, override  var modelo: String, var capacidade: Long) :
    Veiculo(cor,ano, modelo), Dirigivel, Carregavel {

    override fun acelerar(velocidade: Long) {
        println("Acelerando $modelo")
    }

    override fun colocarCarga(){
        println("Carregando o $modelo")
    }

}