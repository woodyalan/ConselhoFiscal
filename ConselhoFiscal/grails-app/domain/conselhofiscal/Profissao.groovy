package conselhofiscal

class Profissao {

    String nome
    
    static constraints = {
        nome(nullable: false, blank: false, maxSize: 80)
    }
    
    String toString() {
        nome
	}
}
