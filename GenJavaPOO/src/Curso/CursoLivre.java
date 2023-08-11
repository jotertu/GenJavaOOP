package Curso;

public class CursoLivre extends Curso {
    
	private String patrocinador;
    private String plataforma;
    private boolean certificadoDigital;

    public CursoLivre(String nome, String area, int duracaoHoras, double preco, String patrocinador,
                      String plataforma, boolean certificadoDigital) {
        super(nome, area, duracaoHoras, preco, certificadoDigital);
        this.patrocinador = patrocinador;
        this.plataforma = plataforma;
        this.certificadoDigital = certificadoDigital;
    }

    public String getPatrocinador() {
        return patrocinador;
    }

    public void setPatrocinador(String patrocinador) {
        this.patrocinador = patrocinador;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public boolean isCertificadoDigital() {
        return certificadoDigital;
    }

    public void setCertificadoDigital(boolean certificadoDigital) {
        this.certificadoDigital = certificadoDigital;
    }

    public void visualizar() {
        System.out.println();
        System.out.println("Detalhes do Curso Livre:");
        System.out.println("Nome: " + getNome());
        System.out.println("Área: " + getArea());
        System.out.println("Duração em Horas: " + getDuracaoHoras());
        System.out.println("Preço: " + formatarMoeda(getPreco()));
        System.out.println("Certificado Digital: " + (isCertificadoDigital() ? "Sim" : "Não"));
        System.out.println("Patrocinador: " + patrocinador);
        System.out.println("Plataforma: " + plataforma);
        System.out.println();
        System.out.println("******************************************");
    }

    
}

