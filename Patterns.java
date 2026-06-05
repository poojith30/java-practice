public class Patterns {


    public static void main(String[] args) {

   // diamond pattern

   int n = 18;
   for (int i = 0; i <= n-1; i++) {
    for (int j = 0; j <= n - i + 1; j++) { // for the spaces
     System.out.print(" ");
   }
   for ( int k = 0; k <= 2*i + 1; k++) { // for the stars
    System.out.print(k);
}
  
System.out.println();
   }
   // for the lower part of the diamond
   for (int i = n-2; i >= 0; i--) {
    for ( int j = 0; j <= n -i + 1; j++) {
        System.out.print(" ");
    }
    for (int k = 0; k <= 2*i + 1; k++) {
        System.out.print(k);
    }
   System.out.println();
   }
// diamond pattern with characters
int N = 19;
   for (int i = 0; i <= N-1; i++) {
    for (int j = 0; j <= N - i + 1; j++) { // for the spaces
     System.out.print(" ");
   }
   for ( int k = 0; k <= 2*i + 1; k++) { // for the stars
    System.out.print((char)(k + 64) + " ");
}
  
System.out.println();
   }
   for (int i = N-2; i >= 0; i--) {
    for ( int j = 0; j <= N -i + 1; j++) {
        System.out.print(" ");
    }
    for (int k = 0; k <= 2*i + 1; k++) {
        System.out.print((char)(k + 64) + " ");
    }
   System.out.println();
   
 

     // pyramid pattern    
   
   
}// pyramid pattern 


int p = 24;
   for (int i = 0; i <= p-1; i++) {
    for (int j = 0; j <= p - i + 1; j++) { // for the spaces
     System.out.print(" ");
   }
   for ( int k = 0; k <= 2*i + 1; k++) { // for the stars
    System.out.print("*");
}
  
System.out.println();
   }
   for (int i = p-2; i >= 0; i--) {
    for ( int j = 0; j <= p -i + 1; j++) {
        System.out.print(" ");
    }
    for (int k = 0; k <= 2*i + 1; k++) {
        System.out.print("*");
    }
   System.out.println();
   }

// butterfly pattern
int m = 25;
for (int i = 1; i <= m; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print("*");
    }
    for (int k = 1; k <= 2*(m - i); k++) {
        System.out.print(" ");
    }
    for (int l = 1; l <= i; l++) {
        System.out.print("*");
    }
    System.out.println();
}

for (int i = m; i >= 1; i--) {
    for (int j = 1; j <= i; j++) {
        System.out.print("*");
    }

    for (int k = 1; k <= 2*(m - i); k++) {
        System.out.print(" ");}

for (int l = 1; l <= i; l++) {
        System.out.print("*");

    }
    System.out.println();
}

// butterfly pattern with characters

for (int i = 1; i <= m; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print((char)(j + 64));
    }
    for (int k = 1; k <= 2*(m - i); k++) {
        System.out.print(" ");
    }
    for (int l = 1; l <= i; l++) {
        System.out.print((char)(l + 64));
    }
    System.out.println();
}

for (int i = m; i >= 1; i--) {
    for (int j = 1; j <= i; j++) {
        System.out.print((char)(j + 64));
    }

    for (int k = 1; k <= 2*(m - i); k++) {
        System.out.print(" ");}

for (int l = 1; l <= i; l++) {
        System.out.print((char)(l + 64));

    }
    System.out.println();
}






}

}







         
   
   

    

