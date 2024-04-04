package Projetos.concluidos;

import java.util.Scanner;

public class ProdutoSimples {

    public static void main(String[] args) {

        int A, B, PROD;

        Scanner entrada = new Scanner(System.in);

        A = entrada.nextInt();
        B = entrada.nextInt();
        PROD = A * B;

        System.out.println("PROD = " + PROD );

    }
}
