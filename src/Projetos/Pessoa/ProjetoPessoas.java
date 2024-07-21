package Projetos.Pessoa;

public class ProjetoPessoas {
    public static void main(String[] args) {

//        // Visitante
//        Visitante v1 = new Visitante();
//        v1.setNome("Matheus");
//        v1.setIdade(24);
//        v1.setSexo("M");
//        System.out.println(v1.toString());

        Aluno a1 = new Aluno();
        a1.setNome("Matheus");
        a1.setMatricula(1);
        a1.setCurso("Programação");
        a1.setIdade(244);
        a1.setSexo("M");
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setMatricula(2);
        b1.setNome("Jorge");
        b1.setBolsa(50);
        b1.setSexo("M");
        b1.pagarMensalidade();
    }
}
