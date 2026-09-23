package exemplos0917;

public class Conta {

    private String agencia;
    private String numero;
    private String titular;
    private Double saldo;

    public Conta(String agencia, String numero, String titular){
        this.validarAgencia(agencia);
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0;
    }

    private void validarAgencia(String agencia){
        String[] partes = agencia.split("-");
        if (partes[0].length() != 4 || partes[1].length() != 1)
            throw new RuntimeException("Erro: Agência Inválida!");
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

}
