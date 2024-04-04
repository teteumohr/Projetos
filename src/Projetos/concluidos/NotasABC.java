package Projetos.concluidos;

import java.util.Scanner;

public class NotasABC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //variavel
        System.out.print("Digite sua nota: ");
        int nota = input.nextInt();

        //metodos
        if (nota>=90) {
            System.out.println("Conceito A");
        } else if (nota>=80) {
            System.out.println("Conceito B");
        } else if (nota>=70) {
            System.out.println("Conceito C");
        } else {
            if (nota >= 40 && nota < 70) {
                System.out.print("Digitar nota Rec: ");
                int rec = input.nextInt(); //metodo
                int fim = (nota + rec) / 2; //metodo

                if (fim >= 70) {
                    System.out.println("Aprovado Rec");
                } else {
                    System.out.println("Reprovado Rec!");
                }
            } else {
                System.out.println("Reprovado!");
            }
        }
    }
}
