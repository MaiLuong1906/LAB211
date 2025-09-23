/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.Scanner;
import week2.Circle;
import week2.Rectangle;
import week2.Triangle;

/**
 *
 * @author LENOVO
 */
public class Untils {
    public static Scanner sc = new Scanner(System.in);
    
    // Nhap 1 chuoi String
    public static String getValue(String prompt){
        System.out.print("Enter "+prompt+" :");
        return sc.nextLine();
    }
    
    // Nhap 1 gia tri int > 0
    public static int getIntValue(String prompt){
        while(true){
        try{
            int val = Integer.parseInt(getValue(prompt));
            if(val <= 0)
            {
                System.out.println(prompt+" must > 0");
                continue;
            }
            return val;
        }catch(Exception e){
            System.out.println("Please input number");
            System.out.println("Enter again");
        }
        }
    }
    
    // Nhap 1 gia tri int
    public static int getIntValue2(String prompt){
        while(true){
            try{
            int val = Integer.parseInt(getValue(prompt));
            return val;
        }catch(NumberFormatException e){
            System.out.println("Please input number");
        }
        }
    }
    
    // Nhap co so: 2-10-16
    public static int getNumberBase(String prompt){
        while(true){
            try{
                int val = getIntValue(prompt);
                if(val != 2 && val != 10 && val != 16)throw new Exception("Number base not valid. The number base valid is 2-10-16");
                return val;
            }catch(Exception e){
                System.out.println(e);
                System.out.println("Enter again");
            }
        }
    }
    
    // Nhap 1 so double > 0
    public static double getDouble1(String prompt){
        while(true){
            try{
                double bmi = Double.parseDouble(getValue(prompt));
                if(bmi <= 0){
                    System.out.println(prompt+" must > 0");
                    continue;
                }
                return bmi;
            }catch(Exception e){
                System.out.println(prompt+" is digit");
            }
        }
    }
    
    // Nhap 1 so double
    public static double getDoubleValue(String prompt){
        while(true){
            try{
                double val = Double.parseDouble(getValue(prompt));
                return val;
            }catch(Exception e){
                System.out.println("Please input number.");
            }
        }
    }
    
    // Nhap toan tu : +, -, *, /, ^, =
    public static char getOperator(String prompt){
        while(true){
            char operator = getValue(prompt).charAt(0);
            if(operator != '+' && operator != '-' && operator != '*' && operator != '/' && operator != '^' && operator != '='){
                System.out.println("Please input (+, -, *, /, ^)");
                continue;
            }
            return operator;
        }
    }
    
    public static Triangle inputTriagle() {
        while(true){
        double sideA = getDouble1("side A of Triangle");
        double sideB = getDouble1("side B of Triangle");
        double sideC = getDouble1("side C of Triangle");
        if(sideA + sideB < sideC || sideA + sideC < sideB || sideB + sideC < sideA){
            System.out.println("Invalid side of Triangle(sideA + sideB >= sideC or ....)");
            continue;
        }
        Triangle triangle = new Triangle(sideA, sideB, sideC);
        return triangle;
        }
    }
    
    public static Rectangle inputRetangle(){
        double width = Untils.getDouble1("width of rectangle");
        double length = Untils.getDouble1("Length of rectangle");
        Rectangle rectangle = new Rectangle(width, length);
        return rectangle;
    }
    
    public static Circle inputCircle(){
        double radius = Untils.getDouble1("radius of Circle");
        Circle circle = new Circle(radius);
        return circle;
    }
    
    
}
