package Projetos.concluidos;

public class RepeticaoComTesteNoInicio {
    public static void main(String[] args) {

        //Repetição com FOR
        /* for (int cc = 0; cc <=5; cc++) {
            System.out.println("Número: " + cc);
         */

        int cc = 0;
        while (cc<5) {
            System.out.println("Cambalhota: " + (cc+1)); // o (cc+1) serve para adicionar 1 numero e não começar no 0;
            cc++;
        }
    }
}
