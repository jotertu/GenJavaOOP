package Cliente;

public class TestaCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente1 = new Cliente ("João", "Cidade Tiradentes", "59620490", 27008555075L, 352036461L);
		Cliente cliente2 = new Cliente ("João", "Cidade Tiradentes", "08485280", 27008555075L, 352036461L);
        cliente1.scanner();
        cliente2.scanner();
	}

}
