import java.util.*;
import java.io.*;
class Solution{
    
    class BITS { //you can also use Enumeration
        public static final int BYTE = 8;
        public static final int SHORT = 16;
        public static final int INT = 32;
        public static final int LONG = 64;
    };
       
    public static void main(String []argh)
    {
        
        //interval of signed integers coded on n bits is : [-2^(n - 1), 2^(n - 1) - 1]
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        
        for (int i = 0; i < t; i++)
        {

            try {
                long x = sc.nextLong();
                
                if ((- Math.pow(2, BITS.LONG - 1) <= x && x <= Math.pow(2, BITS.LONG - 1) - 1)) {
                    System.out.println(x + " can be fitted in:");
                }
                else {
                    throw new Exception();
                }

                if (- Math.pow(2, BITS.BYTE - 1) <= x && x <= Math.pow(2, BITS.BYTE - 1) - 1) { //8 signed bit
                    System.out.println("* byte"); 
                }
                if (- Math.pow(2, BITS.SHORT - 1) <= x && x <= Math.pow(2, BITS.SHORT - 1) - 1) { 
                    System.out.println("* short"); 
                }
                if (- Math.pow(2, BITS.INT - 1) <= x && x <= Math.pow(2, BITS.INT - 1) - 1) {                                 System.out.println("* int"); 
                }
                if (- Math.pow(2, BITS.LONG - 1) <= x && x <= Math.pow(2, BITS.LONG - 1) - 1) {
                    System.out.println("* long"); 
                }
            }
            catch (Exception e) {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
