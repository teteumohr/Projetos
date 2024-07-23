package Projetos.AnimalPolimorfismo;

public class Reptil extends Animal {
    private String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void emitirSom() {
        super.emitirSom();
        System.out.println("Som de Réptil");
    }

    @Override
    public void alimentar() {
        super.alimentar();
        System.out.println("Comendo Vegetais");
    }

    @Override
    public void locomover() {
        super.locomover();
        System.out.println("Rastejando");
    }
}

class Cobra extends Reptil {

}

class Tartaruga extends Reptil {
    @Override
    public void locomover() {
        System.out.println("Andando beeeem devagar");
    }
}
