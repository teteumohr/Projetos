package Projetos.AnimalPolimorfismo;

public class Peixe extends Animal {
    private String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        super.locomover();
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        super.alimentar();
        System.out.println("Comendo substâncias");
    }

    @Override
    public void emitirSom() {
        super.emitirSom();
        System.out.println("Peixe não faz som");
    }

    public void soltarBolhar() {
        System.out.println("Soltou uma bolha");
    }
}

class Goldfish extends Peixe {

}
