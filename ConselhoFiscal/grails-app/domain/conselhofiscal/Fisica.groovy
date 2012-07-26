package conselhofiscal

class Fisica extends Pessoa {

    String cpf
    String rg
    String estadoCivil
    String nacionalidade
    
    static belongsTo = [profissao: Profissao]
    
    static constraints = {
        cpf(nullable: false, blank: false, maxSize: 14, cpf: true, unique: true)
        rg(nullable: false, blank: false, maxSize: 15)
        estadoCivil(nullable: false, blank: false, inList: ["Solteiro(a)", "Casado(a)", "Separado(a)", "Divorciado(a)", "Viúvo(a)"])
        nacionalidade(nullable: false, blank: false, maxSize: 20)
    }
}
