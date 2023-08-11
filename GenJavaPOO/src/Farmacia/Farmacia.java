package Farmacia;

import java.text.NumberFormat;
/*
 * Utilizando os conceitos de Classe, Objeto e Métodos, da Programação Orientada a 
 * Objetos, crie a Classe Farmacia com os seus respectivos Métodos e Atributos, que
 * descreva os produtos de uma Farmácia. Na sequência, crie uma Classe chamada
 * TestaFarmacia, instancie dois objetos da Classe Farmacia e apresente as informações
 * destes 2 Objetos no console.
 * 
 * Crie a Classe Farmacia e defina pelo menos 5 Atributos relevantes aos Produtos de
 * uma Farmacia, a sua escolha;
 * Lembre-se de escolher Atributos genéricos, que descrevam as características gerais
 * de qualquer produto da Farmácia;
 * Crie o Método Construtor com parâmetros, contendo todos os Atributos definidos
 * na Classe Farmacia nos argumentos do Método;
 * Crie os Métodos Get e Set para todos os Atributos da Classe Farmacia;
 * Crie o Método visualizar(), com a função de listar todos os Atributos de um Objeto da
 * Classe Farmacia;
 * Crie a Classe TestaFarmacia no mesmo pacote da Classe Farmacia, contendo o
 * Método main() e instancie 2 Objetos da Classe Farmacia;
 * Utilize o Método visualizar() para exibir os dados dos 2 Objetos Instanciados.
 * 
 * Exercicio 02
 * 
 * Utilizando os conceitos de Herança e Polimorfismo, da Programação Orientada a Objetos,
 * crie as Classes Medicamento e Perfumaria como heranças da Classe Farmacia (criada
 * na lista de exercícios anterior), com os seus respectivos Métodos e Atributos. Na
 * sequência, utilize a Classe TestaFarmacia para instanciar dois objetos da Classe 
 * Medicamento e dois objetos da Classe Perfumaria, e apresente as informações deste
 * 4 Objetos na tela.
 * 
 * Crie a Classe Medicamento como uma herança da Classe Farmacia e defina pelo
 * menos 1 Atributo relevante aos produtos da categoria Medicamento, a sua escolha;
 * Lembre-se de escolher Atributos que descrevam características específicas e
 * exclusivas de um produto da categoria medicamento;
 * Crie o Método Construtor com parâmetros na Classe Medicamento;
 * Crie os Métodos Get e Set para todos os Atributos da Classe Medicamento;
 * Crie o Método visualizar() na Classe Medicamento, que consiga exibir todos os
 * dados do Objeto;
 * Instancie 2 Objetos da Classe Medicamento na Classe TestaFarmacia;
 * Utilize o Método visualizar() para exibir os dados dos 2 Objetos Instanciados.
 * Crie a Classe Perfumaria como uma herança da Classe Farmacia e defina pelo
 * menos 1 Atributo relevante aos produtos da categoria perfumaria, a sua escolha;
 * Lembre-se de escolher Atributos que descrevam características específicas e
 * exclusivas de um produto da categoria perfumaria;
 * Crie o Método Construtor com parâmetros na Classe Perfumaria;
 * Crie os Métodos Get e Set para todos os Atributos da Classe Perfumaria;
 * Crie o Método visualizar() na Classe Perfumaria, que consiga exibir todos os dados
 * do Objeto;
 * Instancie 2 Objetos da Classe Perfumaria na Classe TestaFarmacia;
 * Utilize o Método visualizar() para exibir os dados dos 2 Objetos Instanciados.
 * 
 */

public class Farmacia {
    
	private String nomeProduto;
    private double preco;
    private int quantidadeEmEstoque;
    private String fabricante;
    private String categoria;

    public Farmacia(String nomeProduto, double preco, int quantidadeEmEstoque, String fabricante, String categoria) {
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.fabricante = fabricante;
        this.categoria = categoria;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
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

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public String formatarMoeda(double valor) {
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        nf.setMinimumFractionDigits(2);
        String formatoMoeda = nf.format(valor);
        return formatoMoeda;
    }

}

