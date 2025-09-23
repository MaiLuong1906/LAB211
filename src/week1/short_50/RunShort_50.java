/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1.short_50;

import view.Menu;
import view.Untils;

/**
 *
 * @author LENOVO
 */
public class RunShort_50 extends Menu{
    public RunShort_50(){
        super("Equation Program", new String[]{"Calculate Superlative Equation",
                                               "Calculate Quadratic Equation",
                                               "Exit"});
    }

    @Override
    public void execute(int ch) {
        switch(ch){
            case 1 -> {
                int a = Untils.getIntValue2("A");
                int b = Untils.getIntValue2("B");
                SuperlativeEquation se = new SuperlativeEquation(a, b);
                se.process();
            }
            case 2 ->{
                int a = Untils.getIntValue2("A");
                int b = Untils.getIntValue2("B");
                int c = Untils.getIntValue2("C");
                QuadraticEquation qe = new QuadraticEquation(a, b, c);
                qe.process();
            }
            case 3 ->{
                System.exit(0);
            }
            default -> {
                System.out.println("Input again");
            }
        }
    }
    public static void main(String[] args) {
        RunShort_50 r = new RunShort_50();
        r.run();
    }
}
