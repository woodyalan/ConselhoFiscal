package conselhofiscal

class Igreja extends Juridica {

    Boolean sede = false
    
    static constraints = {
        sede(nullable: false, blank: false)
    }
    
    String toString() {
        nome + " - " + endereco.getBairro()
    }
}