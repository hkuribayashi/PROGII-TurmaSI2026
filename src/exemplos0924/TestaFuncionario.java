import exemplos0924.Funcionario;
import exemplos0924.Gerente;

void main(){

    Funcionario f = new Funcionario("Hugo", 1000.0);
    IO.println( f.calcularBonificacao() );

    Gerente g = new Gerente("Julia", 1000.0, "Vendas");
    IO.println( g.calcularBonificacao() );

    Funcionario k = new Gerente("Gabriel", 1000.0, "TI");
    IO.println( k.calcularBonificacao() );


}