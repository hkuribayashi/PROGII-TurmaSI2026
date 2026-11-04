package exemplos1104;

import java.util.ArrayList;
import java.util.List;

public class Time {

    private String nome;
    private List<Atleta> atletas;

    public Time(String n){
        this.nome = n;
        this.atletas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Atleta> getAtletas() {
        return atletas;
    }

    public void setAtletas(List<Atleta> atletas) {
        this.atletas = atletas;
    }

    public void adicionarAtleta(Atleta a){
        this.atletas.add(a);
    }
}
