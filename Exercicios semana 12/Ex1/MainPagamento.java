public class MainPagamento {
    public static void main(String[] args) {
        Pagamento pagamento1 = new CartaoCredito();
        Pagamento pagamento2 = new BoletoBancario();

        pagamento1.realizarPagamento(150.0);
        pagamento2.realizarPagamento(200.0);
    }
}
