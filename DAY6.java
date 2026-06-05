import java.util.Scanner;
public class DAY6 {
 public static void main( String[] args) {
     
 int n = 10;
 for (int k = 1; k <= n; k++) {
    for (int p = 1 ; p<= 10; p++)

        {
            System.out.println(k + " x " + p + "= " + (k*p));
          System .out.println();
        }
 }

Scanner bc = new Scanner(System.in);
System.out.println("Enter the value of number to find its table");
int tukn = bc.nextInt();
for ( int k = 1; k <= 10 ; k++) {
 } for (int p = 1; p <= 10; p++) {
        System.out.println(tukn + " x " + p + " = " + (tukn*p));
        System.out.println();
    }

// inverted star pattern
 int Y = 5;
for (int i = 1; i <= Y; i++)  {

 for (int k = 1; k <= i - 1; k++) {
    System.out.print(" ");
}
 for (int p = 1; p <= Y - i + 1; p++) {
    System.out.print("*");
 }
    System.out.println();
 }

 int x = 7;
 for (int i = 1; i <= x; i++) {
    for ( int Z = 1; Z <= i - 1; Z++) {
        System.out.print(Z);
    }
for ( int w = 1; w <=  x - i + 1; w++) {
    System.out.print(""); 

}
System.out.println();

}

// character pattern  A = 65

int a = 27;
for ( int i = 1; i <= a; i++) {
    for ( int o = 1; o <= i - 1; o++) {
        System.out.print((char)(o + 64) + " ");

    }
System.out.println();
}

}
}











