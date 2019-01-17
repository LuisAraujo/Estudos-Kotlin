package pookotlin.heranca

//herdado de veiculo
class Carro( override var cor: String, override  var ano: Int, override  var modelo: String) : Veiculo(cor,ano, modelo) {

    fun abrirPorta(){
        println("Abrinado a porta do $modelo")
    }
}


