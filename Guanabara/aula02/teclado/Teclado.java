package aula02.teclado;

public class Teclado {
    int teclas;
    String modelo;
    String cor;
    boolean estado;

    void status(){
        System.out.println("É do modelo " + this.modelo);
        System.out.println("Número de teclas: " + this.teclas);
        System.out.println("Estado: " + this.estado);
        System.out.println("Cor:  " + this.cor);
    }

    void condicao(){
        if (this.estado == true) {
            System.out.println("Teclado novo");
        } else {
            System.out.println("Teclado usado");
        }
    }

    void novo(){
        this.estado = true;
    }

    void usado(){
        this.estado = false;
    }

}
