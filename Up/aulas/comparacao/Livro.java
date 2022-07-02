//Classe de Modelo
 //Atributos ou Propriedades
    /*
        Páginas         -> String
        Autor           -> String
        Editora         -> String
        Nome            -> String
        Genero          -> String
        Data Lançamento -> String
        Edição          -> String
        Material Capa   -> String
        isbn            -> String  
    */    

public class Livro {

    //CONSTRUTOR obs: deve ter o mesmo nome da classe
    public Livro(String nome, String genero, String autor, int pagina){
        this.nome = nome;
        this.genero = genero;
        this.autor = autor;
        this.autor = autor;
    }

    public Livro() {
        System.out.println("Vazio");
    }


    //Propriedade ou atributos sempre privados
    private String nome;
    private String genero;
    private String autor;
    private int pagina;

    //Métodos de acesso aos atributo NOME
    public void setNome(String nome){
        this.nome = nome;
    } 

    public String getNome(){
        return "Livro: " + this.nome;
    }    
    
    //GENERO
    public void setGenero(String genero){
        this.genero = genero;
    }

    public String getGenero(){
        return "Genêro: " + this.genero; 
    }

    //AUTOR
    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getAutor(){
        return "Autor: " + this.autor;
    }

    //PAGINA
    public void setPagina(int pagina){
        this.pagina = pagina;
    }

    
    public String getPagina(){
        return "Paginas: " + this.pagina;
    }

    @Override
    public String toString() {
        return  "\n==== livro ====" +
                "\nNome: " + nome + 
                "\nAutor: " + autor +
                "\nGênero: " + genero +
                "\nPaginas: " + pagina;
    }

    @Override
    public boolean equals(Object obj) {
        
        Livro outroLivro =(Livro) obj;

        System.out.println(outroLivro.getNome());
        System.out.println(getNome());
        System.out.println(outroLivro.getGenero());
        System.out.println(getGenero());

        if(getNome().equals(outroLivro.getNome()) &&
        getGenero().equals(outroLivro.getGenero())){
           return true; 
        } else {
            return false;
        }
        
    }
    // private int somarDoisNumeros(int num1, int num2) {
    //     return num1 + num2;
    // }
    


}
