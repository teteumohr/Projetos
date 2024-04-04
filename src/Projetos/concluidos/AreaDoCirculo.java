package Projetos.concluidos;

import java.util.Scanner;

public class AreaDoCirculo {

    public static void main(String[] args) {

        double raio, area;

        Scanner entrada = new Scanner(System.in);
        raio = entrada.nextDouble();

        area = 3.14159 * Math.pow(raio, 2);

        System.out.printf("A=%.4f%n", area);

    }
}
