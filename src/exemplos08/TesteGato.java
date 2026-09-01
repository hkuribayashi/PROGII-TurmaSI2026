import exemplos08.Gato;
import exemplos08.Tutor;

void main(){
    Gato x = new Gato("Sushi");
    x.dormir();
    x.tutor = new Tutor("Hugo", 3892832);
    IO.println("Nome: "+x.tutor.nome);
    IO.println("Telefone"+x.tutor.telefone);

    Gato y = new Gato("Cachaça", 20, false);
    y.tutor = new Tutor("Mario", 3892832);
    y.comer();
    y.dormir();

    Gato z = new Gato("Luke", "Joana", 29832);
    IO.println(z.tutor.nome);

}