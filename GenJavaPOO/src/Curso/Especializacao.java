package Curso;


//Classe Especializacao
public class Especializacao extends Curso {
 private String reconhecimentoMEC;
 private String coordenador;
 private int cargaHorariaEAD;

 public Especializacao(String nome, String area, int duracaoHoras, double preco, boolean certificado, String reconhecimentoMEC, String coordenador, int cargaHorariaEAD) {
     super(nome, area, duracaoHoras, preco, certificado);
     this.reconhecimentoMEC = reconhecimentoMEC;
     this.coordenador = coordenador;
     this.cargaHorariaEAD = cargaHorariaEAD;
 }

 public String getReconhecimentoMEC() {
     return reconhecimentoMEC;
 }

 public void setReconhecimentoMEC(String reconhecimentoMEC) {
     this.reconhecimentoMEC = reconhecimentoMEC;
 }

 public String getCoordenador() {
     return coordenador;
 }

 public void setCoordenador(String coordenador) {
     this.coordenador = coordenador;
 }

 public int getCargaHorariaEAD() {
     return cargaHorariaEAD;
 }

 public void setCargaHorariaEAD(int cargaHorariaEAD) {
     this.cargaHorariaEAD = cargaHorariaEAD;
 }

 public void visualizar() {
	    System.out.println("Dados da Especialização:");
	    System.out.println("Nome: " + getNome());
	    System.out.println("Área: " + getArea());
	    System.out.println("Duração em Horas: " + getDuracaoHoras());
	    System.out.println("Preço: " + formatarMoeda(getPreco()));
	    System.out.println("Certificado: " + (isCertificado() ? "Sim" : "Não"));
	    System.out.println("Reconhecimento MEC: " + reconhecimentoMEC);
	    System.out.println("Coordenador: " + coordenador);
	    System.out.println("Carga Horária EAD: " + cargaHorariaEAD);
	    System.out.println();
	    System.out.println("******************************************");
	}

 
}
