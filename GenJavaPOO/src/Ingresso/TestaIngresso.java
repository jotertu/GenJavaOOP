package Ingresso;

public class TestaIngresso {

    public static void main(String[] args) {
        Vip vip1 = new Vip("VIP", 100.0, "Estádio A", "2023-08-15", 2, "Assento confortável", true, true);
        Vip vip2 = new Vip("VIP", 150.0, "Estádio B", "2023-08-16", 3, "Bebidas e comidas grátis", false, false);

        MeiaEntrada meia1 = new MeiaEntrada("Meia Entrada", 50.0, "Teatro C", "2023-08-17", 1, "Estudante", 100.0, true);
        MeiaEntrada meia2 = new MeiaEntrada("Meia Entrada", 70.0, "Teatro D", "2023-08-18", 4, "Idoso", 120.0, false);

        // Aplicando descontos
        meia1.aplicarDesconto(20.0);
        meia2.aplicarDesconto(25.0);
        
        vip1.visualizar();
        vip1.mostrarBeneficios();
        vip1.mostrarAcessoLounge();
        vip1.mostrarEstacionamentoVIP();

        vip2.visualizar();
        vip2.mostrarBeneficios();
        vip2.mostrarAcessoLounge();
        vip2.mostrarEstacionamentoVIP();

        meia1.definirValorMeiaEntrada(40.0); // Definindo valor da meia entrada
        meia1.visualizar(); // Exibindo informações atualizadas

        meia2.definirValorMeiaEntrada(60.0); // Definindo valor da meia entrada
        meia2.visualizar(); // Exibindo informações atualizadas
       
    }
}
