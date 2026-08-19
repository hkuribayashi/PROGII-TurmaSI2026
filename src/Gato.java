public class Gato {
    String nome;
    Integer qtdComidaDisponivel;
    Boolean sono;
    Tutor tutor;

    void dormir(){
        sono = false;
    }

    void comer(){
        qtdComidaDisponivel = qtdComidaDisponivel - 1;
        sono = true;
    }
}