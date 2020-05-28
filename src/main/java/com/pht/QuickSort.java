package com.pht;

/**
 *
 * 快速排序
 * 平均情况：O(nlogn)
 * 最好情况：O(nlong)
 * 最坏情况：O(n^2)
 * https://blog.csdn.net/code_AC/article/details/74158681?utm_medium=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-1.nonecase&depth_1-utm_source=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-1.nonecase
 */
public class QuickSort {
    public static void main(String[] args) {
        int [] nums = {1,10,3,2,5};
        QuickSort q = new QuickSort();
        q.sort(0,nums.length-1,nums);
        for (int n: nums ) {
            System.out.println(n);
        }
    }
    public void sort(int left ,int right ,int [] arr ){
        if(left>= right){
           return;
        }
        int start = left;
        int end = right;
        int flag = left;
        while(left <  right){
            while((left<right)&&arr[right] >arr[flag]){
                right--;
            }
            if(arr[right] <arr[flag]){
                int temp = arr[right];
                arr[right] = arr[flag];
                arr[flag]  =temp;
                flag =right;
            }
            while((left <right)&&arr[left] < arr[flag]){
                left++;
            }
            if(arr[left]>arr[flag]){
                int temp = arr[flag];
                arr[flag] =arr[left];
                arr[left] = flag;
                flag=left;
            }
            sort(start,left-1,arr);
            sort(left+1,end,arr);
        }
    }
}
