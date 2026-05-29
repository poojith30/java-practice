import java.util.Scanner;
public class DAY1{
    public static void main(String[] args){
        System.out.println("Hello user");
        System.out.println("Good morning"); 
 
        System.out.println("*****");
        int a,b;
        a=10;
        b=20;
       
        System.out.println(a);
        System.out.println(a+b);
        String w = "good";
        String x = "night";
       String king = w+x;
       System.out.println(king);
     System.out.println(w+x);
     System.out.println("Hi");
     // we have to use x: for direct print
     // not needed for indirct print
    

     Scanner jack = new Scanner(System.in);
        System.out.print("enter your name  ");
        king = jack.nextLine();
    System.out.println(king);
    
     int p,q;

     Scanner in = new Scanner(System.in);
        System.out.print("enter the value of p q ");
        p = in.nextInt();
        q = in.nextInt();
        System.out.println("the sum of p and q is " + (p+q));

        int r,s;
       Scanner pat = new Scanner(System.in);
        System.out.print("enter the value of r and s pls  ");
       // Int should be captal I 

        r = pat.nextInt();
        s = pat.nextInt();
System.out.println("the product of r and s is " + (r*s));
    
int R;
Scanner cum = new Scanner(System.in);
System.out.print("enter the value of radius to find Area of a circle   ");
R = cum.nextInt();
System.out.println(" the area of circle is  " + (3.14*R*R));


int H,B,L;
Scanner lamp = new Scanner(System.in);
System.out.print("enter three numbers to find avg of that numbers   ");
H = lamp.nextInt();
B = lamp.nextInt();
L = lamp.nextInt();
System.out.println("the average of of numbers you entered is " + (H+B+L)/3);

int X;
Scanner pamp = new Scanner(System.in);
System.out.print("enter side of sqare to find area of sqare   ");
X = pamp.nextInt();
System.out.println("the area of square is " + (X*X));

// adv problem

float  bat, ball, wicket;
Scanner famp = new Scanner(System.in);
System.out.print(" enter the price of bat  ball and wicket to find total price   ");
bat = famp.nextFloat();
ball = famp.nextFloat();
wicket = famp.nextFloat();
System.out.println("the total price of ball bat wicket with 19% gst is   " + (ball + bat + wicket + 0.19*(ball = bat = wicket)));


;


        

    }
}