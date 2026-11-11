package exemplos1110;

public class SistemaLoja {

    public static void main() {

        Cliente c1 = new Cliente("Hugo", "12802839", "suh@gmail");

        Pedido p = new Pedido(2938289, "10/11/2026", c1);

        Produto pr1 = new Produto("X11", "Mouse", 100.0);
        ProdutoDigital pd1 = new ProdutoDigital("X12", "Livro", 10.0, 1.0);

        p.adicionarItem( pr1, 10 );
        p.adicionarItem( pd1, 1  );

    }
}
