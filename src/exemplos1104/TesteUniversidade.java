import exemplos1104.Departamento;
import exemplos1104.Universidade;

void main(){

    Universidade u1 = new Universidade("Unifesspa");
    u1.criarDepartamento("Faculdade de Sistemas de Informação");

    for (Departamento d: u1.getDepartamentos()){
        IO.println(d.getNome());
    }

    u1 = null;

    u1.getDepartamentos().get(0);

}