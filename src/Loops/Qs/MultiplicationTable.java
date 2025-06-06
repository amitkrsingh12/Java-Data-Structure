package Loops.Qs;

import java.util.Scanner;

public class MultiplicationTable
{
    public static void printMultilpication(int number){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number whose multiplication table you want ?");
        int n=in.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(n + " * " + i + " = " +(n*i));
        }
}
    public static void main(String args[])
    {
        printMultilpication(5);
    }
}
