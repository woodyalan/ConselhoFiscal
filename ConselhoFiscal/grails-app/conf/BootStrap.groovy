import conselhofiscal.Igreja
import conselhofiscal.Ocorrencia
import conselhofiscal.Pessoa;
import conselhofiscal.Profissao
import conselhofiscal.Estado
import conselhofiscal.Cidade
import conselhofiscal.Endereco
import conselhofiscal.ConselhoFiscal
import conselhofiscal.Competencia
import conselhofiscal.Documento

class BootStrap {

    def init = { servletContext ->
		new Competencia(descricao: "01/2012").save()
		new Competencia(descricao: "02/2012").save()
		
		new Documento(nome: "Nota Fiscal").save()
		new Documento(nome: "Livro de Coletas").save()
		
		new Ocorrencia(nome: "Ausência de Assinatura(s)").save()
		new Ocorrencia(nome: "Ausência de Justificativa").save()
		new Ocorrencia(nome: "Ausência de Quitação").save()
		
		def p = new Profissao(nome: "Analista de Sistemas").save()
		def e = new Estado(nome: "Paraná", sigla: "PR").save()
		def c = new Cidade(nome: "Campo Mourão", estado: e).save()
		def en = new Endereco(logradouro: "Avenida Perimetral Tancredo Neves", numero: "732", bairro: "Centro", codigoPostal: "87302-000", cidade: c).save()
		
		def con = new ConselhoFiscal()
		con.nome = "Alan Ferreira dos Santos"
		con.cpf = "069.760.569-80"
		con.estadoCivil = "Solteiro(a)"
		con.nacionalidade = "Brasileiro"
		con.rg = "10210514-1"
		con.profissao = p
		con.endereco = en
		con.save()
		
		en = new Endereco(logradouro: "Rua Devete de Paula Xavier", numero: "642", bairro: "Centro", codigoPostal: "87302-000", cidade: c).save()
		
		def i = new Igreja()
		i.nome = "Congregação Cristã no Brasil"
		i.cnpj = "00.000.000/0000-00"
		i.sede = true
		i.endereco = en
		i.save()
    }
    def destroy = {
    }
}
