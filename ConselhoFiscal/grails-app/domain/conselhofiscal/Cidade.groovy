package conselhofiscal

class Cidade {

    String nome
    
    static belongsTo = [estado: Estado]
    
    static constraints = {
        nome(nullable: false, blank: false, maxSize: 50)
    }
    
    String toString() {
        nome + " - " + estado.getSigla()
    }
}
