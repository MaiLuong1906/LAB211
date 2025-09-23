/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author LENOVO
 */
public class BMI {
    private double height, weight;
    
    public BMI(double height, double weight){
        this.height = height;
        this.weight = weight;
    }
    public double calBMI(){
        double m = height / 100.0;
        return weight / (m*m);
    }
    public String status(){
        double number = calBMI();
        if(number < 19) return "Under-standard";
        else if(number <= 25) return "Standard";
        else if(number <= 30) return "Overweight";
        else if(number <= 40) return "Fat - should lose weight";
        else return "Very fat - should lose weight immediately";
    }
    public void show(){
        System.out.printf("Number BMI: %.2f\n", calBMI());
        System.out.println("BMI status: " + status());
    }
}
