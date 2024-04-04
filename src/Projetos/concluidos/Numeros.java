package Projetos.concluidos;

import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {

        //variáveis
        int n, s=0;
        String resp;

        Scanner teclado = new Scanner(System.in);

        //métodos e atributos
        do {
            System.out.print("Digite um número: ");
            n = teclado.nextInt();

            s += n; // s = s + n;

            System.out.print("Quer continuar? [S/N]");
            resp = teclado.next();

        } while(resp.equals("S")); // Repito o processo sempre que a resposta for S
        System.out.println("A soma de todos os valores é " + s);
    }
}