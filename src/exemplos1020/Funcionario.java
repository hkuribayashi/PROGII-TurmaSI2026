package exemplos1020;

public abstract class Funcionario {

    protected String nome;
    protected Double salario;

    public Funcionario(String nome, Double salario) {
        this.validarSalario(salario);
        this.nome = nome;
        this.salario = salario;
    }

    private void validarSalario(Double salario) {
        if (salario <= 0) {
            throw new SalarioInvalidoException(salario.toString());
        }
    }

    public String getNome() {
        return this.nome;
    }

    public Double getSalario() {
        return this.salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(Double salario) {
        validarSalario(salario);
        this.salario = salario;
    }

    /**
     * @return Retorna 10% do valor do salário
     */
    public abstract Double calcularBonificacao();

    @Override
    public String toString() {
        return "Nome: "+this.nome+
                "\nSalario: "+this.salario+
                "\nBonificação: "+this.calcularBonificacao();
    }
}