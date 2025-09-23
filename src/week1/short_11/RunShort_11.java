/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1.short_11;

import view.Menu;
import view.Untils;

/**
 *
 * @author LENOVO
 */
public class RunShort_11 extends Menu{
    public RunShort_11(){
        super("Number Base Converter Program", 
                                  new String[]{"Convert number", "Exit"});
    }

    @Override
    public void execute(int ch) {
        switch(ch){
            case 1 -> {
                String input = Untils.getValue("input number");
                int baseIn = Untils.getNumberBase("base input(2-10-16)");
                int baseOut = Untils.getNumberBase("base output(2-10-16)");
                BaseConverter bs = new BaseConverter(input, baseIn, baseOut);
                try {
                    String rs = bs.toOutBase();
                    System.out.printf("%s (%d) -> %s (%d)\n", input, baseIn, rs, baseOut);
                } catch (Exception ex) {
                    System.out.println("Error: " + ex.getMessage());
                }
            }
            case 2 -> {
                System.exit(0);
            }
            default ->
                System.out.println("Input again");
        }
    }
    public static void main(String[] args) {
        RunShort_11 r = new RunShort_11();
        r.run();
    }
}
