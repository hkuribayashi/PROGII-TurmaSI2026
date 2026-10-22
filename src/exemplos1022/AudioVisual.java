package exemplos1022;

public class AudioVisual extends  Obra{

    private String diretor;
    private Integer duracao;
    private String formato;

    public AudioVisual(Integer c, String t, Integer ano, String d, Integer du,
                       String f){
        super(c, t, ano);
        this.diretor = d;
        this.duracao = du;
        this.formato = f;
    }

    public String getDiretor(){
        return this.diretor;
    }

    public Integer getDuracao(){
        return this.duracao;
    }

    public String getFormato(){
        return this.formato;
    }

    public void setDiretor(String d){
        this.diretor = d;
    }

    public void setDuracao(Integer du){
        this.duracao = du;
    }

    public void setFormato(String f){
        this.formato = f;
    }

    public void executarMidia(){
        IO.println("A mídia está sendo executada...");
    }
}
