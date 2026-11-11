package exemplos1111;

public class Conta {

    private Integer numero;
    private Double saldo;
    private final Double limiteTransacao;

    public Conta(Integer numero, Double limiteTransacao){
        this.numero = numero;
        this.saldo = 0.0;
        this.limiteTransacao = limiteTransacao;
    }

    public void depositar(Double quantia) throws LimiteMaximoException, ValorInvalidoException{
        if (quantia > 0){
            if (quantia <= this.limiteTransacao)
                this.saldo += quantia;
            else
                throw new LimiteMaximoException("Limite Máximo: "+this.limiteTransacao);
        }else
            throw new ValorInvalidoException("Quantia de depósito inválido");
    }

    public void sacar(Double quantia) throws SaldoInsuficienteException, ValorInvalidoException{
        if (quantia > 0){
            if (quantia <= this.saldo){
                this.saldo -= quantia;
            }else throw new SaldoInsuficienteException("Saldo: "+this.saldo);
        }else throw new ValorInvalidoException("Quantia de Saque: "+quantia);
    }

    public Integer getNumero() {
        return numero;
    }

    public Double getSaldo() {
        return saldo;
    }
}
