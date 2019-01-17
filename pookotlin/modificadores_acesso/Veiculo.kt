package pookotlin.modificadores_acesso

//classe que pode ser estendida (open)
open class Veiculo() {

    //não compartilhado
    private var chaci: Int = 0
    //compartilhado com os filhos
    protected var ano: Int = 0
    //compartilhado com o módulo (pacote)
    internal var cor: String = ""
    //compartilhado com todos
    var placa: String = ""

    fun testAcessoPai(){
        println("Chaci $chaci, ano $ano, cor $cor, placa $placa")
    }
}