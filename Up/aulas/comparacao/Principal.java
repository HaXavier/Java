public class Principal {

    public static void main(String[] args) {
        //Objeto
        //INSTANCIAR =  criar ou construir um objeto
        Livro livroCheio = new Livro();
        Livro livroVazio = new Livro("a", "a", "a", 31);
        //livro.nome = "bolinho delicia";
        //Metdo SET armazena uma informação no atributo do objeto
        livroVazio.setNome("Orientação a Objetos");
        livroVazio.setGenero("Orientando");
        livroVazio.setAutor("Henrique lindo");
        livroVazio.setPagina(32);        
        //Metodo GET sempre retorna uma informação 
        //guardada no atributo do objeto
        System.out.println(livroVazio.getNome());  
        System.out.println(livroVazio.getGenero());
        System.out.println(livroVazio.getAutor());
        System.out.println(livroVazio.getPagina());
        
        System.out.println(livroVazio);
        System.out.println(livroCheio);

    }
    
}
