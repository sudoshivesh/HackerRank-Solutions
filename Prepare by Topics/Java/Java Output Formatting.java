import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                if(x>=100)
                System.out.printf("%-15s%-3s\n",s1,x);
                else if(x>=10)
                System.out.printf("%-15s0%-3s\n",s1,x);
                else
                System.out.printf("%-15s00%-3s\n",s1,x);
            }
            System.out.println("================================");

    }
}



