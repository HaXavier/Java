package aula02.mouse;

public class Principal {
    public static void main(String[] args) {
        Mouse m1 = new Mouse();
        m1.cor = "Preto";
        m1.modelo = "Razer";
        m1.botoes = 2;
        m1.funciona();
        m1.status();
        m1.click();
    }
}
