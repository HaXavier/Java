public class ComparacaoObjeto {
    public static void main(String[] args) {
        
        Livro livro1 =  new Livro();
        Livro livro2 = new Livro();

        livro1.setNome("Orientação a Objetos");
        livro1.setGenero("Orientando");

        livro2.setNome("Orientação a Objetos");
        livro2.setGenero("Programação");

        if(livro1.equals(livro2)){
            System.out.println("verdade");
        } else {
            System.out.println("falso");
        }

    }
}
