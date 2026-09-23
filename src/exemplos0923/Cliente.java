package exemplos0923;

public class Cliente {

    private String nome;
    private String email;

    public Cliente(String nome, String email){
        this.validarEmail(email);
        this.nome = nome;
        this.email = email;
    }

    private void validarEmail(String email){
        if (!email.contains("@"))
            throw new RuntimeException("Email informado é inválido: "+email);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}