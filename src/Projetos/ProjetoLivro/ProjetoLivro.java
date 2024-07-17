package Projetos.ProjetoLivro;

public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Matheus", 24, "Masculino");
        p[1] = new Pessoa("Maria", 18, "Feminino");

        l[0] = new Livro("Harry Potter", "Disnay", 420, p[0]);
        l[1] = new Livro("POO", "Guanabara", 200, p[1]);
        l[2] = new Livro("The 100", "Fox", 350, p[0]);

        l[0].abrir();
        l[0].folhear(50);
        l[0].avancarPag();

        System.out.println(l[0].detalhes());
    }
}
