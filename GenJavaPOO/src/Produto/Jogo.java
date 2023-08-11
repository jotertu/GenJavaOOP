package Produto;

public class Jogo extends Produto {
    private String genero;
    private String classificacaoIndicativa;

    public Jogo(String nome, String descricao, double preco, int quantidadeEmEstoque, String plataforma, String genero, String classificacaoIndicativa) {
        super(nome, descricao, preco, quantidadeEmEstoque, plataforma);
        this.genero = genero;
        this.classificacaoIndicativa = classificacaoIndicativa;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getClassificacaoIndicativa() {
        return classificacaoIndicativa;
    }

    public void setClassificacaoIndicativa(String classificacaoIndicativa) {
        this.classificacaoIndicativa = classificacaoIndicativa;
    }

    public void aplicarDesconto(double percentualDesconto) {
        double desconto = getPreco() * (percentualDesconto / 100);
        setPreco(getPreco() - desconto);
        System.out.println();
        System.out.println("Desconto aplicado de " + percentualDesconto + "% no jogo " + getNome());
        System.out.println("Novo preço: " + formatarMoeda(getPreco()));
        System.out.println("\n******************************************");
    }

    public void visualizar() {
        System.out.println("\nDetalhes do jogo:");
        System.out.println("Nome: " + getNome());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Preço do game: " + formatarMoeda(getPreco()));
        System.out.println("Quantia em estoque: " + getQuantidadeEmEstoque());
        System.out.println("Plataforma: " + getPlataforma());
        System.out.println("Gênero: " + getGenero());
        System.out.println("Classificação Indicativa: " + getClassificacaoIndicativa());
        System.out.println("\n******************************************");
    }
}
