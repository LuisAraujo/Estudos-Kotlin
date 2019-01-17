package pookotlin.modificadores_acesso

//herdado de veiculo
class Carro() : Veiculo() {

    fun testeAcessoFilho(){
        //erro
        //println("Chaci $chaci")
        println("Ano $ano, cor $cor, placa $placa")
    }

}
