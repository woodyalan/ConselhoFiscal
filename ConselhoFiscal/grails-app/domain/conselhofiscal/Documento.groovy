package conselhofiscal

class Documento {

    String nome
    
    static constraints = {
        nome(nullable: false, blank: false, maxSize: 50)
    }
    
    String toString() {
        nome
    }
}
