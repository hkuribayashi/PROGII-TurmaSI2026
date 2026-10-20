package exemplos1020;

public class Analista extends Funcionario{

    public Analista(String nome, Double salario){
        super(nome, salario);
    }

    @Override
    public Double calcularBonificacao() {
        return this.salario * 0.11;
    }
}
