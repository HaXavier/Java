package aula02.borrifador;

public class Principal {
    public static void main(String[] args) {
        Borrifador b1 = new Borrifador();
        b1.material = "Plástico";
        b1.quantidade = "500ML";
        b1.liquido = "Lustra Móveis";
        b1.destampado();
        b1.status();
        b1.borrifar();
    }
}
