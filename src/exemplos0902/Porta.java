package exemplos0902;

public class Porta {
    public Boolean aberta;
    public String cor;
    public Double dimensaoX;
    public Double dimensaoY;
    public Double dimensaoZ;

    public Porta(String cor){
        this.cor = cor;
        this.aberta = false;
        this.dimensaoX = 0.9;
        this.dimensaoY = 2.0;
        this.dimensaoZ = 0.02;
    }

    public Porta(String cor, Double x, Double y, Double z){
        this.cor = cor;
        this.dimensaoX = x;
        this.dimensaoY = y;
        this.dimensaoZ = z;
    }

    public void abrir(){
        this.aberta = true;
    }

    public void fechar(){
        this.aberta = false;
    }

    public void pintar(String novaCor){
        this.cor = novaCor;
    }

    public Boolean estaAberta(){
        return this.aberta;
    }
}
