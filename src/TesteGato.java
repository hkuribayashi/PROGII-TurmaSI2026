
void main(){
    Gato x = new Gato();
    x.nome = "Sushi";
    x.qtdComidaDisponivel = 10;
    x.sono = true;
    x.dormir();
    x.tutor = new Tutor();
    x.tutor.nome = "Hugo";
    x.tutor.telefone = "12209320933";

    Gato y = new Gato();
    Tutor h = new Tutor();
    y.tutor = h;

    y.tutor.nome = "Hugo";
    y.tutor.telefone = "12209320933";
}