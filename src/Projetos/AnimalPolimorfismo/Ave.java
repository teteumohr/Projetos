package Projetos.AnimalPolimorfismo;

public class Ave extends Animal{
    private String corPena;

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    @Override
    public void locomover() {
        super.locomover();
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        super.alimentar();
        System.out.println("Comando frutas");
    }

    @Override
    public void emitirSom() {
        super.emitirSom();
        System.out.println("Som da ave");
    }

    public void fazerNinho() {
        System.out.println("Construiu um ninho");
    }
}

class Arara extends Animal {

}