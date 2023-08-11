package Cliente;

/*
 * Utilizando os conceitos de Classe, Objeto e Métodos, da Programação Orientada a
 * Objetos, crie a Classe Cliente com os seus respectivos Métodos e Atributos. Na
 * sequência, crie uma Classe chamada TestaCliente, instancie dois objetos da Classe
 * Cliente e apresente as informações destes 2 Objetos no console.
 * 
 * 
 * Crie a Classe Cliente e defina pelo menos 5 Atributos relevantes ao Objeto Cliente, a sua escolha;
 * Lembre-se de escolher Atributos genéricos, que descrevam as características gerais
 * de qualquer Cliente;
 * Crie o Método Construtor com parâmetros, contendo todos os Atributos definidos
 * na Classe Cliente nos argumentos do Método;
 * Crie os Métodos Get e Set para todos os Atributos da Classe Cliente;
 * Crie o Método visualizar(), com a função de listar todos os Atributos de um Objeto da
 * Classe Cliente;
 * Crie a Classe TestaCliente no mesmo pacote da Classe Cliente, contendo o Método 
 * main() e instancie 2 Objetos da Classe Cliente;
 * Utilize o Método visualizar() para exibir os dados dos 2 Objetos Instanciados.
 * 
 * Exercicio 02
 * 
 * Crie a Classe PessoaFisica como uma herança da Classe Cliente e defina pelo
 * menos 1 Atributo relevante, a pessoa física, a sua escolha;
 * Lembre-se de escolher Atributos que descrevem características específicas e
 * exclusivas de uma pessoa física;
 * Crie o Método Construtor com parâmetros na Classe PessoaFisica;
 * Crie os Métodos Get e Set para todos os Atributos da Classe PessoaFisica;
 * Crie o Método visualizar() na Classe PessoaFisica, que consiga exibir todos os
 * dados do Objeto;
 * Instancie 2 Objetos da Classe PessoaFisica na Classe TestaCliente;
 * Utilize o Método visualizar() para exibir os dados dos 2 Objetos Instanciados.
 * Crie a Classe PessoaJuridica como uma herança da Classe Cliente e defina pelo
 * menos 1 Atributo relevante, a pessoa jurídica, a sua escolha;
 * Lembre-se de escolher Atributos que descrevam características específicas e
 * exclusivas de uma pessoa jurídica;
 * Crie o Método Construtor com parâmetros na Classe PessoaJuridica;
 * Crie os Métodos Get e Set para todos os Atributos da Classe PessoaJuridica;
 * Crie o Método visualizar() na Classe PessoaJuridica, que consiga exibir todos os
 * dados do Objeto;
 * Instancie 2 Objetos da Classe PessoaJuridica na Classe TestaCliente;
 * Utilize o Método visualizar() para exibir os dados dos 2 Objetos Instanciados.
 * 
 */


public class Cliente {
    private String nome;
    private String endereco;
    private String cep;
    private long telefone;
    
    public Cliente(String nome, String endereco, String cep, long telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.cep = cep;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }
    
    public void validarCep() {
		if (getCep().length() != 8) {
			System.out.println("\n--CEP Inválido!!!");
		} else {
			System.out.println("\n--CEP Válido!!!");
		}
	}

    public String formataCep() {
        String parte1 = cep.substring(0, 5);
        String parte2 = cep.substring(5);

        return parte1 + "-" + parte2;
    }
    
    
    public String formataTelefone() {
        String telefoneStr = String.valueOf(telefone);
        String parte1 = telefoneStr.substring(0, 2);
        String parte2 = telefoneStr.substring(2, 7);
        String parte3 = telefoneStr.substring(7, 11);
        
        return parte1 + "-" + parte2 + "-" + parte3;
    }

    public void scanner() {
    	
    }
}