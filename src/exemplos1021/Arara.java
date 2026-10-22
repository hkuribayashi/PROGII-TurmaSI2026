package exemplos1021;

public class Arara extends Ave implements CapacidadeVoar{

    public Arara(String nome, Double peso){
        super(nome, peso);
    }

    @Override
    public void emitirSom(){
        IO.println("arara falando...");
    }

    @Override
    public void voar(){
        IO.println("arara voando....");
    }
}
