package kotlin_intermediario.enumerados

class Carro(var cor: String, var ano: Int, var modelo: String) {

    var direcao: Direcao = Direcao.FRENTE

    fun andar(){

        if(direcao == Direcao.FRENTE)
            print("Andando para Frente")
        else if(direcao == Direcao.DIRETA)
            print("Andando para Direita")
        else if(direcao == Direcao.ESQUERDA)
            print("Andando para Esquerda")
        else if(direcao == Direcao.TRAS)
            print("Andando de Ré")
    }
}
