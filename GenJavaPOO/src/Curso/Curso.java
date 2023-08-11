package Curso;
/*
 *Utilizando os conceitos de Classe, Objeto e Métodos, da Programação Orientada a 
 * Objetos, crie a Classe Curso com os seus respectivos Métodos e Atributos, que descreva
 * um Curso qualquer, de uma Plataforma EAD. Na sequência, crie uma Classe chamada
 * TestaCurso, instancie dois objetos da Classe Curso e apresente as informações destes
 * 2 Objetos no console.
 * 
 * Crie a Classe Curso e defina pelo menos 5 Atributos relevantes ao Curso EAD, a
 * sua escolha;
 * Lembre-se de escolher Atributos genéricos, que descrevam as características gerais
 * de qualquer Curso EAD;
 * Crie o Método Construtor com parâmetros, contendo todos os Atributos definidos
 * na Classe Curso nos argumentos do Método;
 * Crie os Métodos Get e Set para todos os Atributos da Classe Curso;
 * Crie o Método visualizar(), com a função de listar todos os Atributos de um Objeto da
 * Classe Curso;
 * Crie a Classe TestaCurso no mesmo pacote da Classe Curso, contendo o Método
 * main() e instancie 2 Objetos da Classe Curso;
 * Utilize o Método visualizar() para exibir os dados dos 2 Objetos Instanciados.
 * 
 * Exemplo 02
 * 
 * Utilizando os conceitos de Herança e Polimorfismo, da Programação Orientada a Objetos,
 * crie as Classes CursoLivre (Curso rápido, com patrocinador) e Especialização (Curso
 * longo, com certificado reconhecido pelo MEC) como heranças da Classe Curso (criada
 * na lista de exercícios anterior), com os seus respectivos Métodos e Atributos. Na
 * sequência, utilize a Classe TestaCurso para instanciar dois objetos da Classe
 * CursoLivre e dois objetos da Classe Especialização, e apresente as informações
 * destes 4 Objetos na tela.
 * 
 * Crie a Classe CursoLivre como uma herança da Classe Curso e defina pelo menos
 * 1 Atributo relevante ao curso do tipo CursoLivre, a sua escolha;
 * Lembre-se de escolher Atributos que descrevam características específicas e
 * exclusivas de um curso do tipo livre;
 * Crie o Método Construtor com parâmetros na Classe CursoLivre;
 * Crie os Métodos Get e Set para todos os Atributos da Classe CursoLivre;
 * Crie o Método visualizar() na Classe CursoLivre, que consiga exibir todos os dados
 * do Objeto;
 * Instancie 2 Objetos da Classe CursoLivre na Classe TestaCurso;
 * Utilize o Método visualizar() para exibir os dados dos 2 Objetos Instanciados.
 * Crie a Classe Especialização como uma herança da Classe Curso e defina pelo
 * menos 1 Atributo relevante ao curso do tipo Especialização, a sua escolha;
 * Lembre-se de escolher Atributos que descrevam características específicas e
 * exclusivas de um curso de Especialização;
 * Crie o Método Construtor com parâmetros na Classe Especialização;
 * Crie os Métodos Get e Set para todos os Atributos da Classe Especialização;
 * Crie o Método visualizar() na Classe Especialização, que consiga exibir todos os
 * dados do Objeto;
 * Instancie 2 Objetos da Classe Especialização na Classe TestaCurso;
 * Utilize o Método visualizar() para exibir os dados dos 2 Objetos Instanciados.
 * 
 */

import java.text.NumberFormat;

public class Curso {
    private String nome;
    private String area;
    private int duracaoHoras;
    private double preco;
    private boolean certificado;

    public Curso(String nome, String area, int duracaoHoras, double preco, boolean certificado) {
        this.nome = nome;
        this.area = area;
        this.duracaoHoras = duracaoHoras;
        this.preco = preco;
        this.certificado = certificado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getDuracaoHoras() {
        return duracaoHoras;
    }

    public void setDuracaoHoras(int duracaoHoras) {
        this.duracaoHoras = duracaoHoras;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isCertificado() {
        return certificado;
    }

    public void setCertificado(boolean certificado) {
        this.certificado = certificado;
    }
    
    public String formatarMoeda(double valor) {
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        nf.setMinimumFractionDigits(2);
        String formatoMoeda = nf.format(valor);
        return formatoMoeda;
    }
    
}
