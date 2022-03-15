public class Ex04 {

    public static void main(String[] args) {
        
        int idade;

        System.out.println("EXERCÍCIO 04 \n");
        idade = Console.readInt("Digite sua idade:");

        if (idade <= 13){
            System.out.println("Criança");
                
            } else if (idade <= 18) {
                System.out.println("Você é um adolescente");
            
                } else if (idade <= 60) {
                    System.out.println("Você é um adulto");
                
                    } else {
                        System.out.println("Você é idoso");

                    }                                                           

    }
    
}
