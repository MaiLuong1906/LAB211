/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2.short_61;

/**
 *
 * @author LENOVO
 */
public class Rectangle extends Shape{
    private double width, length;
    
    public Rectangle(double a, double b){
        super("Rectangle");
        width = a;
        length = b;
    }
    @Override
    public double getPerimeter() {
        return (width + length) * 2;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public void printResult() {
        System.out.println("-----"+name+"-----");
        System.out.println("Width " + width);
        System.out.println("Length: " + length);
        System.out.printf("Area %.2f\n", getArea());
        System.out.printf("Perimeter: %.1f\n", getPerimeter());
    }
    
}
