package pookotlin.modificadores_acesso

class Casa(){

    fun testAcesso(){
        var carro: Carro = Carro()
        //erro
        //println("Ano ${carro.ano}, chaci ${carro.chaci} ")

        println("Placa ${carro.placa}, cor: ${carro.cor}")
    }
}