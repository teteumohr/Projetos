package Projetos.concluidos;

import java.util.Scanner;

public class CalculoSimples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //atributos(variáveis)
        int peca1, pecas1, peca2, pecas2;
        double valor1, valor2;

        //métodos
        peca1 = input.nextInt();
        pecas1 = input.nextInt();
        valor1 = input.nextDouble();
        double pecasTotal1 = pecas1 * valor1;

        peca2 = input.nextInt();
        pecas2 = input.nextInt();
        valor2 = input.nextDouble();
        double  pecasTotal2 = pecas2 * valor2;

        double quantidadeFinal = pecasTotal1 + pecasTotal2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", quantidadeFinal );
    }
}

