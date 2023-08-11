package Farmacia;

public class TestaFarmacia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Medicamento medicamento1 = new Medicamento("Aspirina", 5.0, 100, "PharmaCorp", "Ácido Acetilsalicílico", "500mg", "Para dor de cabeça");
        Medicamento medicamento2 = new Medicamento("Paracetamol", 3.0, 150, "HealthMeds", "Paracetamol", "750mg", "Para febre");

        Perfumaria perfume1 = new Perfumaria("Perfume Especial", 50.0, 10, "Fabricante XYZ", "Floral", "Longa Duração", 2023);
        Perfumaria perfume2 = new Perfumaria("Perfume Casual", 30.0, 20, "FragranceCo", "Cítrico", "Média Duração", 2022);
        
        medicamento1.visualizar();
        medicamento1.aplicarDesconto(10);
        
        medicamento2.visualizar();
        medicamento2.aplicarDesconto(20);
        
        perfume1.visualizar();
        perfume1.aplicarDesconto(15);
        
        perfume2.visualizar();
        perfume2.aplicarDesconto(55);
	}

}
