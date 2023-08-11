package Cliente;

public class TestaCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PessoaFisica pessoaFisica1 = new PessoaFisica("João", "Rua franco fernandes", "12345678", 11234567890L, "1234567890");
        PessoaFisica pessoaFisica2 = new PessoaFisica("Maria", "Fernando Sabattino", "98765432", 119876543210L, "98765432102");

        PessoaJuridica pessoaJuridica1 = new PessoaJuridica("Técnlogia de info. LTDA", "Av. Samuel Tavares", "15432112", 11987612345L, "1234567800010");
        PessoaJuridica pessoaJuridica2 = new PessoaJuridica("Unhas e cabelos", "Av. Francisco de Sá", "19871234", 11123498765L, "98765432000102");

        pessoaFisica1.scanner();
        System.out.println();
        pessoaFisica2.scanner();
        System.out.println();
        pessoaJuridica1.scanner();
        System.out.println();
        pessoaJuridica2.scanner();
        
	}

}
