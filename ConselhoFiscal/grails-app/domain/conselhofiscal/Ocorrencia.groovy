package conselhofiscal

class Ocorrencia {

    String nome

    static hasMany = [ocorrenciasMovimentoContabil: OcorrenciaMovimentoContabil, ocorrenciasMovimentoObraPiedade: OcorrenciaMovimentoObraPiedade]
    
    static constraints = {
        nome(nullable: false, blank: false, maxSize: 50)
    }
    
    String toString() {
        nome
    }
}
