package com.pht.search;

/**
 * 顺序查找
 */
public class SequenceSearch {
    public static void main(String[] args) {
        int target = 3;
        int [] arr = {1,3,19,2};
        SequenceSearch  se =new SequenceSearch();
        System.out.println(se.search(arr,target));
    }
    public int search(int [] arr,int target){
        int length  = arr.length;
        for (int i = 0; i <length ; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

}
