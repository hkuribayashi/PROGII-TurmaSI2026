package exemplos0930;

public class Diretor extends Funcionario{

    public Diretor(String nome, Double salario) {
        super(nome, salario);
    }

    /**
     * @return Retorna 15% do salário
     */
    @Override
    public Double calcularBonificacao(){
        return this.salario * 0.15;
    }
}
