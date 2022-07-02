package aula02.borrifador;

public class Borrifador {
    String material;
    String quantidade;
    String liquido;
    boolean tampa;

    void status(){
        System.out.println("Material: " + this.material);
        System.out.println("Quantidade: " + this.quantidade);
        System.out.println("Liquido: " + this.liquido);
        System.out.println("Tampa: " + this.tampa);
    } 

    void borrifar(){
        if (this.tampa == true) {
            System.out.println("'BORRIFANDO'");
        } else {
            System.out.println("Sem tampa nâo da pra borrifa");
        }
    }

    void tampado(){
        this.tampa = true;
    }

    void destampado(){
        this.tampa = false;
    }

}
