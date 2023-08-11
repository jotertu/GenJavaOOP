package Produto;

public class TestaProduto {

    public static void main(String[] args) {
        // Criando objetos da classe Jogo
        Jogo jogo1 = new Jogo("The Witcher 3", "RPG de mundo aberto", 59.99, 100, "PC", "RPG", "18+");
        Jogo jogo2 = new Jogo("FIFA 22", "Jogo de futebol", 49.99, 200, "PS5", "Esportes", "Livre");

        // Criando objetos da classe Console
        Console console1 = new Console("PlayStation 5", "Console de nova geração", 499.99, 50, "Sony", true, "Preto");
        Console console2 = new Console("Xbox Series X", "Console de alta performance", 549.99, 40, "Microsoft", false, "Branco");

        // Exibindo informações dos objetos Jogo
        jogo1.visualizar();
        jogo1.aplicarDesconto(8);

        jogo2.visualizar();

        // Exibindo informações dos objetos Console
        console1.visualizar();
        console1.aplicarDesconto(19);

        console2.visualizar();
    }
}
