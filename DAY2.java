public class DAY2 {
    public static void main(String[] args){
       // unary operator
       
       int a  = 23;
        a++; // this is called post increment, in this line a will be there
        System.out.println(a);
       
        int h = 12;
        int b = h++;
        System.out.println(b); // here b is 12 bcz in b line h is still 12, after that h will be 13
        System.out.println(h); // here h is 13 bcz in h line h is 13
        
        int k = ++h; // this is called pre increment, in this line h will be 14 and k will be 14
        System.out.println(k); // here k is 14 bcz in k line h is 13, after that h will be 14
       
        // conditin is same for decrement also --

  //   relational operator
    int x = 10;
     System.out.println(x++ == x);// false bcz only till x++ is 10 but after that x will be 11
                                  // from now on x is 11
     System.out.println(x); // 
    
       x++;
       System.out.println(x); // here x is 12 bcz in x line x is 11, after that x will be 12
     System.out.println(x > 11);
     
     int A = 15;
     A += 5; // this is called compound assignment operator, it is same as A = A + 5
     System.out.println(A);
     float b1 = 67;
     System.out.println(b1);       
       
     // conditions
     int K = 10, L = 20;
     if (K>L) {
       System.out.println("k is greater than L");
     } else {
        System.out.println("L is greater than K");
     }
    }
}
