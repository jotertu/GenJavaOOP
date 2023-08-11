package Cliente;

public class PessoaFisica extends Cliente {

    private String cpf;

    public PessoaFisica(String nome, String endereco, String cep, long telefone, String cpf) {
        super(nome, endereco, cep, telefone);
        this.cpf = cpf;       
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void validarCpf() {
		if (getCpf().length() != 11) {
			System.out.println("\n--CPF Inválido!!!");
		} else {
			System.out.println("\n--CPF Válido!!!");
		}
	}
    
    public String formataCpf() {
        String cpfFormatado = String.format("%011d", Long.parseLong(cpf));
        return cpfFormatado.substring(0, 3) + "." + cpfFormatado.substring(3, 6) + "." + cpfFormatado.substring(6, 9) + "-" + cpfFormatado.substring(9);
    }
    
    public void visualizar() {
        System.out.println("Dados da Pessoa Física:");
        System.out.println("Nome: " + getNome());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("CEP: " + formataCep());
        System.out.println("Telefone: " + formataTelefone()); // Formatação do telefone
        System.out.println("CPF: " + formataCpf());
        validarCpf();
        validarCep();
        
    }
    
}
