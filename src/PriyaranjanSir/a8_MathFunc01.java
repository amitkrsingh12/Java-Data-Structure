package PriyaranjanSir;

import java.util.Scanner;

public class a8_MathFunc01
{
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        int n;
        double r;
        System.out.println("Enter any number?");
        n=in.nextInt();
        r=Math.sqrt(n);
        System.out.println("Square root of " + n + " is " +r);
    }
}
