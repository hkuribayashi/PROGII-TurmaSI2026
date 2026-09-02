package exemplos0902;

public class Casa {
    public String cor;
    public Porta porta1;
    public Porta porta2;
    public Porta porta3;
    public Pessoa proprietario;

    public Casa(String cCasa, String cPorta, String n, Integer i){
        this.cor = cCasa;
        this.porta1 = new Porta(cPorta);
        this.porta2 = new Porta(cPorta);
        this.porta3 = new Porta(cPorta);
        this.proprietario = new Pessoa(n ,i);
    }

    public void pintar(String novaCorCasa){
        this.cor = novaCorCasa;
    }

    public void pintar(String novaCorCasa, String novaCorPorta){
        this.cor = novaCorCasa;
        this.porta1.pintar(novaCorPorta);
        this.porta2.pintar(novaCorPorta);
        this.porta3.pintar(novaCorPorta);
    }
}
