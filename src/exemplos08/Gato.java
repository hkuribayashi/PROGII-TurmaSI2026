package exemplos08;

public class Gato {
    public String nome;
    public Integer qtdComidaDisponivel;
    public Boolean sono;
    public  Tutor tutor;

    public Gato(String nome, Integer qtdComidaDisponivel, Boolean sono){
        this.nome = nome;
        this.qtdComidaDisponivel = qtdComidaDisponivel;
        this.sono = sono;
    }

    public Gato(String nome){
        this.nome = nome;
        this.qtdComidaDisponivel = 10;
        this.sono = true;
    }

    public Gato(String nomeGato, String nomeTutor, Integer telefone) {
        this.nome = nomeGato;
        this.qtdComidaDisponivel = 10;
        this.sono = true;
        this.tutor = new Tutor(nomeTutor, telefone);
    }


    public void dormir(){
        this.sono = false;
    }

    public void comer(){
        this.qtdComidaDisponivel = this.qtdComidaDisponivel - 1;
        this.sono = true;
    }
}