package exemplos1020;

public class Diretor extends Funcionario{

    public Diretor(String nome, Double salario){
        super(nome, salario);
    }


    public Double calcularBonificacao(){
        return this.salario * 0.15;
    }
}
