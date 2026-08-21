public class Gato {
    String nome;
    Integer qtdComidaDisponivel;
    Boolean sono;
    Tutor tutor;

    Gato(String nome, Integer qtdComidaDisponivel, Boolean sono){
        this.nome = nome;
        this.qtdComidaDisponivel = qtdComidaDisponivel;
        this.sono = sono;
    }

    Gato(String nome){
        this.nome = nome;
        this.qtdComidaDisponivel = 10;
        this.sono = true;
    }

    Gato(String nomeGato, String nomeTutor, Integer telefone) {
        this.nome = nomeGato;
        this.qtdComidaDisponivel = 10;
        this.sono = true;
        this.tutor = new Tutor(nomeTutor, telefone);
    }


        void dormir(){
        this.sono = false;
    }

    void comer(){
        this.qtdComidaDisponivel = this.qtdComidaDisponivel - 1;
        this.sono = true;
    }
}