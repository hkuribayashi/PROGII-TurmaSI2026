import exemplos1111.Conta;
import exemplos1111.SaldoInsuficienteException;
import exemplos1111.ValorInvalidoException;

import javax.swing.*;

void main(){
    Conta c1 = new Conta(121221, 5000.0);
    Conta c2 = new Conta(121221, 400.0);

    try {
        c1.sacar(6000.0);
    }catch (ValorInvalidoException e){
        // Informar o usuário que o valor de saque é inválido
    }catch (SaldoInsuficienteException e){
        // Informar o usuário que o saldo é insuficiente
    }

    IO.println("Saldo: "+c1.getSaldo());

    try {
        c1.depositar(-5000.0);
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e.getMessage());
    }
    IO.println("Saldo: "+c1.getSaldo());

}