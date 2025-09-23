/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

import java.util.Random;

/**
 *
 * @author LENOVO
 */
public abstract class Sort {
    protected int[] arr;
    protected int size;
    
    public Sort(int capacity){
        arr = new int[capacity];
        this.size = capacity;
    }
    
    public int[] randomArray(){
        Random random = new Random();
        for(int i = 0; i < size; i++){
            arr[i] = random.nextInt(10);
        }
        return arr;
    }
    
    public abstract int[] sort(int[] arr);
}
