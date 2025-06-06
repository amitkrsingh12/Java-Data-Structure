package Loops;

import java.util.Scanner;

public class ReverseNumber
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int num;
        System.out.println("Enter a number ?");
        num=in.nextInt();
        int rev=0;
        while(num!=0)
        {
            int digit =num%10;
            rev =rev*10 +digit;
            num/=10;
        }
        System.out.println(rev);
    }
}
