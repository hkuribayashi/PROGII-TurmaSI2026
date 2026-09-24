package exemplos0924;

public class Gerente extends Funcionario{

    private String departamento;

    public Gerente(String nome, Double salario, String departamento){
        super(nome, salario);
        this.departamento = departamento;
    }

    /**
     * @return 12% do valor do salario
     */
    public Double calcularBonificacao(){
        return this.salario * 0.12;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
