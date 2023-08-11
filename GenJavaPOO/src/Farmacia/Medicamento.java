package Farmacia;

public class Medicamento extends Farmacia {
    private String principioAtivo;
    private String dosagem;
    private String indicacao;

    public Medicamento(String nomeProduto, double preco, int quantidadeEmEstoque, String fabricante, String principioAtivo, String dosagem, String indicacao) {
        super(nomeProduto, preco, quantidadeEmEstoque, fabricante, "Medicamento");
        this.principioAtivo = principioAtivo;
        this.dosagem = dosagem;
        this.indicacao = indicacao;
    }

    public String getPrincipioAtivo() {
        return principioAtivo;
    }

    public void setPrincipioAtivo(String principioAtivo) {
        this.principioAtivo = principioAtivo;
    }

    public String getDosagem() {
        return dosagem;
    }

    public void definirDosagem(String dosagem) {
        this.dosagem = dosagem;
    }

    public String getIndicacao() {
        return indicacao;
    }

    public void definirIndicacao(String indicacao) {
        this.indicacao = indicacao;
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
    	System.out.println("\nDetalhes do medicamento:");
        System.out.println("Nome: " + getNomeProduto());
        System.out.println("Preço: " + formatarMoeda(getPreco()));
        System.out.println("Quantidade em Estoque: " + getQuantidadeEmEstoque());
        System.out.println("Fabricante: " + getFabricante());
        System.out.println("Princípio Ativo: " + getPrincipioAtivo());
        System.out.println("Dosagem: " + getDosagem());
        System.out.println("Indicação: " + getIndicacao());
        System.out.println("\n******************************************");
       
    }
}



