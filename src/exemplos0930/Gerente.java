package exemplos0930;

public class Gerente extends Funcionario{

    private String departamento;

    public Gerente(String nome, Double salario, String departamento){
        super(nome, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    /**
     * @return Retorna 12% do salário
     */
    @Override
    public Double calcularBonificacao(){
        return this.salario * 0.12;
    }

    @Override
    public String toString(){
        return super.toString() + "\nDepartamento: " + this.departamento;
    }
}
