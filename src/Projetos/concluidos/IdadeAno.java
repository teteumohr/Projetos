package Projetos.concluidos;

import java.util.Scanner;

public class IdadeAno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Em que ano você nasceu: ");
        int Nascimento = input.nextInt();

        int idade = 2024 - Nascimento;
        System.out.println("Sua idade é: " + idade);

        if ( Nascimento >= 18 ) {
            System.out.println("Maior de idade!");
        }
        else {
            System.out.println("Menor de idade!");
        }
    }
}
