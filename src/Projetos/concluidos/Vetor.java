package Projetos.concluidos;

public class Vetor {
    public static void main(String[] args) {
        int n[] = {3,2,8,7,5,4};
        System.out.println("Total de casas de N é " + n.length);
        //length é uma caracteristica do tamanho dele ( vetor )

        for (int c=0; c<=5; c++){
            System.out.println("Na posição "+ c + " temos o valor " + n[c]);
        }
    }
}
