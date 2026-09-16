package exemplos0903;

public class Conta {

    private String agencia;
    private String numero;
    private String titular;
    private Double saldo;

    public Conta(String agencia, String numero, String titular){
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void sacar(Double valor){
        if (valor > this.saldo){
            throw new RuntimeException("Saldo insuficiente");
        }else if (valor < 0){
            throw new RuntimeException("Valor de saque negativo");
        }else{
            this.saldo -= valor;
        }
    }

    public void depositar(Double valor){
        if (valor > 0)
            this.saldo += valor;
    }

    public Double getSaldo(){
        return this.saldo;
    }

    public String getAgencia(){
        return this.agencia;
    }

    public String getNumero(){
        return this.numero;
    }

    public String getTitular(){
        return this.titular;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
