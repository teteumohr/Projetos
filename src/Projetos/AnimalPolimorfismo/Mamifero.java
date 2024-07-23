package Projetos.AnimalPolimorfismo;

public class Mamifero extends Animal {

    private String corPele;

    public String getCorPele() {
        return corPele;
    }

    public void setCorPele(String corPele) {
        this.corPele = corPele;
    }

    @Override
    public void emitirSom() {
        super.emitirSom();
        System.out.println("Som de Mamífero");
    }

    @Override
    public void alimentar() {
        super.alimentar();
        System.out.println("Mamando");
    }

    @Override
    public void locomover() {
        super.locomover();
        System.out.println("Correndo!");
    }
}

class Canguru extends Mamifero {
    public void usarBolsa() {
        System.out.println("Usando bolsa");
    }

    @Override
    public void locomover() {
        System.out.println("Saltando");
    }
}

class Cachorro extends Mamifero {
    @Override
    public void emitirSom() {
        System.out.println("Latindo");
    }

    public void enterrarOsso() {
        System.out.println("Enterrando Osso");
    }

    public void abanarRabo() {
        System.out.println("Abanando o Rabo");
    }
}
