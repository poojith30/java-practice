// loops
import java.util.Scanner;
public class DAY4 {
    public static void main(String[] args) {
      int b = 10, a;;
     System.out.println("loop 1 starts");
      while ( b <= 22) {
        System.out.println(b);
        b++;}
 
        Scanner fap = new Scanner(System.in);
        System.out.println("enter the value of a to see magic   ");
        a = fap.nextInt();
        while (a >= 0)  {
            System.out.println(a);
            a--;}


            // to print first 10 natural numbers
int k = 1;
        while (k <= 10) {
            System.out.println(k);
            k++;

        }
      // sum of first n natural numbers
      int l, bum = 0;
      Scanner cum = new Scanner(System.in);
      System.out.println("enter the value of n to find sum of first  n natural numbers  ");
    l = cum.nextInt();
    while (l > 0) {
        bum += l;
        l--; }
        System.out.println("the sum of first  natural numbers is: " + bum);
    
    
    }
    
    }
    

