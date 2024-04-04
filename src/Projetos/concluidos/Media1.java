package Projetos.concluidos;

import java.util.Scanner;

public class Media1 {

    public static void main(String[] args) {

        double notaA, notaB, MEDIA;
        Scanner entrada = new Scanner(System.in);

        notaA = entrada.nextDouble();
        notaB = entrada.nextDouble();

        MEDIA = (notaA * 3.5 + notaB * 7.5) / 11;

        System.out.printf("MEDIA = %.5f%n", MEDIA);

    }
}