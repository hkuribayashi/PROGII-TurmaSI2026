package exemplos1110;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private Integer numero;
    private String data;
    private Cliente cliente;
    private List<ItemPedido> itens;

    public Pedido(Integer numero, String data, Cliente cliente) {
        this.numero = numero;
        this.data = data;
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Produto p, Integer q){
        this.itens.add( new ItemPedido(p, q) );
    }

    public Double calcularTotal(){
        Double total = 0.0;
        for (ItemPedido ip: this.itens){
            total += ip.calcularSubtotal();
        }
        return total;
    }


}
