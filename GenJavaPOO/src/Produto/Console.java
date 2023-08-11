package Produto;

public class Console extends Produto {
    private boolean edicaoLimitada;
    private String cor;

    public Console(String nome, String descricao, double preco, int quantidadeEmEstoque, String plataforma, boolean edicaoLimitada, String cor) {
        super(nome, descricao, preco, quantidadeEmEstoque, plataforma);
        this.edicaoLimitada = edicaoLimitada;
        this.cor = cor;
    }

    public boolean isEdicaoLimitada() {
        return edicaoLimitada;
    }

    public void setEdicaoLimitada(boolean edicaoLimitada) {
        this.edicaoLimitada = edicaoLimitada;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void aplicarDesconto(double percentualDesconto) {
        double desconto = getPreco() * (percentualDesconto / 100);
        setPreco(getPreco() - desconto);
        System.out.println();
        System.out.println("Desconto aplicado de " + percentualDesconto + "% no console " + getNome());
        System.out.println("Novo preço: " + formatarMoeda(getPreco()));
        System.out.println("\n******************************************");
    }

    public void visualizar() {
        System.out.println("\nDados do console:");
        System.out.println("Nome: " + getNome());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Preço do console: " + formatarMoeda(getPreco()));
        System.out.println("Quantia em estoque: " + getQuantidadeEmEstoque());
        System.out.println("Plataforma: " + getPlataforma());
        System.out.println("Edição Limitada: " + (isEdicaoLimitada() ? "Sim" : "Não"));
        System.out.println("Cor do console: " + getCor());
        System.out.println("\n******************************************");
    }
}
