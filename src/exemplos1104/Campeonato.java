import exemplos1104.Atleta;
import exemplos1104.Time;

void main(){

    Atleta a1 = new Atleta("marta", "Atacante");
    Atleta a2 = new Atleta("Arrascaeta", "Meia");

    Time t1 = new Time("Flamengo");
    t1.adicionarAtleta(a1);
    t1.adicionarAtleta(a2);

    for (Atleta a: t1.getAtletas()){
        IO.println(a.getNome() +"  - Posição: "+a.getPosicao());
    }

    t1 = null;
    IO.println(t1);

    IO.println(a1.getNome());
    IO.println(a2.getNome());


}