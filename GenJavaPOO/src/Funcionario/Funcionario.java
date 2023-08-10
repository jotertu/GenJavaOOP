package Funcionario;

/*
 *Utilizando os conceitos de Classe, Objeto e Métodos, da Programação Orientada a 
 *Objetos, crie a Classe Funcionario com os seus respectivos Métodos e Atributos. Na
 *sequência, crie uma Classe chamada TestaFuncionario, instancie dois objetos da
 *Classe Funcionario e apresente as informações destes 2 Objetos no console.
 *Boas práticas:
 *
 *	Crie a Classe Funcionario e defina pelo menos 5 Atributos relevantes ao Objeto Funcionario, a sua escolha;
 *	Lembre-se de escolher Atributos genéricos, que descrevam as características gerais de qualquer Funcionario;
 *	Crie o Método Construtor com parâmetros, contendo todos os Atributos definidos na Classe Funcionario nos argumentos do Método;
 *	Crie os Métodos Get e Set para todos os Atributos da Classe Funcionario;
 *	Crie o Método visualizar(), com a função de listar todos os Atributos de um Objeto da Classe Funcionario;
 *	Crie a Classe TestaFuncionario no mesmo pacote da Classe Funcionario, contendo
 *	o Método main() e instancie 2 Objetos da Classe Funcionario;
 *	Utilize o Método visualizar() para exibir os dados dos 2 Objetos Instanciados
 *	
 */

public class Funcionario {
    String nome;
    String cargo;
    String banco;
    String cidade;
    String estado;
    long contaCorrente;
    long agencia;

    public Funcionario(String nome, String cargo, String banco, String cidade, String estado, long contaCorrente, long agencia) {
        super();
        this.nome = nome;
        this.cargo = cargo;
        this.banco = banco;
        this.cidade = cidade;
        this.estado = estado;
        this.contaCorrente = contaCorrente;
        this.agencia = agencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public long getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(long contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

    public long getAgencia() {
        return agencia;
    }

    public void setAgencia(long agencia) {
        this.agencia = agencia;
    }

    public String formataContaCorrente() {
        String contaCorrenteFormata = String.format("%08d", contaCorrente);
        return contaCorrenteFormata.substring(0, 7) + "-" + contaCorrenteFormata.substring(7);
    }

    public String formataAgencia() {
        return String.format("%04d", agencia);
    }

    public void scanner() {
        System.out.println("Nome do funcionário: " + nome + "\nCargo: " + cargo + "\nBanco: " + banco + "\nCidade: " + cidade + "\nEstado: " + estado + "\nConta Corrente: " + formataContaCorrente() + "\nAgência: " + formataAgencia());
        System.out.println();
    }
}
