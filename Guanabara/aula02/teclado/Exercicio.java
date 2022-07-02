package aula02.teclado;

public class Exercicio {
   public static void main(String[] args) {
    Teclado t1 = new Teclado();
    t1.cor = "Preto";
    t1.modelo = "Hardline";
    t1.novo();
    t1.status();
    t1.condicao();

    Teclado t2 = new Teclado();
    t2.cor = "Azul";
    t2.modelo = "Razer";
    t2.teclas = 88;
    t2.usado();
    t2.status();
    t2.condicao();
   }
}
