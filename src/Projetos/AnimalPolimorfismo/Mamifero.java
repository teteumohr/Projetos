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

class Lobo extends Mamifero {
    @Override
    public void emitirSom() {
        System.out.println("Uivando");
    }
}

class Cachorro extends Lobo {
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

    public void reagir(String frase) {
        if (frase.equals("toma comida") || frase.equals("Olá")) {
            System.out.println("Abanar e Latir");
        } else {
            System.out.println("Rosnar");
        }
    }

    public void reagir(int hora, int min) {
        if (hora<12) {
            System.out.println("Abanar - Horário antes das 12hrs");
        } else if (hora>=18) {
            System.out.println("Ignorar - Horário depois das 18hrs");
        } else {
            System.out.println("Abanar e Latir - Horário entre as 12hrs e 18hrs");
        }
    }

    public void reagir(boolean dono) {
        if (dono) {
            System.out.println("Abanar - É o dono");
        } else {
            System.out.println("Rosnar e Latir - Não é o dono");
            this.emitirSom();
        }
    }

    public void reagir(int idade, double peso) {
        if (idade < 5) {
            if (peso < 10) {
                System.out.println("Abanar");
            } else {
                System.out.println("Latir");
                this.emitirSom();
            }
        } else {
            if (peso < 10) {
                System.out.println("Rosnar");
            } else {
                System.out.println("Ignorar");
            }
        }
    }
}
