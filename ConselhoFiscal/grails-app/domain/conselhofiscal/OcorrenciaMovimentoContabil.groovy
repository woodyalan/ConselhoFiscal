package conselhofiscal

class OcorrenciaMovimentoContabil {

    MovimentoContabil movimentoContabil
    Ocorrencia ocorrencia
    String numeroDocumento
    String observacoes
    
    static belongsTo = [documento: Documento]
    
    static constraints = {
        movimentoContabil()
        ocorrencia()
        documento()                
        numeroDocumento(nullable: true, blank: false, maxSize: 12)
        observacoes(nullable: true, blank: false, maxSize: 300)
    }
}
