public class Ex02 {

    public static void main(String[] args) {
        
        double real, dolar, euro, pesoArgentino;

        System.out.println("EXERCÍCIO 02 \n");

        real = Console.readDouble("Digite o valor em R$: ");
        dolar = real / 5.11;
        euro = real / 5.55;
        pesoArgentino = real / 0.04;

        System.out.println("Dólar: " + dolar);
        System.out.println("Euro: " + euro);
        System.out.println("Peso Argentino: " + pesoArgentino);

    }

    
}
