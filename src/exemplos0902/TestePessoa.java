import exemplos0902.Pessoa;

void main(){
    Pessoa p1 = new Pessoa("João", 21);
    p1.fazAniversario();
    p1.fazAniversario();

    IO.println(p1.nome);
    IO.println(p1.idade);
}