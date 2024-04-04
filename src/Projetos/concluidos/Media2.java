package Projetos.concluidos;

import java.util.Scanner;

public class Media2 {

    public static void main(String[] args) {
        double A, B, C, MEDIA;
        Scanner entrada = new Scanner(System.in);

        A = entrada.nextDouble();
        B = entrada.nextDouble();
        C = entrada.nextDouble();

        MEDIA = ( A * 2 + B * 3 + C * 5 ) / 10.0;
        System.out.printf("MEDIA = %.1f%n", MEDIA);
    }
}
