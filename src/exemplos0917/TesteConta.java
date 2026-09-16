import exemplos0917.Conta;

void main(){
    Conta c1 = new Conta("0101-X", "12102-X", "João");
    c1.depositar(100.0);
    c1.depositar(5000.0);
    c1.sacar(2000.0);
    c1.sacar(9000.0);

}
