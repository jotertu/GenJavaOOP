package Funcionario;

import java.text.NumberFormat;
/*
 *Utilizando os conceitos de Classe, Objeto e Métodos, da Programação Orientada a 
 *Objetos, crie a Classe Funcionario com os seus respectivos Métodos e Atributos. Na
 *sequência, crie uma Classe chamada TestaFuncionario, instancie dois objetos da
 *Classe Funcionario e apresente as informações destes 2 Objetos no console.
 *Boas práticas:
 *
 *Crie a Classe Funcionario e defina pelo menos 5 Atributos relevantes ao Objeto Funcionario, a sua escolha;
 *Lembre-se de escolher Atributos genéricos, que descrevam as características gerais de qualquer Funcionario;
 *Crie o Método Construtor com parâmetros, contendo todos os Atributos definidos na Classe Funcionario nos argumentos do Método;
 *Crie os Métodos Get e Set para todos os Atributos da Classe Funcionario;
 *Crie o Método visualizar(), com a função de listar todos os Atributos de um Objeto da Classe Funcionario;
 *Crie a Classe TestaFuncionario no mesmo pacote da Classe Funcionario, contendo
 *o Método main() e instancie 2 Objetos da Classe Funcionario;
 *Utilize o Método visualizar() para exibir os dados dos 2 Objetos Instanciados
 *	
 *	exercicio 02
 *
 *Crie a Classe Gerente como uma herança da Classe Funcionario e defina pelo
 *menos 1 Atributo relevante ao Gerente, a sua escolha;
 *Lembre-se de escolher Atributos que descrevam características específicas e
 *exclusivas de um Gerente;
 *Crie o Método Construtor com parâmetros na Classe Gerente;
 *Crie os Métodos Get e Set para todos os Atributos da Classe Gerente;
 *Crie o Método visualizar() na Classe Gerente, que consiga exibir todos os dados do 
 *Objeto;
 *Instancie 2 Objetos da Classe Gerente na Classe TestaFuncionario;
 *Utilize o Método visualizar() para exibir os dados dos 2 Objetos Instanciados.
 *Crie a Classe Vendedor como uma herança da Classe Funcionario e defina pelo
 *menos 1 Atributo relevante ao vendedor, a sua escolha;
 *Lembre-se de escolher Atributos que descrevam características específicas e
 *exclusivas de um vendedor;
 *Crie o Método Construtor com parâmetros na Classe Vendedor;
 *Crie os Métodos Get e Set para todos os Atributos da Classe Vendedor;
 *Crie o Método visualizar() na Classe Vendedor, que consiga exibir todos os dados do Objeto;
 *Instancie 2 Objetos da Classe Vendedor na Classe TestaFuncionario;
 *Utilize o Método visualizar() para exibir os dados dos 2 Objetos Instanciados.
 *
 */

public class Funcionario {
    private String nome;
    private String cpf;
    private String setor;
    private double salario;

    public Funcionario(String nome, String cpf, String setor, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.setor = setor;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String formatarMoeda(double valor) {
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        nf.setMinimumFractionDigits(2);
        String formatoMoeda = nf.format(valor);
        return formatoMoeda;
    }
    
    public void validarCpf() {
		if (getCpf().length() != 11) {
			System.out.println("\n--CPF Inválido!!!");
		} else {
			System.out.println("\n--CPF Válido!!!");
		}
	}
    
    public String formataCpf() {
        String cpfFormatado = String.format("%011d", Long.parseLong(cpf));
        return cpfFormatado.substring(0, 3) + "." + cpfFormatado.substring(3, 6) + "." + cpfFormatado.substring(6, 9) + "-" + cpfFormatado.substring(9);
    }
    
	 public void scanner() {
	    	
	}
}
