package conselhofiscal

class Estado {

    String nome
    String sigla
    
    static constraints = {
        nome(nullable: false, blank: false, maxSize: 40)
        sigla(nullable: false, blank: false, minSize: 2, maxSize: 2)
    }
    
    String toString() {
        nome
    }
}
