package Projetos.Pessoa;

public class Aluno extends Pessoa{
    // Atributo
    private int matricula;
    private String curso;

    // Método Get e Setter
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    // Método
    public void pagarMensalidade() {
        System.out.println("Pagando mensalidade do aluno " + this.getNome());
    }
}
