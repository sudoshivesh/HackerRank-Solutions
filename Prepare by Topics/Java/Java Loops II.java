import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++)
        {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();   
            int sum = a + b; // First term
            System.out.print(sum);
            System.out.print(" ");
            for (int j = 1; j < n; j++){
                sum = sum + b * (int) Math.pow(2,j);
                System.out.print(sum);
                System.out.print(" ");
            }
            System.out.println();
        }
        scan.close();
    }
}
