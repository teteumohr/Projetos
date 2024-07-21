package Projetos.Pessoa;

public abstract class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    private String funcao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public void fazerAniversario() {
        this.idade++;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nIdade: " + idade + "\nSexo: " + sexo + "\nFunção: " + funcao;
    }
}
