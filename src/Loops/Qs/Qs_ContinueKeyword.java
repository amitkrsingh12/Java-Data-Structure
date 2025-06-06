package Loops.Qs;

import java.util.Scanner;
/*
    Display all numbers entered by the user except multiples of 10.
 */
public class Qs_ContinueKeyword
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        do{
            System.out.println("Enter a number");
           int n=in.nextInt();
           if(n%10==0)
           {
               continue;
           }
            System.out.println("Number is  " +n);
        }while(true);
    }
}
