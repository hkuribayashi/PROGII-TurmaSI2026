package exemplos1021;

public abstract class Animal {

    protected String nome;
    protected Double peso;

    public Animal(String nome, Double peso){
        this.nome = nome;
        this.peso = peso;
    }

    public abstract void emitirSom();
}
