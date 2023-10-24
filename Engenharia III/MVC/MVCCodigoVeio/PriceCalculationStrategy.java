import java.util.List;

interface PriceCalculationStrategy {
    double calculatePrice(List<MenuItem> items);
}