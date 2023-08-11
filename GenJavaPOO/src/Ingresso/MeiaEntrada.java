package Ingresso;

public class MeiaEntrada extends Ingresso {
    private String documento;
    private double valorOriginal;
    private boolean estudante;

    public MeiaEntrada(String tipo, double preco, String local, String data, int quantidade,
                       String documento, double valorOriginal, boolean estudante) {
        super(tipo, preco, local, data, quantidade);
        this.documento = documento;
        this.valorOriginal = valorOriginal;
        this.estudante = estudante;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public double getValorOriginal() {
        return valorOriginal;
    }

    public void setValorOriginal(double valorOriginal) {
        this.valorOriginal = valorOriginal;
    }

    public boolean isEstudante() {
        return estudante;
    }

    public void setEstudante(boolean estudante) {
        this.estudante = estudante;
    }

    public void definirValorMeiaEntrada(double valorMeia) {
        if (valorMeia < valorOriginal) {
            setPreco(valorMeia);
        } else {
            System.out.println("O valor da meia entrada deve ser menor que o valor original.");
        }
    }

    public void aplicarDesconto(double percentualDesconto) {
        double desconto = getPreco() * (percentualDesconto / 100);
        setPreco(getPreco() - desconto);
        
    }
    
    
    public void visualizar() {
        System.out.println();
        System.out.println("Informações da Meia Entrada:");
        System.out.println("Tipo: " + getTipo());
        System.out.println("Preço: " + formatarMoeda(getPreco()));
        System.out.println("Local: " + getLocal());
        System.out.println("Data: " + getData());
        System.out.println("Quantidade: " + getQuantidade());
        System.out.println("Documento de meia entrada: " + getDocumento());
        System.out.println("Valor original: " + formatarMoeda(getValorOriginal()));
        System.out.println("Estudante: " + (isEstudante() ? "Sim" : "Não"));
        System.out.println("\n******************************************");
    }
}
