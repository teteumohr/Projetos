package Projetos.Caneta;

public class Caneta2 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("Bic", "Vermelha", 0.5, 50, true);
        c1.status();
        System.out.println(" ");

        Caneta c2 = new Caneta("Cib", "Azul", 1.0, 10, false);
        c2.status();
    }
}
