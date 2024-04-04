package Projetos.concluidos;

import java.util.Scanner;

public class SalarioComBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome;
        nome = input.nextLine();

        double salario;
        salario = input.nextDouble();

        double bonus;
        bonus = input.nextDouble();

        double salarioFinal = salario + (bonus * 0.15);
        System.out.printf("TOTAL = R$ %.2f%n", salarioFinal);

    }
}


