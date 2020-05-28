package com.pht;

import java.util.Arrays;

/**
 * 冒泡排序
 * 时间复杂度：
 *
 * 平均情况：O(n^2)
 * 最好情况：O(n)
 * 最坏情况：O(n^2)
 * 空间复杂度：O(1)
 *
 */
public class BubbleSort {
    public static void main(String[] args) {
        BubbleSort bu = new BubbleSort();
       Integer [] p= {1,10,3,6,5};
        bu.sort(p);
    }
    public void  sort(Integer [] arr){
        int  length = arr.length;
        int temp = 0;
        int sign = 0;
        for (int i = 0; i <length ; i++) {
            sign= i;
            for (int j = length-1; j>i ; j--) {
                if(arr[j-1] >arr[j]){
                        temp =arr[j-1];
                        arr[j-1] = arr[j];
                        arr[j] = temp;
                        sign =j;
                }
            }
            if(sign == i){
                break;
            }
        }
       Arrays.asList(arr).forEach((num)-> System.out.println(num));
    }
}
