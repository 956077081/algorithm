package com.pht;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        BubbleSort bu = new BubbleSort();
       Integer [] p= {1,10,3,6,5};
        bu.sort(p);
    }
    public void  sort(Integer [] arr){
        int  length = arr.length;
        int temp = 0;
        for (int i = 0; i <length ; i++) {
            for (int j = length-1; j>i ; j--) {
                if(arr[j-1] >arr[j]){
                        temp =arr[j-1];
                        arr[j-1] = arr[j];
                        arr[j] = temp;
                }
            }
        }
       Arrays.asList(arr).forEach((num)-> System.out.println(num));
    }
}
