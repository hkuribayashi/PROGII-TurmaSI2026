package exemplos1104;

public class Atleta {

    private String nome;
    private String posicao;

    public Atleta(String n, String p){
        this.nome = n;
        this.posicao = p;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
}
