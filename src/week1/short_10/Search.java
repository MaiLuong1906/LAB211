package week1.short_10;

import view.Untils;
import week3.Sort;

import java.util.Arrays;

public class Search {
    private int[] array;

    public Search(int n){
        array = Untils.randomArray(n);
    }
    public Search(){}

    public int runLinearSeach(int x){
        return linearSearch(array, x);
    }

    public int linearSearch(int[] a,int x){
        int found = -1;
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == x){
                found = i;
                break;
            }
            count++;
        }
        System.out.println("So lan lap: "+count);
        return found;
    }

    public int runBinarySearch(int x){
        Sort sort = new Sort();
        sort.quickSort(array, 0, array.length-1);
        System.out.println("Sorted Array: "+Arrays.toString(array));
        return binarySearch(array,x);
    }

    // Nhan vao 1 cai mang a da sort
    public int binarySearch(int[] a, int x){
        int l = 0;
        int r = a.length-1;
        int count = 0;
        while(l <= r){
            int mid = (l+r) / 2;
            count++;
            if(a[mid] == x) return mid;
            if(a[mid] < x) r = mid - 1;
            else l = mid + 1;
        }
        System.out.println("So lan lap: " +count);
        return -1;
    }

    public void show(){
        System.out.println(Arrays.toString(array));
    }
}
