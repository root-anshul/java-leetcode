package LC;
import java.util.Scanner;
public class next_greater_1 {
public static void main(String args[]) {
    Scanner in =new Scanner (System.in);

    int t=in.nextInt();
   int arr[]=new int[t];
   for(int i=0;i<arr.length;i++) {
       arr[i]=in.nextInt();
   }
   
        for(int i=0;i<arr.length;i++ ) {
         
            for(int j=i;j<arr.length;j++) {
               
                if(arr[i]<arr[j+1]) {
                        System.out.print(arr[j]+" ");
                    
                }
                
              
                
            }
        }


    
}


}
