package Cliente;

public class PessoaJuridica extends Cliente {
	
	private String cnpj;

    public PessoaJuridica(String nome, String endereco, String cep, long telefone, String cnpj) {
        super(nome, endereco, cep, telefone);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
	
    public void validarCnpj() {
		if (getCnpj().length() != 14) {
			System.out.println("\n--CNPJ Inválido!!!");
		} else {
			System.out.println("\n--CNPJ Válido!!!");
		}
	}
    
    public String formataCnpj() {
        String cnpjFormatado = String.format("%014d", Long.parseLong(cnpj));
        return cnpjFormatado.substring(0, 2) + "." + cnpjFormatado.substring(2, 5) + "." + cnpjFormatado.substring(5, 8) + "/" + cnpjFormatado.substring(8, 12) + "-" + cnpjFormatado.substring(12);
    }
    
    public void visualizar() {
        System.out.println("Dados da Pessoa Jurídica:");
        System.out.println("Nome da empresa: " + getNome());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("CEP: " + formataCep());
        System.out.println("Telefone: " + formataTelefone());
        System.out.println("CNPJ: " + formataCnpj());
        validarCnpj();
        validarCep();
    }
}
