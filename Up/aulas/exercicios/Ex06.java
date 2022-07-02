import java.util.Random;

public class Ex06 {
    
    public static void main(String[] args) {
        
        int[] valoresRandomicos = new int[1000];
        Random random = new Random();

        System.out.println("EXERCÍCIO 6\n");

        for(int i = 0; i < valoresRandomicos.length; i++){
            valoresRandomicos[i] = random.nextInt(1000);

        }
            for(int i = 0; i < valoresRandomicos.length; i++){
                System.out.print(valoresRandomicos[i] + " ");

            }
        
    }

}
