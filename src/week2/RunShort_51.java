/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

import view.Menu;
import view.Untils;

/**
 *
 * @author LENOVO
 */
public class RunShort_51 extends Menu{
    public RunShort_51(){
        super("Calculator Program", new String[]{"BMI Calculator",
                                                 "Normal Calculator",
                                                 "Exit"});
    }

    @Override
    public void execute(int ch) {
        switch(ch){
            case 1 -> {
                double weight = Untils.getDouble1("Weight(kg)");
                double height = Untils.getDouble1("Height(cm)");
                BMI bmi = new BMI(height, weight);
                bmi.show();
            }
            case 2 -> {
                double val1 = Untils.getDoubleValue("Number");
                NormalCalculator nc = new NormalCalculator(val1);
                while(true){
                    char operator = Untils.getOperator("Operator");
                    if(operator == '='){
                        nc.show("Result");
                        return;
                    }
                    double val2 = Untils.getDoubleValue("Number");
                    try {
                        nc.cal(operator, val2);
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }
                    nc.show("Memory");
                }
            }
        }
    }
    public static void main(String[] args) {
        RunShort_51 r = new RunShort_51();
        r.run();
    }
}
