import exemplos0916.Ponto;
import exemplos0916.Triangulo;

void main(){
    Ponto p1 = new Ponto(1.0, 2.0);
    Ponto p2 = new Ponto(3.0, 4.0);
    Ponto p3 = new Ponto(5.0, 6.0);

    Triangulo triangulo = new Triangulo(p1, p2, p3);

    IO.println("Perimetro do Triangulo:");
    IO.println(triangulo.calcularPerimetro());
}