package aula02.familia;

public class Familia {
    String pais;
    String irmao;
    String tios;
    String animais;
    boolean estado;

    void status(){
        System.out.println("Pais: " + this.pais);
        System.out.println("Irmaos: " + this.irmao);
        System.out.println("Tios: " + this.tios);
        System.out.println("Animais de estimação: " + this.animais);
    }

    void xuxa(){
        if (this.estado == true) {
            System.out.println("Ta vivasso");
        } else {
            System.out.println("Não ta mais entre nós :(");
        }
    }

    void vivo(){
        this.estado = true;
    }

    void morto(){
        this.estado = false;
    }
}
