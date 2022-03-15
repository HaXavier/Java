public class Ex03 {
    
    public static void main(String[] args) {

        double pnum, snum;
        System.out.println("EXERCÍCIO 03\n");

        pnum = Console.readDouble("Primerio número:\n");
        snum = Console.readDouble("Segundo número:\n");

        if(pnum > snum){
            System.out.println(pnum + " é maior que " + snum);
        } else {
            System.out.println(snum + " é maior que " + pnum);
        }


    }     

}
