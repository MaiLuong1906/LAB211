/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;
import week2.short_61.Circle;
import week2.short_61.Rectangle;
import week2.short_61.Triangle;

/**
 *
 * @author LENOVO
 */
public class Untils {
    public static Scanner sc = new Scanner(System.in);
    public static LocalDate now = LocalDate.now();
    public static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    // Nhap 1 chuoi String
    public static String getValue(String prompt){
        System.out.print(prompt+": ");
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

    // Nhap kich thuoc hinh tam giac
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

    // Nhap kich thuoc hinh tam giac
    public static Rectangle inputRetangle(){
        double width = Untils.getDouble1("width of rectangle");
        double length = Untils.getDouble1("Length of rectangle");
        Rectangle rectangle = new Rectangle(width, length);
        return rectangle;
    }

    // Nhap kich thuoc hinh tam giac
    public static Circle inputCircle(){
        double radius = Untils.getDouble1("radius of Circle");
        Circle circle = new Circle(radius);
        return circle;
    }
    
    // Lay 1 mang ngau nhien
    public static int[] randomArray(int capacity){
        int[] arr = new int[capacity];
        Random random = new Random();
        for(int i = 0; i < capacity; i++){
            arr[i] = random.nextInt(10);
        }
        return arr;
    }

    // Nhập 1 chuỗi kèm với độ dài quy định
    public static String inputWith(String prompt, int length){
        while(true){
            System.out.print(prompt+": ");
            String val = sc.nextLine();
            if(val.length() > length) {
                System.out.println("Data input is  invalid");
                System.out.println(prompt+" no more than "+length+" character");
                continue;
            }
            return val;
        }
    }

    // 1 chuỗi ID có n chữ số
    public static String inputID(String prompt, int n){
        while(true){
            String val = getValue(prompt);
            if(!val.matches("\\d{" + n + "}")){
                System.out.println("ID is a "+n+" digits ");
                continue;
            }
            return val;
        }
    }

    public static long getNumberWith(String prompt, int length){
        while(true){
            try{
                long val = Long.parseLong(inputWith(prompt, length));
                return val;
            }catch(Exception e){
                System.out.println(prompt+" is number "+length+" digit");
            }
        }
    }

    public static double inputScore(String prompt){
        while(true){
            try{
                System.out.print(prompt + ": ");
                double val = Double.parseDouble(sc.nextLine());
                if(val < 0 || val > 100){
                    System.out.println("Entrance English score is from 0 to 100");
                    continue;
                }
                return val;
            }catch(Exception e){
                System.out.println("Please input digit values.");
            }
        }
    }

    public static int getIntWith(String prompt, int left, int right){
        while(true){
            try{
                System.out.print(prompt + ": ");
                int val = Integer.parseInt(sc.nextLine());
                if(val > right || val < left){
                    System.out.println(prompt+" must between "+left+" and "+ right);
                }
                return val;
            }catch(Exception e){
                System.out.println("Please input digit");
            }
        }
    }

    public static int getYear(String prompt){
        int check = now.getYear();
        while(true){
            try{
                System.out.print(prompt+": ");
                int year = Integer.parseInt(sc.nextLine());
                if(year > check){
                    System.out.println(prompt+ " must be before current year");
                    continue;
                }
                return year;
            }catch(Exception e){
                System.out.println("Please input digit!");
            }
        }
    }

    public static String getName(String prompt){
        while(true){
            System.out.print(prompt+": ");
            String name = sc.nextLine();
            if(!checkName(name)){
                System.out.println(prompt+" is alphabet and blanks");
                continue;
            }
            return name;
        }
    }

    public static boolean checkName(String name){
        for(int i = 0; i < name.length(); i++){
            if(!Character.isAlphabetic(name.charAt(i)) && name.charAt(i) !=' ')return false;
        }
        return true;
    }

}
