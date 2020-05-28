package com.pht.search;

/**
 * 数组有序
 * 二分查找
 */
public class BinarySearch {
    public static void main(String[] args) {
        int [] num = {1,3,5,7,8,19};
        BinarySearch b =new BinarySearch();
        System.out.println(b.search(num,7));
    }
    public int search(int [] arr,int target){
        int start =0;
        int end  = arr.length-1;
        int mid;
        while(start<=end){
             mid=(start+end)>>>1;
             if(arr[mid]>target){
                 end = mid-1;
             }else if(arr[mid] <target){
                 start = mid+1;
             }else {
                 return mid;
             }
        }
        return -1;
    }
}
