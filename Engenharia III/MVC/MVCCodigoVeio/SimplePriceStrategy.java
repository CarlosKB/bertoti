import java.util.List;

class SimplePriceStrategy implements PriceCalculationStrategy {
    public double calculatePrice(List<MenuItem> items) {
        double totalPrice = 0;
        for (MenuItem item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }
}