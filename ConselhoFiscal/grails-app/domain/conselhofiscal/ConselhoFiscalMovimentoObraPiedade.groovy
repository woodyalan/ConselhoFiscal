package conselhofiscal

class ConselhoFiscalMovimentoObraPiedade {

    ConselhoFiscal conselhoFiscal
    MovimentoObraPiedade movimentoObraPiedade
    
    static constraints = {
        conselhoFiscal()
        movimentoObraPiedade()
    }
}
