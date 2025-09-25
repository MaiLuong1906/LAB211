/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2.short_61;

import view.Untils;

/**
 *
 * @author LENOVO
 */
public class RunShort_61 {
    public static void main(String[] args) {
        System.out.println("=====Calculator Shape Program=====");
        
        //Input
        
        Rectangle rectangle = Untils.inputRetangle();
        Circle circle = Untils.inputCircle();
        Triangle triangle = Untils.inputTriagle();
        
        // Output
        
        rectangle.printResult();
        circle.printResult();
        triangle.printResult();
    }
}
