package LC;
import java.util.Scanner;
public class count_prime {
public static void main (String args[]) {
    
    Scanner in =new Scanner(System.in);
    int num=in.nextInt();
    int i=2,count=0;
    while(num>i) {
       
        
        if(num%i==0) {
           
           count++;
           
       }
  
   
    i++;
    }
    
    System.out.println(count);
}
}
