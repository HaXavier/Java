package aula02.familia;

public class Principal {
    public static void main(String[] args) {
        Familia f1 = new Familia();
        f1.pais = "Sergio e Claudia";
        f1.irmao = "Duda";
        f1.tios = "Juarez";
        f1.animais = "Leitão";
        f1.vivo();
        f1.status();
        f1.xuxa();
    }
}
