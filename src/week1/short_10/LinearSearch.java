/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1.short_10;

import view.Untils;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author LENOVO
 */
public class LinearSearch {
    private int[] array;

    public LinearSearch(int n){
        array = Untils.randomArray(n);
    }

    public int linearSearch(int x){
        int found = -1;
        for(int i = 0; i < array.length; i++){
            if(array[i] == x){
                found = i;
                break;
            }
        }
        return found;
    }

    public void show(){
        System.out.println(Arrays.toString(array));
    }

    }
