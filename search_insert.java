package LC;

import java.util.Scanner;

public class search_insert {
public static void main (String args[]) {
    Scanner in = new Scanner(System.in);
   
    int arr[]= {1,3,5,6,7,8,10,12,15};
    
    int tar=in.nextInt();
    searchInsert(arr,tar);
    
}
public static int searchInsert(int[] arr, int target) {
   int start = 0;
   int end=arr.length-1;
    while(start<=end) {
        int mid = start + (end-start)/2;
        if(arr[mid]==target) {
           return mid;
          
        }
        else if(arr[mid]>target) {
            end=mid-1;
           
            
        }
        else {
            start =mid+1;
            
            
        }
        
    }
    return  start;
}
}