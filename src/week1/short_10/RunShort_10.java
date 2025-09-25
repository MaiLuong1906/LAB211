/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1.short_10;

import view.Untils;


/**
 *
 * @author LENOVO
 */
public class RunShort_10 {
    public static void main(String[] args) {
        int n = Untils.getIntValue("number of array");
        LinearSearch ls = new LinearSearch(n);
        int x = Untils.getIntValue2("number to search");
        int found = ls.linearSearch(x);
        ls.show();
        if(found > 0){
            System.out.println("Found "+ x+ " at "+found+" index.");
        }
        else{
            System.out.println(x+" not found.");
        }
    }

}
