/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

import view.Untils;

import java.util.Random;

/**
 *
 * @author LENOVO
 */
public abstract class Sort {
    protected int[] arr;
    protected int size;
    
    public Sort(int capacity){
        arr = Untils.randomArray(capacity);
        this.size = capacity;
    }

    public int[] getArr(){
        return arr;
    }
    public abstract int[] sort(int[] arr);
}
