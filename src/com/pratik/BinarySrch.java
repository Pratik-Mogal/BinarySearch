package com.pratik;

public class BinarySrch {
    public static void main(String[] args){
        int[] arr = { -18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45};
        int target = 456;
        int ans =binarysearch(arr, target);
        System.out.println(ans);

    }
    //creating function : return the index
    static int binarysearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            //find the middle element
            //int mid = (start +end) /2 ; problem is int has fixed size so
            //after some amount value of integer we can put the value of integer
           //So might be possible that (start + end) exceeds the range of integer in java
            int mid = start + ( end - start )/2;
            if(target < arr[mid]){
                end = mid -1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                //ans found
                return mid;
            }
        }
        return -1;  //if nothing is exucuted this line will be exucuted
    }

}
