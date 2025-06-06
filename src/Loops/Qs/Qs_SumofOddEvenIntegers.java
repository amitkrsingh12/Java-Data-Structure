package Loops.Qs;
/*
Write a program that reads a set of integers,and then prints the sum of the even and odd integers
 */
import java.util.Scanner;

public class Qs_SumofOddEvenIntegers
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        int evenSum=0,oddSum=0;
        int choice;
        do{
            System.out.println("Enter number ?");
            int n=in.nextInt();
            if(n%2==0){
                evenSum+=n;
            }else{
                oddSum+=n;
            }
            System.out.println("Do you want to continue?? Press 1 for yes.");
            choice=in.nextInt();
        }while(choice==1);
        System.out.println("Sum of even Nos : "+evenSum);
        System.out.println("Sum of odd nos  : "+oddSum);
    }
}
