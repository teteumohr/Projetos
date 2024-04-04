package Projetos.concluidos;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //atributos
        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();
        double pi = 3.14159;

        double base = A;
        double altura = C;
        double triangulo = base * altura /2;
        System.out.printf("TRIANGULO: %.3f%n", triangulo);

        double raio = C;
        double circulo = pi * Math.pow(raio, 2);
        System.out.printf("CIRCULO: %.3f%n", circulo);

        double bases = A + B;
        double trapezio = bases * altura /2;
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);

        double lado = B;
        double quadrado = lado * lado;
        System.out.printf("QUADRADO: %.3f%n", quadrado);

        double lados = A * B;
        double retangulo = lados;
        System.out.printf("RETANGULO: %.3f%n", retangulo);
    }
}