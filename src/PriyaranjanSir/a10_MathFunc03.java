package PriyaranjanSir;

import java.util.Scanner;

public class a10_MathFunc03
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a,b;
        double r;
        System.out.println("Enter value of a and b ?");
        a=in.nextInt();
        b=in.nextInt();
        r=Math.sqrt(Math.pow(a+b,3));
        System.out.println("Result : " +String.format("%2f",r));
    }
}
