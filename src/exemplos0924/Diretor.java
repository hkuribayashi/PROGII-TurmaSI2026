package exemplos0924;

public class Diretor extends Funcionario{

    public Diretor(String nome, Double salario){
        super(nome, salario);
    }

    /**
     * @return 15% do salário
     */
    @Override
    public Double calcularBonificacao(){
        return this.salario * 0.15;
    }

}
