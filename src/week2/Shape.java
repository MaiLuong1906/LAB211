/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author LENOVO
 */
public abstract class Shape {
    protected String name;
    public Shape(String name){
        this.name = name;
    }
    public abstract double getPerimeter();
    public abstract double getArea();
    public abstract void printResult();
    
}
