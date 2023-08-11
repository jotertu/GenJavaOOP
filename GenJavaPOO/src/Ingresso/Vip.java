package Ingresso;

public class Vip extends Ingresso {
    private String beneficios;
    private boolean acessoLounge;
    private boolean estacionamentoVIP;

    public Vip(String tipo, double preco, String local, String data, int quantidade,
               String beneficios, boolean acessoLounge, boolean estacionamentoVIP) {
        super(tipo, preco, local, data, quantidade);
        this.beneficios = beneficios;
        this.acessoLounge = acessoLounge;
        this.estacionamentoVIP = estacionamentoVIP;
    }

    public String getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }

    public boolean isAcessoLounge() {
        return acessoLounge;
    }

    public void setAcessoLounge(boolean acessoLounge) {
        this.acessoLounge = acessoLounge;
    }

    public boolean isEstacionamentoVIP() {
        return estacionamentoVIP;
    }

    public void setEstacionamentoVIP(boolean estacionamentoVIP) {
        this.estacionamentoVIP = estacionamentoVIP;
    }

    public void mostrarBeneficios() {
        System.out.println("\nBenefícios do ingresso VIP: " + beneficios);
    }

    public void mostrarAcessoLounge() {
        System.out.println("\nAcesso ao lounge VIP: " + (acessoLounge ? "Sim" : "Não"));
    }

    public void mostrarEstacionamentoVIP() {
        System.out.println("\nEstacionamento VIP: " + (estacionamentoVIP ? "Sim" : "Não"));
        System.out.println("\n******************************************");
    }
    
    public void visualizar() {
        System.out.println("Detalhes do ingresso VIP:");
        System.out.println("Tipo: " + getTipo());
        System.out.println("Preço: " + formatarMoeda(getPreco()));
        System.out.println("Local: " + getLocal());
        System.out.println("Data: " + getData());
        System.out.println("Quantidade: " + getQuantidade());
        System.out.println("Benefícios: " + getBeneficios());
        System.out.println("Acesso ao lounge: " + (isAcessoLounge() ? "Sim" : "Não"));
        System.out.println("Estacionamento VIP: " + (isEstacionamentoVIP() ? "Sim" : "Não"));
        System.out.println("\n******************************************");
    }
   
}

