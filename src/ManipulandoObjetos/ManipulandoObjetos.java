package ManipulandoObjetos;

public class ManipulandoObjetos {
    public static Venda Venda = new Venda();
        public static void main(String[] args) {
        ManipulandoObjetos venda1 = new ManipulandoObjetos();
        Venda.produto = "Torta Salgada";
        Venda.quantidade = 25;
        Venda.valorUnitario = 302.50;
        Venda.valorTotal = Venda.quantidade * Venda.valorUnitario;
        System.out.println(Venda.produto);
        System.out.println(Venda.quantidade);
        System.out.println(Venda.valorUnitario);
        System.out.println(Venda.valorTotal);
    }
}