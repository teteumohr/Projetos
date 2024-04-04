package Projetos.concluidos;

import java.util.Scanner;

public class Salario {

    public static void main(String[] args) {
        int A, B;
        double C, SOMA;

        Scanner entrada = new Scanner(System.in);

        A = entrada.nextInt();
        B = entrada.nextInt();
        C = entrada.nextDouble();
        System.out.println("NUMBER = " + A);

        SOMA = B * C;
        System.out.printf("SALARY = U$ %.2f%n", SOMA);
    }
}