package Funcionario;

public class Gerente extends Funcionario {
    private double valorProducao;
    private double comissao;
    private double salarioAntigo;

    public Gerente(String nome, String cpf, String setor, double salario, double valorProducao, double comissao) {
        super(nome, cpf, setor, salario);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
        this.salarioAntigo = salario;
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public void calcularValorArtigo() {
        double valorTotal = valorProducao + (valorProducao * (comissao / 100));
        System.out.println("\nO valor total a ser recebido pelo(a) Gerente " + getNome() +" é igual a: " + formatarMoeda(valorTotal));
        System.out.println("\n******************************************");
    }

    public void scanner() {
    	System.out.println();
    	System.out.println("Informações do Gerente: ");
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + formataCpf());
        System.out.println("Setor: " + getSetor());
        System.out.println("Salário Antigo: " + formatarMoeda(salarioAntigo));
        System.out.println("Valor de Produção: " + formatarMoeda(valorProducao));
        System.out.println("Comissão (sem %) : " + comissao);
        System.out.println();
        System.out.println("******************************************");
        validarCpf();
    }

}
