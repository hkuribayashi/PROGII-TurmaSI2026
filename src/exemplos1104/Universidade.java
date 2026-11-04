package exemplos1104;

import java.util.ArrayList;
import java.util.List;

public class Universidade {
    private String nome;
    private List<Departamento> departamentos;

    public Universidade(String n){
        this.nome = n;
        this.departamentos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void criarDepartamento(String nome){
        Departamento d = new Departamento(nome);
        this.departamentos.add(d);
    }
}
