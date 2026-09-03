import exemplos0903.Conta;

void main(){

    Conta c1 = new Conta("0101-X", "12102-X", "João");



    //c1.depositar(100.0);
    //c1.depositar(-200.0);
    //c1.depositar(5000.0);
    //c1.sacar(2000.0);
    //c1.saldo = 5000.0; (Não funciona mais)
    IO.println(c1.getSaldo());
}
