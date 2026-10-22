package exemplos1022;

public abstract class Obra {

    protected Integer codigo;
    protected String titulo;
    protected Integer anoPublicacao;

    public Obra(Integer c, String t, Integer a){
        this.codigo = c;
        this.titulo = t;
        this.anoPublicacao = a;
    }

    public Integer getCodigo(){
        return this.codigo;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public Integer getAnoPublicacao(){
        return this.anoPublicacao;
    }

    public void setCodigo(Integer c){
        this.codigo = c;
    }

    public void setTitulo(String t){
        this.titulo = t;
    }

    public void setAnoPublicacao(Integer a){
        this.anoPublicacao = a;
    }
}
