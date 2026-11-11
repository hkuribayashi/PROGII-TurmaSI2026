package exemplos1110;

public class ProdutoDigital extends Produto{

    private Double tamanhoArquivo;

    public ProdutoDigital(String codigo, String descricao, Double preco, Double tamanhoArquivo) {
        super(codigo, descricao, preco);
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public Double getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public void setTamanhoArquivo(Double tamanhoArquivo) {
        this.tamanhoArquivo = tamanhoArquivo;
    }
}
