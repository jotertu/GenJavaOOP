package Ingresso;

import java.text.NumberFormat;
/*
 * Utilizando os conceitos de Classe, Objeto e Métodos, da Programação Orientada a 
 * Objetos, crie a Classe Ingresso com os seus respectivos Métodos e Atributos, que
 * descreva o ingresso de um evento qualquer. Na sequência, crie uma Classe chamada
 * TestaIngresso, instancie dois objetos da Classe Ingresso e apresente as informações
 * destes 2 Objetos no console.
 * 
 * Crie a Classe Ingresso e defina pelo menos 5 Atributos relevantes ao Ingresso de 
 * um evento, a sua escolha;
 * Lembre-se de escolher Atributos genéricos, que descrevam as características gerais
 * de qualquer evento;
 * Crie o Método Construtor com parâmetros, contendo todos os Atributos definidos
 * na Classe Ingresso nos argumentos do Método;
 * Crie a Classe TestaIngresso no mesmo pacote da Classe Ingresso, contendo o
 * Método main() e instancie 2 Objetos da Classe Ingresso;
 * Utilize o Método visualizar() para exibir os dados dos 2 Objetos Instanciados.
 * 
 * Exemplo 2
 * 
 * Utilizando os conceitos de Herança e Polimorfismo, da Programação Orientada a Objetos,
 * crie as Classes Vip e MeiaEntrada como heranças da Classe Ingresso (criada na lista
 * de exercícios anterior), com os seus respectivos Métodos e Atributos. Na sequência,
 * utilize a Classe TestaIngresso para instanciar dois objetos da Classe Vip e dois
 * objetos da Classe MeiaEntrada, e apresente as informações destes 4 Objetos na tela
 * 
 * Crie a Classe Vip como uma herança da Classe Ingresso e defina pelo menos 1
 * Atributo relevante ao ingresso do tipo VIP, a sua escolha;
 * Lembre-se de escolher Atributos que descrevam características específicas e
 * exclusivas de um ingresso VIP;
 * Crie o Método Construtor com parâmetros na Classe Vip;
 * Crie os Métodos Get e Set para todos os Atributos da Classe Vip;
 * Crie o Método visualizar() na Classe Vip, que consiga exibir todos os dados do
 * Objeto;
 * Instancie 2 Objetos da Classe Vip na Classe TestaIngresso;
 * Utilize o Método visualizar() para exibir os dados dos 2 Objetos Instanciados.
 * Crie a Classe MeiaEntrada como uma herança da Classe Ingresso e defina pelo
 * menos 1 Atributo relevante ao ingresso do tipo meia entrada, a sua escolha;
 * Lembre-se de escolher Atributos que descrevam características específicas e
 * exclusivas de um ingresso do tipo meia entrada;
 * Crie o Método Construtor com parâmetros na Classe MeiaEntrada;
 * Crie os Métodos Get e Set para todos os Atributos da Classe MeiaEntrada;
 * Crie o Método visualizar() na Classe MeiaEntrada, que consiga exibir todos os dados
 * do Objeto;
 * Instancie 2 Objetos da Classe MeiaEntrada na Classe TestaIngresso;
 * Utilize o Método visualizar() para exibir os dados dos 2 Objetos Instanciados.
 * 
 */

public class Ingresso {
    private String tipo;
    private double preco;
    private String local;
    private String data;
    private int quantidade;

    public Ingresso(String tipo, double preco, String local, String data, int quantidade) {
        this.tipo = tipo;
        this.preco = preco;
        this.local = local;
        this.data = data;
        this.quantidade = quantidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public String formatarMoeda(double valor) {
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        nf.setMinimumFractionDigits(2);
        String formatoMoeda = nf.format(valor);
        return formatoMoeda;
    }
    
}
