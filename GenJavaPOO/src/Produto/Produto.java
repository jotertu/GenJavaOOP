package Produto;
/**
 * Utilizando os conceitos de Classe, Objeto e Métodos, da Programação Orientada a 
 * Objetos, crie a Classe Produto com os seus respectivos Métodos e Atributos, que 
 * descreva os produtos de uma Loja de Games. Na sequência, crie uma Classe chamada 
 * TestaGame, instancie dois objetos da Classe Produto e apresente as informações
 * destes 2 Objetos no console.
 * 
 * Crie a Classe Produto e defina pelo menos 5 Atributos relevantes aos Produtos de
 * uma Loja de Games, a sua escolha;
 * Lembre-se de escolher Atributos genéricos, que descrevam as características gerais 
 * de qualquer produto da Loja de Games;
 * Crie o Método Construtor com parâmetros, contendo todos os Atributos definidos
 * na Classe Produto nos argumentos do Método;
 * Crie os Métodos Get e Set para todos os Atributos da Classe Produto;
 * Crie o Método visualizar(), com a função de listar todos os Atributos de um Objeto da
 * Classe Produto;
 * Crie a Classe TestaGame no mesmo pacote da Classe Game, contendo o Método
 * main() e instancie 2 Objetos da Classe Produto;
 * Utilize o Método visualizar() para exibir os dados dos 2 Objetos Instanciados.
 * 
 * Exercicio 02
 * 
 * Crie a Classe Jogo como uma herança da Classe Game e defina pelo menos 1
 * Atributo relevante a um jogo qualquer, a sua escolha;
 * Lembre-se de escolher Atributos que descrevem características específicas e
 * exclusivas de um Jogo;
 * Crie o Método Construtor com parâmetros na Classe Jogo;
 * Crie os Métodos Get e Set para todos os Atributos da Classe Jogo;
 * Crie o Método visualizar() na Classe Jogo, que consiga exibir todos os dados do
 * Objeto;
 * Instancie 2 Objetos da Classe Jogo na Classe TestaGame;
 * Utilize o Método visualizar() para exibir os dados dos 2 Objetos Instanciados.
 * Crie a Classe Console como uma herança da Classe Game e defina pelo menos 1
 * Atributo relevante a um console qualquer, a sua escolha;
 * Lembre-se de escolher Atributos que descrevem características específicas e
 * exclusivas de um console;
 * Crie o Método Construtor com parâmetros na Classe Console;
 * Crie os Métodos Get e Set para todos os Atributos da Classe Console;
 * Crie o Método visualizar() na Classe Console, que consiga exibir todos os dados do Objeto;
 * Instancie 2 Objetos da Classe Vendedor na Classe TestaGame;
 * Utilize o Método visualizar() para exibir os dados dos 2 Objetos Instanciados.
 * 
 */

import java.text.NumberFormat;

public class Produto {
    private String nome;
    private String descricao;
    private double preco;
    private int quantidadeEmEstoque;
    private String plataforma;

    public Produto(String nome, String descricao, double preco, int quantidadeEmEstoque, String plataforma) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.plataforma = plataforma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
    
    public String formatarMoeda(double valor) {
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        nf.setMinimumFractionDigits(2);
        String formatoMoeda = nf.format(valor);
        return formatoMoeda;
    }
    
}
