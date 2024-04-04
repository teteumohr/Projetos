package Projetos.concluidos;

import java.util.Scanner;

public class Media3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        double m = (n1 + n2) /2;
        System.out.print(m);

        if ( m >= 6) {
            System.out.println("Parabéns");
        }
        else {
            System.out.println("Reprovou");
        }
    }
}
