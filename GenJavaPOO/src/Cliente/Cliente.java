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
 */

public class Cliente {
    private String nome;
    private String endereco;
    private String cep;
    private long cpf;
    private long rg;

    public Cliente(String nome, String endereco, String cep, long cpf, long rg) {
        this.nome = nome;
        this.endereco = endereco;
        this.cep = cep;
        this.cpf = cpf;
        this.rg = rg;
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

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public long getRg() {
        return rg;
    }

    public void setRg(long rg) {
        this.rg = rg;
    }

    public String formataCep() {
        String parte1 = cep.substring(0, 5);
        String parte2 = cep.substring(5);

        return parte1 + "-" + parte2;
    }

    public String formataCpf() {
        String cpfFormatado = String.format("%011d", cpf);
        return cpfFormatado.substring(0, 3) + "." + cpfFormatado.substring(3, 6) + "." + cpfFormatado.substring(6, 9) + "-" + cpfFormatado.substring(9);
    }

    public String formataRg() {
        String rgFormatado = String.format("%09d", rg);
        return rgFormatado.substring(0, 2) + "." + rgFormatado.substring(2, 5) + "." + rgFormatado.substring(5, 8) + "-" + rgFormatado.substring(8);
    }

    public void scanner() {
        System.out.println("Nome do usuário: " + nome + "\nEndereço: " + endereco + "\nCEP: " + formataCep() + "\nCPF: " + formataCpf() + "\nRG: " + formataRg());
        System.out.println();
    }
}
