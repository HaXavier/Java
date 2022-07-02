package aula03.caneta;

public class Caneta {
    public String modelo;
    public String cor;
    private Double ponta;
    protected int carga;
    private boolean tampa;

    public void status(){
        System.out.println("É do modelo " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Está tampada? " + this.tampa);
    }

    public void rabiscar(){
        if (this.tampa == true) {
            System.out.println("ERRO! Está tampado não posso rabiscar");
        } else {
            System.out.println("Estou rabiscando");
        }
    }

    public void tampada(){
        this.tampa = true;
    }

    public void destampada(){
        this.tampa = false;
    }

}
