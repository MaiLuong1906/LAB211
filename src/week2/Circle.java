/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author LENOVO
 */
public class Circle extends Shape{
    private double rad;
    private double PI = Math.PI;
    public Circle(double rad){
        super("Circle");
        this.rad = rad;
    }
    @Override
    public double getPerimeter() {
        return 2 * PI * rad;
    }

    @Override
    public double getArea() {
        return PI * rad * rad;
    }

    @Override
    public void printResult() {
        System.out.println("-----"+name+"-----");
        System.out.println("Radius: " + rad);
        System.out.printf("Area %.2f\n", getArea());
        System.out.printf("Perimeter: %.1f\n", getPerimeter());
    }
    
}
