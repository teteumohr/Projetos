package Projetos.concluidos;

import java.util.Scanner;

public class Diferenca {

    public static void main(String[] args) {
        int A, B, C, D, Resultado;
        Scanner entrada = new Scanner(System.in);

        A = entrada.nextInt();
        B = entrada.nextInt();
        C = entrada.nextInt();
        D = entrada.nextInt();

        Resultado = (A * B - C * D);
        System.out.println("DIFERENCA = " + Resultado);
    }
}