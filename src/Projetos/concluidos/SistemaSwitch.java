package Projetos.concluidos;

import java.util.Scanner;

public class SistemaSwitch {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Quantas pernas?");

        int pernas = teclado.nextInt();
        String tipo;

        System.out.print("Isso é um(a) ");

        switch (pernas) {
            case 1:
                tipo = "Saci";
                break;

            case 2:
                tipo = "Bípede";
                break;

            case 3:
                tipo = "Tripé";
                break;

            case 4:
                tipo = "Quadrúpede";
                break;

            case 6, 8:
                tipo = "Aranha";
                break;

            default:
                tipo = "ET";
        }

        System.out.print(tipo);
    }
}
