package aula02.caneta;

public class Aula02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5;
        c1.carga = 90;
        c1.modelo = "Bic";
        c1.destampada();
        c1.status();
        c1.rabiscar();

        Caneta c2 = new Caneta();
        c2.modelo = "Faber";
        c2.cor = "Preta";
        c2.tampada();
        c2.status();
        c2.rabiscar();
        }
}
