package conselhofiscal

class MovimentoObraPiedade {

    static belongsTo = [competencia: Competencia]
    static hasMany = [conselhosFiscais: ConselhoFiscalMovimentoObraPiedade, ocorrencias: OcorrenciaMovimentoObraPiedade]
    
    static constraints = {
    }
}
