package week3.short_4;

import view.Untils;
import week3.Sort;

import java.util.Arrays;

public class RunShort_4 {
    public static void main(String[] args) {
        int size = Untils.getIntValue("Number of array");
        Sort sort = new Sort(size);
        System.out.println("Unsorted Array: "+ Arrays.toString(sort.getArr()));
        sort.runQuickSort();
        System.out.println("Sorted Array: "+ Arrays.toString(sort.getArr()));
    }
}
