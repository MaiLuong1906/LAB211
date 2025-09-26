/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3.short_1;

import java.util.Arrays;
import view.Untils;
import week3.Sort;

/**
 *
 * @author LENOVO
 */
public class RunShort_1 {
    public static void main(String[] args) {
        int size = Untils.getIntValue("size of array");
        Sort sort = new Sort(size);
        System.out.println("Unsorted Array: "+ Arrays.toString(sort.getArr()));
        sort.runBubbleSort();
        System.out.println("Sorted Array: "+ Arrays.toString(sort.getArr()));
    }
}
