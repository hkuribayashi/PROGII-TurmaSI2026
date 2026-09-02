package exemplos0902;

public class Pessoa {

    public String nome;
    public Integer idade;

    public Pessoa(String nome, Integer i){
        this.nome = nome;
        this.idade = i;
    }

    public Pessoa(String nome, String dataNascimento){
        this.nome = nome;
        //this.idade = ??;
    }

    public void fazAniversario(){
        this.idade++;
    }
}
