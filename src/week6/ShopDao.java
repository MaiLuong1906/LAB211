package week6;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ShopDao {

    public static List<Fruit> getFruit(){
        List<Fruit> list = new ArrayList<>();
        String sql = "SELECT * FROM Fruit ";
        try{
            Connection con = DBConnect.getConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet set = pstm.executeQuery();
            while(set.next()){
                Fruit fruit = new Fruit();
                fruit.setId(set.getString("ID"));
                fruit.setName(set.getString("NameFruit"));
                fruit.setPrice(set.getDouble("Price"));
                fruit.setQuantity(set.getInt("Quantity"));
                fruit.setOrigin(set.getString("Origin"));

                list.add(fruit);
            }
        }catch (SQLException e){
            System.out.println("Error: "+e.getMessage());
        }
        return list;
    }

    public static List<Order> getOrder(){
        List<Order> list = new ArrayList<>();
        String sql = "SELECT * FROM [Order]";
        try{
            Connection con = DBConnect.getConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet set = pstm.executeQuery();
            while(set.next()){
                Order order = new Order();
                order.setId(set.getInt("ID"));
                order.setCustomerName(set.getString("CustomerName"));
                order.setTotal(set.getDouble("Total"));
                list.add(order);
            }
        }catch (SQLException e){
            System.out.println("Error: "+e.getMessage());
        }
        return list;
    }

    public static void updateStock(String id, int quantity){
        String sql = "UPDATE Fruit SET Quantity = ? WHERE ID = ?";
        try{
            Connection con = DBConnect.getConnection();
            PreparedStatement pstm = con.prepareStatement(sql);

            pstm.setInt(1, quantity);
            pstm.setString(2, id);
            pstm.executeUpdate();
        }catch(SQLException e){
            System.out.println();
        }
    }


}
