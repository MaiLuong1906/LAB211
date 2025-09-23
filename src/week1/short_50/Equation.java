/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1.short_50;

import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public abstract class Equation {
    protected int[] vals;
    public Equation(int... val){
        this.vals = val;
    }
    public abstract String solve();
    
    public boolean isEven(int x){
        return x%2 == 0;
    }
    public boolean isPerfectSquare(int x){
        if(x < 0)return false;
        int sqrt = (int)Math.sqrt(x);
        return sqrt*sqrt == x;
    }
    public void process(){
        ArrayList<Integer> evens = new ArrayList<>();
        ArrayList<Integer> odds = new ArrayList<>();
        ArrayList<Integer> perSquare = new ArrayList<>();
        for(int i = 0; i < vals.length; i++){
            if(isEven(vals[i]))
                evens.add(vals[i]);
            else 
                odds.add(vals[i]);
            if(isPerfectSquare(vals[i]))
                perSquare.add(vals[i]);
        }
        System.out.println(solve());
        printList("Odd", odds);
        printList("Even", evens);
        printList("Perfect Square", perSquare);
    }
    public void printList(String prompt, ArrayList<Integer> list){
        System.out.print("Number is "+ prompt+":");
        for(int x: list){
            System.out.print(x+", ");
        }
        System.out.println("");
    }
    
}
