package exemplos1020;

public class Sistema4{

    private static Double totalDeBonificacoes = 0.0;
    private static Funcionario[] funcionarios = new Funcionario[10];

    public static Double calcularSomaBonificacoes(Funcionario[] funcionarios){
        return 0.0;
    }

    public static void main(String[] args){
        funcionarios[0] = new Gerente("Hugo", 1000.0, "vendas");
        funcionarios[1] = new Analista("Julia", 1000.0);
        funcionarios[2] = new Diretor("Gabriel", 1000.0);

        Double soma = calcularSomaBonificacoes(funcionarios);
        IO.println("Soma das Bonificações: "+ soma);
    }
}
