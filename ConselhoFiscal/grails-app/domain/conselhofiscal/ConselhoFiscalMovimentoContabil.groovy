package conselhofiscal

class ConselhoFiscalMovimentoContabil {

    ConselhoFiscal conselhoFiscal
    MovimentoContabil movimentoContabil
    
    static constraints = {
        conselhoFiscal()
        movimentoContabil()
    }
}
