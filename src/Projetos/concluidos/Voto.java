package Projetos.concluidos;

import java.util.Scanner;

public class Voto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int Nasc = input.nextInt();

        int Idade = 2024 - Nasc;

        if (Nasc < 16) {
            System.out.print("Não vota!");
        } else {
            if ((Nasc >= 16 && Nasc<18) || (Nasc >=70)){
                System.out.print("Voto opcional!");
            } else {
                System.out.print("Obrigatorio!");
            }
        }
    }
}
