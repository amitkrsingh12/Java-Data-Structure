package PriyaranjanSir;

import java.util.Scanner;

public class a21_SwapTwoNumber
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers?");
        int a=in.nextInt();
        int b=in.nextInt();
        System.out.println("Value of a  :"+a);
        System.out.println("Value of b  :"+b);

        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println("Value of a after swap   :"+a);
        System.out.println("Value of b after swap   :"+b);
    }
}
