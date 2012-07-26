package conselhofiscal

class OcorrenciaMovimentoObraPiedade {

    MovimentoObraPiedade movimentoObraPiedade
    Ocorrencia ocorrencia
    String numeroEnvelope
    String numeroDocumento
    String observacoes
    
    static belongsTo = [documento: Documento]
    
    static constraints = {
        movimentoObraPiedade()
        ocorrencia()
        documento()                
        numeroEnvelope(nullable: true, blank: false, maxSize: 12)
        numeroDocumento(nullable: true, blank: false, maxSize: 12)
        observacoes(nullable: true, blank: false, maxSize: 300)
    }
}
