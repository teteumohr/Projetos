package Projetos.Pessoa;

public class Professor extends Pessoa {
    private String especialidade;
    private double salario;

    public void receberAumento(double p) {
        this.salario = salario + p;
        System.out.println("Salário com aumento é: " + this.salario);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEspecialidade: " + especialidade + "\nSalário: " + salario;
    }
}
