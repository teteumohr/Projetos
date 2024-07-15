package Projetos.Banco;

public class Conta {
    public static void main(String[] args) {

        // Contas
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1);
        p1.setDono("Matheus");
        p1.abrirConta("ContaCorrente");

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2);
        p2.abrirConta("ContaPoupança");
        p2.setDono("Isabel");

        // Depositos
        p1.depositar(100);
        p2.depositar(500);

        // Saques
        p1.sacar(50);
        p2.sacar(650);

        p1.fecharConta();
        p2.fecharConta();

        // Estado Atual
        p1.estadoAtual();
        p2.estadoAtual();
    }
}
