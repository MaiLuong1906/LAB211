package week6;
public class OrderDetail {
    private Fruit fruit;
    private int quantity;
    private double amount;

    public OrderDetail(Fruit fruit, int quantity) {
        this.fruit = fruit;
        this.quantity = quantity;
        this.amount = fruit.getPrice() * quantity;
    }
    public OrderDetail(){}
    public Fruit getFruit() { return fruit; }
    public int getQuantity() { return quantity; }
    public double getAmount() { return amount; }

    public void setFruit(Fruit fruit) {
        this.fruit = fruit;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return String.format("%-20s | %5d | %5.2f$ | %5.2f$", fruit.getName(), quantity, fruit.getPrice(), amount);
    }
}
