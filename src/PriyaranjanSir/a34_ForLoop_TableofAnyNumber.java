package PriyaranjanSir;

import java.util.Scanner;

public class a34_ForLoop_TableofAnyNumber
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number whose table you want?");
        int n=in.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(n + " * " + i + " = " + (n*i));
        }
    }
}
