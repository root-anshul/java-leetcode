package LC;
import java.util.Scanner;
public class remove_ele {
public static void main (String args[]) {
   Scanner in =new Scanner (System.in);
   int t=in.nextInt();
   int arr[]=new int[t];
   for(int i =0;i<arr.length;i++) {
       arr[i]=in.nextInt();
   }
   for(int i =0;i<arr.length;i++) {
       System.out.print(arr[i]);
   }
   System.out.println();
   int val=in.nextInt();
   removeElement(arr, val);
   
}
public static int removeElement(int[] nums, int val) {
    int k = 0;
    for(int i = 1; i < nums.length; i++){
        if(nums[i] != nums[i-1]){
            nums[k] = nums[i];
            k++;
            
        }
       
}
   
    return k;
}
}