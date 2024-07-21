package Projetos.Pessoa;

public class ProjetoPessoas {
    public static void main(String[] args) {

        Aluno a1 = new Aluno();
        a1.setFuncao("Aluno");
        a1.setNome("Matheus");
        a1.setIdade(24);
        a1.setSexo("M");
        a1.setMatricula(1);
        a1.setCurso("Programação");
        a1.pagarMensalidade();
        System.out.println(a1.toString() + "\n");

        Bolsista b1 = new Bolsista();
        b1.setFuncao("Bolsista");
        b1.setNome("Jorge");
        b1.setIdade(22);
        b1.setSexo("M");
        b1.setMatricula(2);
        b1.setCurso("Engenharia");
        b1.setBolsa(50);
        b1.pagarMensalidade();
        b1.renovarBolsa();
        System.out.println(b1.toString() + "\n");

        Professor p1 = new Professor();
        p1.setFuncao("Professor");
        p1.setNome("Fernanda");
        p1.setIdade(35);
        p1.setSexo("F");
        p1.setSalario(2550.75);
        p1.setEspecialidade("Matemática");
        System.out.println(p1.toString());
    }
}
