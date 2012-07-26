package conselhofiscal

class Pessoa {

    String nome
    
    static belongsTo = [endereco: Endereco]
    
    static constraints = {
        nome(nullable: false, blank: false, maxSize: 60)
        endereco()
    }
}
