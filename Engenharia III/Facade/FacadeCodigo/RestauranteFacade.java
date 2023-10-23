class RestauranteFacade {
    private Cozinha cozinha;
    private Pagamento pagamento;
    private Delivery delivery;

    public RestauranteFacade() {
        this.cozinha = new Cozinha();
        this.pagamento = new Pagamento();
        this.delivery = new Delivery();
    }

    public void fazerPedido(String pedido, double quantidade) {
        cozinha.prepararPedido(pedido);
        pagamento.pegarPagamento(quantidade);
        delivery.deliveryPedido(pedido);
        System.out.println("Pedido concluído com sucesso.");
    }
}