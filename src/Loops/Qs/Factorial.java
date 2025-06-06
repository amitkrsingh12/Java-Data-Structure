package Loops.Qs;

import java.util.Scanner;

public class Factorial
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number whose factorial you want to calculate?");
        int n=in.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact = fact*i;
        }
        System.out.println(fact);
    }
}
