package exemplos1020;

public class Gerente extends Funcionario{

    private String departamento;

    public Gerente(String nome, Double salario, String departamento){
        super(nome, salario);
        this.departamento = departamento;
    }


    public Double calcularBonificacao(){
        return this.salario * 0.12;
    }
}
