package Projetos.concluidos;

import java.util.Scanner;

public class AvalieNotaSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite sua nota: ");

        int nota = input.nextInt();

        switch (nota) {
            case 10:
                System.out.println("Conceito A");
                System.out.println("Parabéns!");
                break;

            case 9:
                System.out.println("Conceito A");
                break;

            case 8:
                System.out.println("Conceito B");
                break;

            case 7:
                System.out.println("Conceito C");
                break;

            default:
                System.out.println("Reprovado");
                break;

        }
    }
}
