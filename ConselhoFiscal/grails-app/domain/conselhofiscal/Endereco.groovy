package conselhofiscal

class Endereco {

    String logradouro
    String numero
    String bairro
    String codigoPostal
    
    static belongsTo = [cidade: Cidade]
    
    static constraints = {
        logradouro(nullable: false, blank: false, maxSize: 80)
        numero(nullable: false, blank: false, maxSize: 10)
        bairro(nullable: false, blank: false, maxSize: 40)
        codigoPostal(nullable: false, blank: false, cep: true, maxSize: 9)
    }
    
    String toString() {
        logradouro + ", " + numero
    }
}
