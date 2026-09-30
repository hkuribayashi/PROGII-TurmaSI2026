import exemplos0930.Funcionario;

Double calcularSalarioMedio(Funcionario[] funcionarios) {
    return 0.0;
}

Double calcularMaiorSalario(Funcionario[] funcionarios){
    return 0.0;
}

Double calcularMenorSalario(Funcionario[] funcionarios){
    return 0.0;
}

void main(){
    Scanner sc = new Scanner(System.in);
    IO.println("Informe a quantidade de Funcionários: ");
    int qtd = sc.nextInt();
    Funcionario[] funcionarios = new Funcionario[qtd];

    /* */

    IO.print("Salário Médio: ");
    IO.println( calcularSalarioMedio( funcionarios ) );

    IO.print("Maior Salário: ");
    IO.println( calcularMaiorSalario( funcionarios ) );

    IO.print("Menor Salário: ");
    IO.println( calcularMenorSalario( funcionarios ) );
}