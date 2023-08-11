package Funcionario;

public class Vendedor extends Funcionario {

    private double valorProducao;
    private double comissao;
    private double descontoSalario;

    public Vendedor(String nome, String cpf, String setor, double salario, double valorProducao, double comissao, double descontoSalario) {
        super(nome, cpf, setor, salario);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
        this.descontoSalario = descontoSalario;
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

    public double getDescontoSalario() {
        return descontoSalario;
    }

    public void setDescontoSalario(double descontoSalario) {
        this.descontoSalario = descontoSalario;
    }

    public void calcularValorComDesconto() {
        double salarioTotal = (getSalario() + valorProducao + comissao) - descontoSalario;
        setSalario(salarioTotal);
        System.out.println("\nO valor total a ser recebido pelo(a) vendedor " + getNome() +" é igual a: " + formatarMoeda(salarioTotal));
        System.out.println("\n******************************************");
    }


    public void visualizar() {
        System.out.println("Dados do Vendedor:");
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + formataCpf());
        System.out.println("Setor: " + getSetor());
        System.out.println("Salário: " + formatarMoeda(getSalario()));
        System.out.println("Valor de Produção: " + formatarMoeda(valorProducao));
        System.out.println("Comissão: " + formatarMoeda(comissao));
        System.out.println("Desconto de Salário: " + formatarMoeda(descontoSalario));
        System.out.println();
        System.out.println("******************************************");
        validarCpf();
    }
}
