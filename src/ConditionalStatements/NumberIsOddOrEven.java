package ConditionalStatements;

import java.util.Scanner;

/*
If Else
 */
public class NumberIsOddOrEven
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to check if it is even or odd ?");
        int n=in.nextInt();
        if(n%2==0)
        {
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }
    }
}
