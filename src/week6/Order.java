package week6;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private int id;
    private String customerName;
    private List<OrderDetail> items = new ArrayList<>();
    private double total;

    public Order(String customerName, int id) {
        this.customerName = customerName;
        this.id = id;
        total = 0;
    }
    public Order(){}
    public void addDetail(OrderDetail od) {
        items.add(od); total += od.getAmount();
    }
    public String getCustomerName() { return customerName; }
    public List<OrderDetail> getDetails() { return items; }
    public double getTotal() { return total; }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setItems(List<OrderDetail> items) {
        this.items = items;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Customer: ").append(customerName).append("\n");
        sb.append("|   |      Product       | Qty |  Price | Amount\n");
        int i = 1;
        for (OrderDetail od : items) {
            String s = String.format("|%-3d|%-20s|%-5d|%-7.2f$|%.2f$",i++, od.getFruit().getName(), od.getQuantity(), od.getFruit().getPrice(), od.getAmount());
            sb.append(s+"\n");
        }
        sb.append("Total: ").append(String.format("%.2f$", total)).append("\n");
        return sb.toString();
    }
}