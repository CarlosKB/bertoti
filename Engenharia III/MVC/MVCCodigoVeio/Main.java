public class Main {
    public static void main(String[] args) {
        // Criando itens de comida
        MenuItem item1 = new FoodItem("Pizza Margherita", 12.99);
        MenuItem item2 = new FoodItem("Hambúrguer", 9.99);

        // Criando um pedido
        Order order = new Order("Meu Pedido");
        order.addItem(item1);
        order.addItem(item2);

        // Estratégia para cálculo do preço do pedido
        double totalPrice = order.getTotalPrice();
        System.out.println("Preço total: R$" + totalPrice);

        // Notificar observadores sobre o status do pedido usando Consumer
        order.addObserver(message -> System.out.println("Status do pedido: " + message));
        order.notifyObservers("Pedido pronto para entrega");
    }
}