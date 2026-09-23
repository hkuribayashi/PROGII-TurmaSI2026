import exemplos0923.Cliente;
import exemplos0923.Conta;

import javax.swing.*;

void main(){
    String nomeCliente =
            JOptionPane.showInputDialog("Informe o nome do cliente");
    String emailCliente =
            JOptionPane.showInputDialog("Informe o email do cliente");
    Cliente cliente = new Cliente(nomeCliente, emailCliente);

    String agencia =
            JOptionPane.showInputDialog("Informe a agência do cliente");
    String numero =
            JOptionPane.showInputDialog("Informe o número da conta ");
    Conta c1 = new Conta(agencia, numero, cliente);

    JOptionPane.showMessageDialog(null,"Saldo da conta: " + c1.getSaldo());
}