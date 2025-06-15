package PriyaranjanSir;

import java.util.Scanner;

public class a17_ConditionalOperator
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int marks;
        System.out.println("Enter marks?");
        marks=in.nextInt();
        System.out.println("Result :    "+(marks>50?"Pass":"Fail"));
    }
}
