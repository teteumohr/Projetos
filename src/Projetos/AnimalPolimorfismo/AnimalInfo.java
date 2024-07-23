package Projetos.AnimalPolimorfismo;

public class AnimalInfo {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru g = new Canguru();
        Cachorro c = new Cachorro();

        m.setPeso(85.3);
        m.setIdade(2);
        m.setMembros(4);
        m.locomover();
        m.alimentar();
        m.emitirSom();
        System.out.println();

        p.setPeso(0.35);
        p.setIdade(1);
        p.setMembros(0);
        p.locomover();
        p.alimentar();
        p.emitirSom();
        p.soltarBolhar();
        System.out.println();

        a.setPeso(0.89);
        a.setIdade(2);
        a.setMembros(2);
        a.locomover();
        a.alimentar();
        a.emitirSom();
        a.fazerNinho();
        System.out.println();

        g.setPeso(60);
        g.setIdade(7);
        g.setMembros(4);
        g.locomover();
        g.alimentar();
        g.emitirSom();
        g.usarBolsa();
        System.out.println();

        c.setPeso(15);
        c.setIdade(5);
        c.setMembros(4);
        c.locomover();
        c.alimentar();
        c.emitirSom();
        c.enterrarOsso();
        c.abanarRabo();
    }
}
