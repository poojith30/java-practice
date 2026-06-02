
// SUM OF DIGITS
 public class  DAY5 {
    public static void main(String[] args) {
        int dum = 156;
        int sum = 0;

        int lastdigit  = dum%10;
        sum += lastdigit;

        dum /= 10;
        lastdigit  = dum%10;
        sum += lastdigit;

        dum /= 10;
        lastdigit = dum%10;
        sum += lastdigit;

        dum /= 10;
        lastdigit = dum%10;
        sum += lastdigit;
        
        System.out.println("the sum of digits is  " + sum);
          
        
        
        // SAME USING while loop 
            int num = 156;
            int sum1 = 0;
            while (num>0) {
                int lastdigit1 = num%10;
                sum1 += lastdigit1;
                num /= 10;
            }
            System.out.println("the sum of digits using while loop is  " + sum1);
   // to find a reverse of num, it is vey similar to above process;
    int num1 = 156;
    int reversed = 0;
    while (num1 > 0) {
        int lastdigit2 = num1%10;
        reversed = reversed*10 + lastdigit2;
        num1 /= 10;
    }
    System.out.println("the reverse of the number is  " + reversed);

     

// printing first n numbers feom 1 to 8
int n = 1;
do {
    System.out.println(n);
    n++;
}  while (n <= 8);

}
}
