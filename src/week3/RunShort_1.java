/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

import java.util.Arrays;
import view.Untils;

/**
 *
 * @author LENOVO
 */
public class RunShort_1 {
    public static void main(String[] args) {
        int size = Untils.getIntValue("size of array");
        BubbleSort bub = new BubbleSort(size);
        int arr[] = bub.randomArray();
        System.out.println("Unsorted array: "+ Arrays.toString(arr));
        System.out.println("Sorted array : "+ Arrays.toString(bub.sort(arr)));
    }
}
