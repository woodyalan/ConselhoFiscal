package conselhofiscal

class Competencia {

    Date inicio = new Date()
    Date fim
    String descricao
    
    static constraints = {
        descricao(nullable: false, blank: false, maxSize: 20)
        inicio(nullable: false, blank: false)
        fim(nullable: true, blank: false)        
    }
    
    String toString() {
        descricao
    }
}
