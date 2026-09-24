package exemplos0924;

/**
 * @author Hugo Kuribayashi
 */
public class Funcionario {
    protected String nome;
    protected Double salario;

    public Funcionario(String nome, Double salario) {
        this.validarSalario(salario);
        this.nome = nome;
        this.salario = salario;
    }

    private void validarSalario(Double salario) {
        if (salario <= 0)
            throw new RuntimeException("Erro: Salário Inválido!");
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return this.salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    /**
     * @return 10% do valor do salário
     */
    public Double calcularBonificacao(){
        return this.salario * 0.1;
    }
}
