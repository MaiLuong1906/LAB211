package week3;

import view.Untils;

import java.util.Arrays;

public class Sort {
    private int[] arr;

    public Sort(int capacity){
        arr = Untils.randomArray(capacity);
    }
    public Sort(){}

    public int[] getArr(){
        return arr;
    }

    public void runBubbleSort(){
        bubbleSort(arr);
    }

    public void bubbleSort(int[] a){
        for (int i = 0; i < a.length -1; i++){
            boolean flag = false;
            for(int j = 0; j <a.length - i - 1; j++){
                if(a[j] > a[j + 1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag) break;
        }
    }

    public void runQuickSort(){
        quickSort(arr, 0, arr.length -1);
    }

    public void quickSort(int[] a, int left, int right){

        //Base case
        if(left >= right)return;

        // Tao key
        int key = a[(left+right)/2];

        //Phan phoi
        int pivot = partition(a, left, right, key);

        //Chia
        quickSort(a, left, pivot -1);
        quickSort(a, pivot, right);
    }

    // Tra ve pivot
    public int partition(int[] a, int left, int right, int key){
        int i = left;
        int j = right;

        while(i <= j){
            while(a[i] < key) i++;
            while(a[j] > key) j--;
            if(i <= j){
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
                i++; j--;
            }
        }
        return i;
    }
}
