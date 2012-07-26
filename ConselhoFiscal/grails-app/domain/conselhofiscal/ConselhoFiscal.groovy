package conselhofiscal

class ConselhoFiscal extends Fisica {

    Boolean suplente = false
    Date inicioPosse = new Date()
    Date fimPosse
    
    static hasMany = [conselhosFiscaisMovimentoContabil: ConselhoFiscalMovimentoContabil, conselhosFiscaisMovimentoObraPiedade: ConselhoFiscalMovimentoObraPiedade]

    static constraints = {
        suplente(nullable: false, blank: false)
        inicioPosse(nullable: false, blank: false)
        fimPosse(nullable: true, blank: false)
    }
    
    String toString() {
        nome
    }
}
