class FoodItem implements MenuItem {
    private String name;
    private double price;

    public FoodItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void display() {
        System.out.println(name + " - R$" + price);
    }
}