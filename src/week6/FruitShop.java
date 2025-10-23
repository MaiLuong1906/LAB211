package week6;
import view.Untils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;

public class FruitShop {

    private List<Fruit> fruits = ShopDao.getFruit();
    private List<Order> orders = ShopDao.getOrder();
    private Set<String> check = new HashSet<>();
    private Set<Integer> checkOrder = new HashSet<>();

    public void setCheck(){
        for(Fruit f: fruits){
            check.add(f.getId());
        }
    }
    public void setCheckOrder(){
        for(Order o: orders){
            checkOrder.add(o.getId());
        }
    }
    public void showFruits() {
        System.out.println("Danh muc kho :");
        System.out.println("| Item  |      Fruit Name      |    Origin    |   Price   | Quantity |");
        int i = 1;
        for (Fruit f : fruits) {
            System.out.printf("| %-5d | %-20s | %-12s | %-8.2f$ | %-9d| \n",
                    i++, f.getName(), f.getOrigin(), f.getPrice(), f.getQuantity());
        }
    }

    public void createFruit(){
        while(true){
            String id = Untils.getValue("Fruit ID");
            if(check.contains(id)){
                System.out.println("ID already exits");
                continue;
            }
            String name = Untils.getValue("Fruit name");
            double price = Untils.getDouble1("Price");
            int quantity = Untils.getIntValue("Quantity");
            String origin = Untils.getValue("Origin");
            fruits.add(new Fruit(id, name, price, quantity, origin));
            check.add(id);
            break;
        }
    }

    public void shopping() {
        String name = Untils.getName("Name customer");
        Order order = new Order(name, checkOrder.size()+1);
        checkOrder.add(checkOrder.size()+1);
        while(true) {
            showFruits();
            String nameFruit = Untils.getValue("Your select").trim();
            boolean check = false;
            for (int i = 0; i < fruits.size(); i++) {
                if (fruits.get(i).getName().equalsIgnoreCase(nameFruit)) {
                    check = true;
                    int quantity = Untils.getIntValue("Quantity");
                    int stock = fruits.get(i).getQuantity();
                    if (stock < quantity) System.out.println("Out of stock");
                    else {
                        stock -= quantity;
                        fruits.get(i).setQuantity(stock);
                        ShopDao.updateStock(fruits.get(i).getId(), stock);
                        OrderDetail orderD = new OrderDetail(fruits.get(i), quantity);
                        order.addDetail(orderD);
                        orders.add(order);
                        break;
                    }
                }
            }
            if (!check) {
                System.out.println("Invalid name fruit !!!");
            }
            System.out.println("Do you want to continue(Y/N)");
            String s = Untils.getYOrN();
            if(s.equalsIgnoreCase("Y"))continue;
            else {
                System.out.println(order);
                break;
            }
        }
    }

    public void viewOrders() {
        System.out.println("danh sach chi tiet mua hang :");
        for (Order o : orders) {
            System.out.println(o);
        }
    }

    public void ordersSummary(){
        System.out.println("Order List: ");
        for(Order order: orders){
            System.out.println();
            System.out.println("Customer: "+ order.getCustomerName());
            System.out.println("Total: "+ order.getTotal()+"$");
        }
    }

    //Luu hoa don qua DB
    public void saveAllOrders() {
        String sql = "INSERT INTO [Order] (ID, CustomerName, Total) VALUES (?, ?, ?)";
        try {
            Connection con = DBConnect.getConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            for (Order order : orders) {
                pstm.setInt(1, order.getId());
                pstm.setString(2, order.getCustomerName());
                pstm.setDouble(3, order.getTotal());
                pstm.addBatch();
            }
            pstm.executeBatch();
            System.out.println("Save list orders !!!");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    //Luu list fruit vao DB
    public void saveAllFruit(){
        String sql = "INSERT INTO Fruit (ID, NameFruit, Price, Quantity, Origin) VALUES (?, ?, ?, ?, ?)";
        try{
            Connection con = DBConnect.getConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            for(Fruit fruit: fruits){
                pstm.setString(1, fruit.getId());
                pstm.setString(2, fruit.getName());
                pstm.setDouble(3, fruit.getPrice());
                pstm.setInt(4, fruit.getQuantity());
                pstm.setString(5, fruit.getOrigin());
                pstm.addBatch();
            }
            pstm.executeBatch();
            System.out.println("Save list fruits !");
        }catch(SQLException e){
            System.out.println();
        }
    }

}