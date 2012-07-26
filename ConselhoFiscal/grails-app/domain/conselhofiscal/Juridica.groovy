package conselhofiscal

class Juridica extends Pessoa {

    String cnpj
    String inscricaoEstadual
    
    static constraints = {
        cnpj(nullable: false, blank: false, maxSize: 18, cnpj: true, unique: true)
        inscricaoEstadual(nullable: true, blank: false, maxSize: 15)
    }
}
