package Projetos.concluidos;

import java.util.Scanner;

public class Esfera {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //atributos
        double pi = 3.14159;
        double raio = input.nextDouble();
        double volume = (4.0/3.0) * pi * Math.pow(raio, 3);

        System.out.printf("VOLUME = %.3f%n", volume);
    }
}