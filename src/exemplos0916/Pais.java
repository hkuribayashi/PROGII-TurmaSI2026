package exemplos0916;

public class Pais {
    public String codigo; //BRA
    public String nome; //Brasil
    public Integer populacao; //População (Número de Habitantes)
    public Double dimensao; //Dimensão Territorial (km2)

    public Pais(String codigoPais, String nomePais,
                        Integer populacaoPais, Double dimensaoPais){
        this.codigo = codigoPais;
        this.nome = nomePais;
        this.populacao = populacaoPais;
        this.dimensao = dimensaoPais;
    }

    public Double calcularDensidadePopulacional(){
        return this.populacao/this.dimensao;
    }
}
