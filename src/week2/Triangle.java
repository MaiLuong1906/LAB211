/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author LENOVO
 */
public class Triangle extends Shape{
    private double sideA, sideB, sideC;
    public Triangle(double a, double b, double c){
        super("Triangle");
        sideA = a;
        sideB = b;
        sideC = c;
    }
    
    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        double rs = p * (p - sideA) * (p - sideB) * (p - sideC);
        return Math.sqrt(rs);
    }

    @Override
    public void printResult() {
        System.out.println("-----"+name+"-----");
        System.out.println("Side A: " + sideA);
        System.out.println("Side B: " + sideB);
        System.out.println("Side C: " + sideC);
        System.out.printf("Area %.2f\n", getArea());
        System.out.printf("Perimeter: %.1f\n", getPerimeter());
    }
}
