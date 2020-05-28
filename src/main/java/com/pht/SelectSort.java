package com.pht;

/**
 * 直接选择排序
 * 时间复杂度：
 *
 * 平均情况：O(n^2)
 * 最好情况：O(n^2)
 * 最坏情况：O(n^2)
 * 由此可见这排序可以号称最没效率的排序了。。。
 * 空间复杂度：O(1)
 *
 * 稳定性：不稳定
 */
public class SelectSort {
    public static void main(String[] args) {
        SelectSort s = new SelectSort();
        int  [] num = {1,10,3,5,7,2};
        s.sort(num);
        for(int n :num){
            System.out.println(n);
        }
    }
    public void sort(int [] arr){
        int length = arr.length;
        int min ;
        for (int i = 0; i <length ; i++) {
            min = i;
            for (int j = i+1; j <length ; j++) {
                    if(arr[j]<arr[min]){
                        min = j;
                    }
            }
            if(min != i){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }
}
