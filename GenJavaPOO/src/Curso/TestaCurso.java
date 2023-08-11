package Curso;

public class TestaCurso {

    public static void main(String[] args) {
        // Criando objetos da classe Especializacao
        Especializacao especializacao1 = new Especializacao("Especialização em Tecnologia", "Tecnologia", 360, 2000.0,
                true, "Reconhecido pelo MEC", "João Silva", 100);

        Especializacao especializacao2 = new Especializacao("Especialização em Saúde", "Saúde", 240, 1500.0,
                true, "Reconhecido pelo MEC", "Maria Santos", 80);

        // Criando objetos da classe CursoLivre
        CursoLivre cursoLivre1 = new CursoLivre("Programação Básica", "Tecnologia", 40, 250.0,
                "Empresa X", "Plataforma Online", true);

        CursoLivre cursoLivre2 = new CursoLivre("Marketing Digital", "Negócios", 30, 180.0,
                "Empresa Y", "Plataforma Online", true);

        // Exibindo informações dos objetos Especializacao
        especializacao1.visualizar();
        especializacao2.visualizar();
        
        cursoLivre1.visualizar();
        cursoLivre2.visualizar();
    }
}

