package Projetos.concluidos;

public class VetorMes {
    public static void main(String[] args) {
        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Set", "Out", "Nov", "Dez"};
        int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int c=0; c<mes.length; c++) {
            System.out.println("O Mês de " + mes[c] + " tem " + tot[c] + " dias ao todo!");
        }
    }
}
