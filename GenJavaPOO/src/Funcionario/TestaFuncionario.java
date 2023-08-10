package Funcionario;

public class TestaFuncionario {

    public static void main(String[] args) {
    	
    	Funcionario[] list = new Funcionario[3];
    	
        list[0] = new Funcionario("João", "Técnico em Informática", "Bradesco", "Cidade Tiradentes", "São Paulo", 14885110L, 620L);
        list[1] = new Funcionario("Gabriel", "Auxiliar Administrativo", "Banco do Brasil", "São Matheus", "São Paulo", 15452050L, 8550L);
        list[2] = new Funcionario("Vinicius", "Auxiliar de Logística", "Caixa", "Baixada Santista", "Santos", 32344320L, 8780L);
        
        for(Funcionario run : list) {
        	run.scanner();
        }
    }
}
