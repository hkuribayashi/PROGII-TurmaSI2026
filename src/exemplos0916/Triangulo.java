package exemplos0916;

public class Triangulo {
    public Ponto ponto1;
    public Ponto ponto2;
    public Ponto ponto3;

    public Triangulo(Ponto p1, Ponto p2, Ponto p3){
        this.ponto1 = p1;
        this.ponto2 = p2;
        this.ponto3 = p3;
    }

    public Double calcularPerimetro(){
        Double perimetro = this.ponto1.calcularDistancia(this.ponto2);
        perimetro += this.ponto2.calcularDistancia(this.ponto3);
        perimetro += this.ponto3.calcularDistancia(this.ponto1);
        return perimetro;
    }
}
