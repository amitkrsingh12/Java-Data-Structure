package Flowcharts;

import java.util.Scanner;

public class SumofFIrstnNaturalNos
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter natural number ?");
        n=in.nextInt();
        int sum=0;
        for(int i=n;i>0;i--)
        {
            sum=sum+i;
        }
        System.out.println("Sum of first n natural numbers is : " +sum);
    }
}
