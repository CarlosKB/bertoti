import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class Order {
    private String orderName;
    private List<MenuItem> items = new ArrayList<>();
    private List<Consumer<String>> orderObservers = new ArrayList<>();

    public Order(String orderName) {
        this.orderName = orderName;
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public double getTotalPrice() {
        return items.stream().mapToDouble(MenuItem::getPrice).sum();
    }

    public void addObserver(Consumer<String> observer) {
        orderObservers.add(observer);
    }

    public void notifyObservers(String message) {
        orderObservers.forEach(observer -> observer.accept(message));
    }
}