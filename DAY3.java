import java.util.Scanner;
public class DAY3 {
    
    public static void main(String[] args){
        
           Scanner sa = new Scanner(System.in);
        System.out.println("enter the value of a  ");
       // here we int seperately insted of int a,b; we can also write int a = sa.nextInt(); and int b = sa.nextInt(); but here we are writing it in different line to make it more clear
        int a = sa.nextInt();
        System.out.println("enter the value of b  ");
        int b = sa.nextInt();
        if (a > b) {
            System.out.println("a is greater than b"    +    a);
        } else {
            System.out.println("b is greater than a"    +   b);
        }
    
     Scanner ind = new Scanner(System.in);
        System.out.println("enter a number to check even or odd  ");
        int num = ind.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " if an evan number");
        } else {
            System.out.println(num + " is an odd number");
        }
        
        Scanner mark = new Scanner(System.in);
        System.out.println("Enter your marks :   ");
        float K = mark.nextFloat();
        if (K >= 90) {
            System.out.println("  Congratulations you got A grade");
        } else if (K >= 80) {
            System.out.println(" Good u got B grade"); 
        } else if (K >= 65)  {
            System.out.println(" Decent you got C grade");
        } else if (K >= 45 )  {
            System.out.println(" better luck next time you got D grade");
        } else {
            System.out.println(" sorry you got F grade");
        
        Scanner tit = new Scanner(System.in);
        System.out.println("enter your first number  ");
        int f1 = tit.nextInt();
        System.out.println("enter your second number  ");
        int f2 = tit.nextInt();
        System.out.println("enter your third number  ");
        int f3 = tit.nextInt();
         
        if (f1 > f2 && f1 > f3) {
            System.out.println(" the Grestest number is  " + f1);
        } else if (f2 > f1 && f2 > f3) {
            System.out.println(" the Grestest number is  " + f2);
        } else {
            System.out.println(" the Grestest number is  " + f3);

        }   
 // ternary
        String laf =
  (f1 > f2 && f1 > f3) ? " the Greatest number is " + f1 : (f2 > f1 && f2 > f3) ? " the Greatest number is " + f2 : (f3 > f1 && f3 > f2) ? " the greatest num is " + f3 : " you enter A number multiple times";
  
  System.out.println(laf);
  
  // much simpler using ternary operator
    

  System.out.println((f1 > f2 && f1 > f3) ? " the Greatest number is " + f1 : (f2 > f1 && f2 > f3) ? " the Greatest number is " + f2 : (f3 > f1 && f3 > f2) ? " the greatest num is " + f3 : " you enter A number multiple times");

    }
    
}
    
}
