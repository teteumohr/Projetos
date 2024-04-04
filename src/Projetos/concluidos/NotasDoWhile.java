package Projetos.concluidos;

import java.util.Scanner;

public class NotasDoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nota1, nota2;
        int contador = 1;

        do {
            System.out.print("Digite a nota 1: ");
            nota1 = input.nextDouble();

            System.out.print("Digite a note 2: ");
            nota2 = input.nextDouble();

            System.out.println("Rodada: " + contador + "\nValor: " + (nota1 + nota2)/2);
            contador++;
        } while (contador <=5);
    }
}