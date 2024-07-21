package Projetos.Pessoa;

public class Bolsista extends Aluno {
    private int bolsa;

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }

    public void RenovarBolsa() {
        System.out.println("Renovando bolsa de " + this.getNome());
    }

    @Override
    public void pagarMensalidade() {
        System.out.println(this.getNome() + " é bolsista! Pagamento realizado!");
    }
}
