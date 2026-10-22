package exemplos1022;

public class Livro extends  Obra implements Imprimivel{

    private String autor;
    private String isbn;
    private Integer numeroPaginas;

    public Livro(Integer c, String t, Integer ano, String a,
                 String i, Integer nP){
        super(c, t, ano);
        this.autor = a;
        this.isbn = i;
        this.numeroPaginas = nP;
    }

    public String getAutor(){
        return this.autor;
    }

    public String getIsbn(){
        return this.isbn;
    }

    public Integer getNumeroPaginas(){
        return this.numeroPaginas;
    }

    public void setAutor(String a){
        this.autor = a;
    }

    public void setIsbn(String i){
        this.isbn = i;
    }

    public void setNumeroPaginas(Integer nP){
        this.numeroPaginas = nP;
    }

    @Override
    public void imprimirFichaCatalografica(){
        IO.println("Código: "+this.getCodigo());
        IO.println("Título: "+this.getTitulo());
        IO.println("Autor: "+this.getAutor());
        IO.println("ISBN: "+this.getIsbn());
        IO.println("Número Páginas: "+this.getNumeroPaginas());
    }

}
