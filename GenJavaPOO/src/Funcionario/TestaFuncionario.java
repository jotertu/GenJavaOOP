package Funcionario;

public class TestaFuncionario {

    public static void main(String[] args) {
    	
    	Gerente gerente1 = new Gerente("Maria", "98765432109", "Gerência", 4500.00, 15000.00, 10.0);
    	Gerente gerente2 = new Gerente("Joao", "112345678910", "Gerência", 4500.00, 13000.00, 17.0);
    	
    	Vendedor vendedor1 = new Vendedor("Pedro", "22233344455", "Vendas", 3000.00, 6000, 5.0, 500.00);
    	Vendedor vendedor2 = new Vendedor("Ana", "133344455566", "Vendas", 3000.00, 3200, 5.0, 900.00);
    	
    	gerente1.visualizar();
    	gerente1.calcularValorArtigo();

    	gerente2.visualizar();
    	gerente2.calcularValorArtigo();
    	
    	
    	vendedor1.visualizar();
    	vendedor1.calcularValorComDesconto();
    	
    	vendedor2.visualizar();
    	vendedor2.calcularValorComDesconto();
    }
}
