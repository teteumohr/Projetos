package Projetos.Caneta;

public class Caneta {
    // Atributos
    public String modelo;
    public String cor;
    private double ponta;
    protected int carga;
    private boolean tampada;

    // Métodos
    public void status() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Uma caneta: " + cor);
        System.out.println("Ponta: " + ponta);
        System.out.println("Carga: " + carga + "%");
        System.out.println("Está tampada? " + tampada);
    }

    public Caneta(String modelo, String cor, double ponta, int carga, boolean tampada) {
        this.modelo = modelo;
        this.cor = cor;
        this.setPonta(ponta);
        this.setCarga(carga);
        this.setTampada(tampada);
    }
    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPonta() {
        return this.ponta;
    }

    public void setPonta(double ponta) {
        this.ponta = ponta;
    }

    public int getCarga() {
       return this.carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public boolean isTampada() {
        return this.tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
        if (tampada) {
            System.out.println("ERRO! Não posso rabiscar!");
        } else {
            System.out.println("Estou Rabiscando");
        }
    }
}
