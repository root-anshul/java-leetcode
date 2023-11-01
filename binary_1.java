package LC;

import java.util.Arrays;
import java.util.Scanner;

public class binary_1 {
public static void main (String args[]) {
    Scanner in =new Scanner(System.in );
    int t= in.nextInt();
    int arr[]=new int[t];
    for(int i=0;i<arr.length;i++) {
        arr[i]=in.nextInt();
     }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        int key=in.nextInt();
        int start = 0;
        int end=arr.length-1;
         while(start<=end) {
             int mid = start + (end-start)/2;
             if(arr[mid]==key) {
                System.out.println(mid);
               
             }
             else if(arr[mid]>key) {
                 end=mid-1;
                
                 
             }
             else {
                 start =mid+1;
                 
                 
             }
             
         }
      System.out.println(start);
        
}
}

