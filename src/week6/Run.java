package week6;

import view.Menu;

public class Run extends Menu {
    private FruitShop shop;
    public Run(){
        super("FRUIT SHOP SYSTEM", new String[]{"Create Fruit", "Order Summary", "Shopping (for buyer)","Save data", "Exit"});
        shop = new FruitShop();
        shop.setCheck();
        shop.setCheckOrder();
    }

    @Override
    public void execute(int ch) {
        switch (ch){
            case 1 ->{
                shop.createFruit();
            }
            case 2 ->{
                shop.ordersSummary();
            }
            case 3 ->{
                shop.shopping();
            }
            case 4->{
                shop.saveAllFruit();
                shop.saveAllOrders();
            }
            case 5 ->{
            }
            default -> System.out.println("Enter again");
        }
    }

    public static void main(String[] args) {
        Run o = new Run();
        o.run();
    }

}
