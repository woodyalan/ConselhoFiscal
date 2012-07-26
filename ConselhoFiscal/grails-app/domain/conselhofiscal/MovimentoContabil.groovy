package conselhofiscal

class MovimentoContabil {

    static belongsTo = [competencia: Competencia]
    static hasMany = [conselhosFiscais: ConselhoFiscalMovimentoContabil, ocorrencias: OcorrenciaMovimentoContabil]
    
    static constraints = {
        
    }
    
    String toString() {
        competencia
    }
}
