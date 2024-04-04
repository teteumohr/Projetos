package Projetos.concluidos;

import java.util.Arrays;

public class VetorForInt {
    public static void main(String[] args) {
        int num [] = {3, 5, 1, 8, 4};
        Arrays.sort(num); // serve para colocar o vetor em ordem
        for (int valor: num) {
            System.out.println("O Numero do valor é " + valor);
        }
        int p = Arrays.binarySearch(num, 3);// serve para achar a posição do vetor
        System.out.println("Encontrei o valor na posição " + p);
    }
}
