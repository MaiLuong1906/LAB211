/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

/**
 *
 * @author LENOVO
 */
public class BubbleSort extends Sort{
    
    public BubbleSort(int capacity){
        super(capacity);
    }

    @Override
    public int[] sort(int[] arr) {
        for(int i = 0; i < size -1; i++){
            boolean flag = false;
            for(int j = 0; j < size - i -1; j++){
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    flag = true;
                }
            }
            if(!flag) break;
        }
        return arr;
    }
}
