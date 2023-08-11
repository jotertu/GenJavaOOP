package Farmacia;

public class Perfumaria extends Farmacia {
    private String tipoFragrancia;
    private String duracaoFragrancia;
    private int anoLancamento;

    public Perfumaria(String nomeProduto, double preco, int quantidadeEmEstoque, String fabricante, String tipoFragrancia, String duracaoFragrancia, int anoLancamento) {
        super(nomeProduto, preco, quantidadeEmEstoque, fabricante, "Perfumaria");
        this.tipoFragrancia = tipoFragrancia;
        this.duracaoFragrancia = duracaoFragrancia;
        this.anoLancamento = anoLancamento;
    }

    public String getTipoFragrancia() {
        return tipoFragrancia;
    }

    public void setTipoFragrancia(String tipoFragrancia) {
        this.tipoFragrancia = tipoFragrancia;
    }

    public String getDuracaoFragrancia() {
        return duracaoFragrancia;
    }

    public void setDuracaoFragrancia(String duracaoFragrancia) {
        this.duracaoFragrancia = duracaoFragrancia;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
    
    public void aplicarDesconto(double percentualDesconto) {
        double desconto = getPreco() * (percentualDesconto / 100);
        setPreco(getPreco() - desconto);
        System.out.println();
        System.out.println("Desconto aplicado de " + percentualDesconto + "% no produto " + getNomeProduto());
        System.out.println("Novo preço: " + formatarMoeda(getPreco()));
        System.out.println("\n******************************************");
    }

    public void visualizar() {
        System.out.println("\nDetalhes da perfumaria:");
        System.out.println("Nome: " + getNomeProduto());
        System.out.println("Preço: " + formatarMoeda(getPreco()));
        System.out.println("Quantidade em Estoque: " + getQuantidadeEmEstoque());
        System.out.println("Fabricante: " + getFabricante());
        System.out.println("Tipo de Fragrância: " + getTipoFragrancia());
        System.out.println("Duração da Fragrância: " + getDuracaoFragrancia());
        System.out.println("Ano de Lançamento: " + getAnoLancamento());
        System.out.println("\n******************************************");
    }

}
