package exemplos1022;

public class ArtigoCientifico extends  Obra implements Imprimivel{

    private String autores;
    private String revista;
    private String doi;

    public ArtigoCientifico(Integer c, String t, Integer ano, String au,
                            String r, String d){
        super(c, t, ano);
        this.autores = au;
        this.revista = r;
        this.doi = d;
    }

    public String getAutores(){
        return this.autores;
    }

    public String getRevista(){
        return this.revista;
    }

    public String getDoi(){
        return this.doi;
    }

    public void setAutores(String au){
        this.autores = au;
    }

    public void setRevista(String r){
        this.revista = r;
    }

    public void setDoi(String d){
        this.doi = d;
    }

    @Override
    public void imprimirFichaCatalografica(){
        IO.println("Código: "+this.codigo);
        IO.println("Título: "+this.getTitulo());
        IO.println("Autores: "+this.getAutores());
        IO.println("Revista:" +this.getRevista());
        IO.println("DOI: "+this.getDoi());
    }

}
