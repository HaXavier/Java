package aula02.caneta;

public class Caneta {
    String modelo;
    String cor;
    Double ponta;
    int carga;
    boolean tampa;

    void status(){
        System.out.println("É do modelo " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Está tampada? " + this.tampa);
    }

    void rabiscar(){
        if (this.tampa == true) {
            System.out.println("ERRO! Está tampado não posso rabiscar");
        } else {
            System.out.println("Estou rabiscando");
        }
    }

    void tampada(){
        this.tampa = true;
    }

    void destampada(){
        this.tampa = false;
    }

}
