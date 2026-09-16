package exemplos0916;

public class Ponto {

    public Double x;
    public Double y;

    public Ponto(){
        this.x = 0.0;
        this.y = 0.0;
    }

    public Ponto(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    public Double calcularDistancia(Ponto outroPonto){
        Double distancia = Math.pow(this.x - outroPonto.x, 2) +
                                Math.pow(this.y - outroPonto.y, 2);

        return Math.sqrt(distancia);
    }
}