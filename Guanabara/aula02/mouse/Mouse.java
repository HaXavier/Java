package aula02.mouse;

public class Mouse {
    int botoes;
    String modelo;
    String cor;
    boolean estado;
    boolean click;

    void status(){
        System.out.println("Número de botões " + this.botoes);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Seu estado " + this.estado);
    }

    void click(){
        if (this.estado == true) {
            System.out.println("Está clicando");
        } else { 
            System.out.println("Não está clicando");
        }
    }

    void funciona(){
        this.estado = true;
    }

    void erro(){
        this.estado = false;
    }

}
