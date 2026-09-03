package exemplos0902;

import java.time.LocalDate;

public class Pessoa {

    public String nome;
    public Integer idade;

    public Pessoa(String nome, Integer i){
        this.nome = nome;
        this.idade = i;
    }

    public Pessoa(String nome, String dataNascimento){
        this.nome = nome;

        // "03/09/2026" -> "03", "09", "2026"
        String[] partes = dataNascimento.split("/");

        // partes[0] -> "03"
        // partes[1] -> "09"
        // partes[2] -> "2026"
        int anoNascimento = Integer.parseInt(partes[2]);
        int anoAtual = LocalDate.now().getYear();
        this.idade = anoAtual - anoNascimento;
    }

    public void fazAniversario(){
        this.idade++;
    }
}
